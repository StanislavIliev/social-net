package socialnet.constants;

public class RegexConstant {

    public final static String USERNAME_REGEX = "^[a-z0-9]{2,25}$";
    public final static String PASSWORD_REGEX = "^[a-zA-Z0-9!$%*]{8-25}$";
    public final static String EMAIL_REGEX = "^[a-zA-Z0-9.-_]{1,25}@[a-zA-Z0-9.-_]{1,25}.[a-z]{2,4}$";
    public final static String FIRSTNAME_REGEX = "^[a-zA-Z]{2,25}$";
    public final static String LASTNAME_REGEX = "^[a-zA-Z]{2,25}$";
    public final static String PHONE = "^\\+*[0-9]{5,25}$";

}
