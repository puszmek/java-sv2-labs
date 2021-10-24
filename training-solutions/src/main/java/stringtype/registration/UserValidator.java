package stringtype.registration;

public class UserValidator {

    private String username;
    private String password1;
    private String password2;
    private String email;

    public UserValidator(String username, String password1, String password2, String email) {
        this.username = username;
        this.password1 = password1;
        this.password2 = password2;
        this.email = email;
    }

    public boolean isValidUsername(String username) {
        return !"".equals(username) ? true : false;
    }

    public boolean isValidPassword(String password1, String password2) {
        return (password1.length()>=8) && password1.equals(password2) ? true : false;
    }

    public boolean isValidEmail(String email) {
        int indexAt = email.indexOf("@");
        int indexDot = email.indexOf(".");
        return (indexAt > 0) && !(indexDot == (email.length()-1)) && ((indexAt + 1) < indexDot) ? true : false;

//        int atSignIndex = email.indexOf('@');
//        String domain = email.substring(atSignIndex + 1);
//        int dotInDomainIndex = domain.indexOf('.');
//        return atSignIndex > 0
//                && dotInDomainIndex > 0
//                && dotInDomainIndex < domain.length() - 1;
    }

}
