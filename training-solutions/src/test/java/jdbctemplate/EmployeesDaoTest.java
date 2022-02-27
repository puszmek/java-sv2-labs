package jdbctemplate;

import org.flywaydb.core.Flyway;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesDaoTest {

    private EmployeesDao employeesDao;

    @Before
    void init() {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUserName("root");
//        dataSource.setPassword("root");
        }  catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach DataBase!", sqle);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        employeesDao = new EmployeesDao(dataSource);
    }

    @Test
    void testCreate() {
        assertEquals(1, employeesDao.createEmployee("Jill Doe"));
        assertEquals(List.of("Jill Doe"), employeesDao.listEmployeeNames());
        assertEquals(2, employeesDao.createEmployee("Jack Doe"));
        assertEquals(List.of("Jill Doe", "Jack Doe"), employeesDao.listEmployeeNames());
    }

    @Test
    void testFindById() {
        assertEquals("John Doe", employeesDao.findEmployeeNameById(employeesDao.createEmployee("John Doe")));
    }
}