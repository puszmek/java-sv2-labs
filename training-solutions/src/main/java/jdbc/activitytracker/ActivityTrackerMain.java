package jdbc.activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ActivityTrackerMain {

    public static void main(String[] args) {

        List<Activity> activities = new ArrayList<>(); // példányosíts pár Activity példányt
        Activity activity1 = new Activity(LocalDateTime.of(2022, 2, 5, 16, 20), "kerékpározás", ActivityType.BIKING);
        activities.add(activity1);
        Activity activity2 = new Activity(LocalDateTime.of(2022, 2, 10, 14, 30), "futás", ActivityType.RUNNING);
        activities.add(activity2);
        Activity activity3 = new Activity(LocalDateTime.of(2022, 2, 16, 15, 15), "túrázás", ActivityType.HIKING);
        activities.add(activity3);

        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUserName("activitytracker");
//            dataSource.setPassword("activitytracker");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach DataBase!", sqle);
        }

        ActivityTrackerMain main = new ActivityTrackerMain();
        main.saveActivities(dataSource, activities); // a példányosított Activity példányok értékét szúrd be az activities táblába
        List<Activity> allActivities = main.listAllActivities(dataSource); // példányosíts egy List<Activity> listát, amit feltöltesz a lekérdezett(kérdezd le az összes rekordot az activities táblából) adatok alapján
        for (Activity actual : allActivities) { // Hívd meg ezt a metódust a main() metódusban, az előzőleg elkészített metódus által visszaadott listában szerepelő Activity-k id-jával ciklusban!
            main.findActivityById(dataSource, actual.getId()); // Írj egy másik metódust, mely paraméterül kap egy id-t és az alapján betölt egy Activity-t!
        }
    }

    private void saveActivities(DataSource dataSource, List<Activity> activities) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, description, activity_type) values (?, ?, ?)")) {
            for (Activity actual : activities) {
                stmt.setTimestamp(1, Timestamp.valueOf(actual.getStartTime()));
                stmt.setString(2, actual.getDescription());
                stmt.setString(3, actual.getType().toString());
                stmt.executeUpdate();
            }
        }
        catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert!", sqle);
        }
    }

    private List<Activity> listAllActivities(DataSource dataSource) {
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from activities")) {
            return listActivities(rs);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query!", sqle);
        }
    }

    private List<Activity> listActivities(ResultSet rs) throws SQLException {
        List<Activity> activities = new ArrayList<>();
        while (rs.next()) {
            long foundId = rs.getInt("id");
            LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
            String description = rs.getString("description");
            ActivityType type = ActivityType.valueOf(rs.getString("activity_type"));
            activities.add(new Activity(foundId, startTime, description, type));
        }
        return activities;
    }

    private Optional<Activity> findActivityById(DataSource dataSource, long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where id = ?;")) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            return getResult(rs);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query!", sqle);
        }
    }

    private Optional<Activity> getResult(ResultSet rs) throws SQLException {
        if (rs.next()) {
            long foundId = rs.getInt("id");
            LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
            String description = rs.getString("description");
            ActivityType type = ActivityType.valueOf(rs.getString("activity_type"));
            Activity activity = new Activity(foundId, startTime, description, type);
            rs.close();
            return Optional.of(activity);
        } else {
            rs.close();
            return Optional.empty();
        }
    }
}
