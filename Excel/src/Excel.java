import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.util.List;

public class Excel {
    public static void FileExcel() throws IOException {
        int a = 1;

        File file = new File("C:\\Users\\1\\Desktop\\Excel.csv");
        List<String> list = Files.readAllLines(file.toPath());
        DecimalFormat decimalFormat = new DecimalFormat("###-###-####");

        for (String line : list){
            System.out.println(a++ + ". " + String.valueOf(line).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3"));
        }
    }
}
