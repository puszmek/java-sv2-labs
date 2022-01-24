package collectionsqueue.todolist;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ToDoList {

    private List<ToDo> todos = new ArrayList<>();

    public List<ToDo> getTodos() {
        return todos;
    }

    public Deque<ToDo> getTodosInUrgencyOrder() {
        Deque<ToDo> list = new ArrayDeque<>();
        for (ToDo actual : todos) {
            if (actual.isUrgent()) {
                list.addFirst(actual);
            } else {
                list.addLast(actual);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.getTodos().add(new ToDo("Wash dishes", false));
        toDoList.getTodos().add(new ToDo("Check-in to flight", true));
        toDoList.getTodos().add(new ToDo("Water the plants", false));
        toDoList.getTodos().add(new ToDo("Call the dentist", true));
        toDoList.getTodos().add(new ToDo("Take out recycling", false));
        Deque<ToDo> list = toDoList.getTodosInUrgencyOrder();
        System.out.println(list);
        System.out.println(list.pop());
    }
}
