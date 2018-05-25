import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFunctions {

    public static void main(String[] args) {
        System.out.println(lastD("Test test etst etetetetet donew bbdwdls hs dsd sbd"));
        System.out.println(checkEmailDomen("test@gmail.com,test@mail.com,test@gmail.com,test@gmail.com,test@gmail.com"));
        System.out.println(checkNum("Amount: 1700.00"));

    }

    public static String lastD(String SearchLastD) {
        Pattern myRegex = Pattern.compile("[Dd](?!(\\n|.)*[Dd])");
        Matcher m = myRegex.matcher(SearchLastD);
        if (m.find()) {
            return "Found";
        }else {
            return "Not Found!";
        }
    }

    public static String checkEmailDomen(String EmailList) {
        Pattern myRegex = Pattern.compile("^([a-zA-Z0-9_.+-]+@gmail\\.[a-zA-Z0-9-.]+,?)+$");
        Matcher m = myRegex.matcher(EmailList);
        if (m.find()) {
            return ("Email list is correct");
        } else {
            return("Email list is not correct");

        }
    }

    public static String checkNum(String AmountNum) {
        Pattern myRegex = Pattern.compile("\\b([0-9]|[1-8][0-9]|9[0-9]|[1-8][0-9]{2}|9[0-8][0-9]|99[0-9]|1[0-5][0-9]{2}|1600)\\b");
        Matcher m = myRegex.matcher(AmountNum);
        if (m.find()) {
            return (m.group(1));
        } else {
            return ("Not Found");
        }
    }
}


