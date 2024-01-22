package hausaufgaben_43;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HA_43_02 {
    public static void main(String[] args) {
        File file1 = new File("hag_43.txt");
        File file2 = new File("hag_43_2.txt");
        System.out.println(sumText(file1));
        System.out.println(longestLine(file2));
    }

    public static int sumText(File file) {
        int sum = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                int i = Integer.parseInt(string);
                sum += i;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return sum;
    }

    public static String longestLine (File file){
        String line = "";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String string;

            while ((string = bufferedReader.readLine()) != null) {
                for (int i = 0; i<string.length(); i++){
                    if (string.length()>line.length()){
                        line = string;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return line;
    }
}
