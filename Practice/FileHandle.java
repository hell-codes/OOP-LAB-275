package Practice;

import java.io.*;

public class FileHandle {
    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("data.txt");
        fw.write("Hello Devil\nWelcome to Java");
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
