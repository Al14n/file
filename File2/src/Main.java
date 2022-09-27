import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        String str1 = a.readLine();
        String str2 = a.readLine();
        a.close();
        FileInputStream fil1 = new FileInputStream(str1);
        FileInputStream fil2 = new FileInputStream(str2);
        ArrayList<Integer> file = new ArrayList<>();

        while (fil1.available() > 0) {
            file.add(fil1.read());
        }
        while (fil2.available() > 0){
            file.add(fil2.read());
        }
        FileOutputStream outp = new FileOutputStream(str1);
        for(int i : file){
            outp.write(i);
        }
        fil1.close();
        fil2.close();
        outp.close();
    }
}