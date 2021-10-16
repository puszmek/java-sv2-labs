package classstructuremethods;

public class Note {

    private String name = "John Doe";

    private String topic = "Java";

    private String text = "Java is a programming language. Java is used to develop mobile apps, web apps, desktop apps, games and much more.";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNoteText() { return name + ": (" + topic + ") " + text; }

}
