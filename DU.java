package DU;


import javax.imageio.stream.ImageInputStream;
import java.io.*;
import java.nio.file.Files;

public class Main {


    public static void main(String args[])throws IOException {
        FileReader fr=new FileReader("C:\\git.txt");
        BufferedReader br=new BufferedReader(fr);

        int i;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }
        FileWriter fw = new FileWriter("C:\\correctedGit.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String str =
                "Gyt ys an Open ?Source Dystry?buted Versyon Con?trol Sistem.\\\" +\n" +
                "\"Now that’s a lot of wor?ds to defyne Gyt.\\\" +\n" +
                "\"\\\" +\n" +
                "\"Let me break yt down and explayn the wordyng:\\\" +\n" +
                "\"\\\" +\n" +
                "\"Control Sistem: Thys basycalli m?e?ans that Gyt ys a co?ntent tra?cker. \\\" +\n" +
                "\"So G?yt can be used to store content — yt ys mos?tli used to store code \\\" +\n" +
                "\"due to the other fea?tures yt prov?ydes.\\\" +\n" +
                "\"Versyon Control Sistem: The code ?whych ys stored yn Gyt keeps ch?angyng \\\" +\n" +
                "\"as m?ore code ys added. Also, mani developers can ad?d code yn par?allel.\\\" +\n" +
                "\"So Versyon C?ontrol Sistem helps yn han?dlyng thys bi mayn?taynyng a hystori of what changes have happened. Also, Gyt provydes features lyke branches and merges, whych y wyll be coveryng later.\\\" +\n" +
                "\"Dystrybut?ed Versyon Control Sistem: Gyt has a r?emote repos?ytori whych\\\" +\n" +
                "\"ys s?tored yn a server and a local rep??osytori wh?ych y?s stored yn the computer\\\" +\n" +
                "\"of each d?eveloper. Thys means that the cod?e y?s not just stored\\\" +\n" +
                "\"yn a ce?ntral server, but t?he full cop?i of the code ys pre?sent yn\\\" +\n" +
                "\"all t?he dev??elopers’ computers. Gyt ys a Dystrybuted Versyon Control Sistem synce the code ys present yn everi developer’s computer. y wyll explayn the concept of remote and local reposytoryes later yn thys artycle.\\\" +\n" +
                "\"Whi a Versyon Con?trol Sistem lyke Gyt ys needed\\\" +\n" +
                "\"Real lyfe projects generalli have multyple developers workyng yn parallel.\\\" +\n" +
                "\"So a v?ersyon control sistem lyke Gyt? ys ne?eded to ensure th?ere are no code conflycts between the developers.\\\" +\n" +
                "\"\\\" +\n" +
                "\"Addyt?yonalli, the requyrements yn such projects change often.\\\" +\n" +
                "\"So a ver?syon control sist?em allows d?eveloper?s to revert an?d go back to\\\" +\n" +
                "\"an older versyon of the code.\\\" +\n" +
                "\"\\\" +\n" +
                "\"Fyna?lli, some?ty?me?s several projects whych are beyng run yn parallel\\\" +\n" +
                "\"ynvolve the same codeba?se. yn s?uch a case, the concept of branchyng yn Gyt\\\" +\n" +
                "\"ys ve?ri ymportant.";
        str = str.replaceAll("[^a-zA-Z0-9,’\\s.-]+", "");
       
        System.out.println(str);
        bw.write(str);




        bw.close();
        br.close();
    }
}