package stringconcat.nameconcat;

public class Name {

    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public String concatNameWesternStyle() {
        String name;
       if (title != null) {
           name = title.getValue();
           name = name.concat(" ");
           name = name.concat(givenName);
       } else {
           name = givenName;
       }
       name = name.concat(" ");
       if ((middleName != null) && !("".equals(middleName))) {
           name = name.concat(middleName);
           name = name.concat(" ");
       }
       name = name.concat(familyName);
       return name;
    }

    public String concatNameHungarianStyle() {
        String name;
        if (title != null) {
            name = title.getValue();
            name = name.concat(" ");
            name = name.concat(familyName);
        } else {
            name = familyName;
        }
        name = name.concat(" ");
        if ((middleName != null) && !(" ".equals(middleName))) {
            name = name.concat(middleName);
            name = name.concat(" ");
        }
        name = name.concat(givenName);
        return name;
    }
}
