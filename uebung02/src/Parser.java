import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Parser {
    public static String parseStreet(String street) {
        return street.replaceAll("strasse|straße", "str.");
    }

    public static Float extractNumberFromStr(String text) {
        Pattern regex = Pattern.compile("[^\\d]*[\\d]+[^\\d]+([\\d]+)");
        Matcher matcher = regex.matcher(text);
        if (matcher.find())
            return Float.parseFloat(matcher.group(1));
        System.out.println("Passed string doesn't contain two digits.");
        return (float) -1.0;
    }

    public static boolean isValidPhonenumber(String phonenumber) {
        String regex = "(\\+49|0049)?[ -]?[\\d]{4,5}[ -]?[\\d ]+";
        return phonenumber.replaceAll(" ", "").matches(regex);
    }
}
