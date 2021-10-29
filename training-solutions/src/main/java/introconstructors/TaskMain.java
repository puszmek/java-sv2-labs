package introconstructors;

public class TaskMain {

    public static void main(String[] args) {

        Task task = new Task("Book", "to read a book");
        System.out.println("Title: " + task.getTitle() + " - " + task.getDescription());
        task.start();
        System.out.println("Start date and time: " + task.getStartDateTime());
        task.setDuration(120);
        System.out.println("Duration: " + task.getDuration());
    }
}
