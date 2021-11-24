package introexceptionthrow.patient;

public class SsnValidator {

    public boolean isValidSsn(String ssn) {
        if (ssn == null || ssn.length() != 9) {
            return false;
        }
        int sum = 0;
        int remainder;
        try {
            for (int i = 0; i < ssn.length() - 1; i ++) {
                if (i % 2 == 0) {
                    sum += 3 * Integer.parseInt(ssn.substring(i, i + 1));
                } else {
                    sum += 7 * Integer.parseInt(ssn.substring(i, i + 1));
                }
            }
            remainder = Integer.parseInt(ssn.substring(ssn.length() - 1));
        } catch (NumberFormatException nfe) {
            return false;
        }
        return remainder == sum % 10;
    }
}
