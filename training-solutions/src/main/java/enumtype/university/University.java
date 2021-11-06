package enumtype.university;

public enum University {

    ELTE("Eötvös Loránd Tudományegyetem"), SZTE("Szegedi Tudományegyetem"), BME("Budapesti Műszaki és Gazdaságtudományi Egyetem");

    private String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
