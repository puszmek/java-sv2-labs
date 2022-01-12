package interfacestaticmethods.schoolchild;

public interface PrimarySchoolChild {

    static PrimarySchoolChild of(int age) {
        if (6 <= age && age <= 10) {
            return new LowerClassSchoolChild(age);
        } else if (11 <= age && age <= 14) {
            return new UpperClassSchoolChild(age);
        } else {
            throw new IllegalArgumentException("It's not a schoolchild with this age!");
        }
    }
}
