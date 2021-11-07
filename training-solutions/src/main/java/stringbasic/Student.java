package stringbasic;

public class Student {

    private Person person;
    private String neptunCode;
    private String educationalIdentifier;
    private String entranceCardNumber;

    public Student(Person person, String neptunCode, String educationalIdentifier) {
        this.person = person;
        this.neptunCode = neptunCode;
        this.educationalIdentifier = educationalIdentifier;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }

    public String getEducationalIdentifier() {
        return educationalIdentifier;
    }

    public void setEducationalIdentifier(String educationalIdentifier) {
        this.educationalIdentifier = educationalIdentifier;
    }

    public String getEntranceCardNumber() {
        return entranceCardNumber;
    }

    public void setEntranceCardNumber(String entranceCardNumber) {
        this.entranceCardNumber = entranceCardNumber;
    }
}
