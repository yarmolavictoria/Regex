import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.file.Files.readAllLines;


public class Regex {


    public static void main(String[] args) throws IOException {

        String p = " (\\[Login Username:.*?\\])|(\\[Data Object:.*?\\])|(\\[User Action:.*?\\])|(\\[Records:.*?\\])|(\\[User Action Status:.*?\\])|(\\[Labels:.*?\\])|(\\[Service type:.*?\\])|(\\[Mapping Ids:.*?\\])";
        Pattern patern = Pattern.compile(p);

        List<String> lines = readAllLines(Paths.get("C:/Users/Vika/Desktop/logs2/Logs.txt"));
            for (String line : lines ) {
            Matcher matcher = patern.matcher(line);
            String output = "";
            while (matcher.find()) {
                output += matcher.group();
            }
                System.out.println(output + " ");
            }
        }
    }
