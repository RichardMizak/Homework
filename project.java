package DU.project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arr = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\a.txt")))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                arr.add(sCurrentLine);
            }
            System.out.println(arr);

        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<String> arr2 = new ArrayList<String>();
        try (BufferedReader br2 = new BufferedReader(new FileReader("C:\\b.txt")))
        {
            String sCurrentLine;
            while ((sCurrentLine = br2.readLine()) != null) {
                arr2.add(sCurrentLine);
            }
            System.out.println(arr2);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}