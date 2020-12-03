package DU.project;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arr = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\a.txt")))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                arr.add(sCurrentLine);
            }
            System.out.println("First text file: "+arr);

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
            System.out.println("Second text file: "+arr2);

        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<String> arr3 = new ArrayList<>();
        arr3.addAll(arr);

        for(String e: arr2){
            if(!arr3.contains(e))
                arr3.add(e);
        }
        System.out.println("Merged text files: "+arr3);

        Set<String> set = new HashSet<>(arr3);
        arr3.clear();
        arr3.addAll(set);
        System.out.println("Merged text files without duplicates: "+arr3);

        FileWriter fw = new FileWriter("C:\\Users\\rmiza\\OneDrive\\Plocha\\c.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        ArrayList<String> str = arr3;
        bw.write(String.valueOf(str));
        bw.close();

}
}
