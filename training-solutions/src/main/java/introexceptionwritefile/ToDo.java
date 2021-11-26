package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> toDoList = new ArrayList<>();
        String todo;
        do {
            System.out.println("Adja meg a következő teendőt! Kilépés: x billentyűvel.");
            todo = scanner.nextLine();
            if (!"x".equals(todo)) {
                toDoList.add(todo);
            }
        } while (!"x".equals(todo));
        try {
            Files.write(Paths.get("src/main/resources/todos.txt"), toDoList);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
