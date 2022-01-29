package optional.course;

public class Course {

    private String name;
    private int price;
    private Level level;

    public Course(String name, Level level, int price) {
        this.name = name;
        this.level = level;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Level getLevel() {
        return level;
    }
}
