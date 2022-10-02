import java.io.*;
import java.util.ArrayList;

public class File {
    public static void FilePlus() throws IOException

    {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите путь до 1-го файла");
        String str1 = a.readLine();
        System.out.println("Введите путь до 2-го файла");
        String str2 = a.readLine();
        a.close();


        FileInputStream fil2 = new FileInputStream(str2);
        FileInputStream fil1 = new FileInputStream(str1);
        ArrayList<Integer> file = new ArrayList<>();

        while (fil2.available() > 0) {
            file.add(fil2.read());
        }
        while (fil1.available() > 0) {
            file.add(fil1.read());
        }
        FileOutputStream outp = new FileOutputStream(str1);
        for (int i : file) {
            outp.write(i);
        }
        fil1.close();
        fil2.close();
        outp.close();
    }
}
