import java.io.*;

import java.util.ArrayList;

public class Main {
    static void searchingWord(String fileName, String word) throws IOException {
        //Copy each sentence to the ArrayList
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory");
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        while ((line = br.readLine())!= null){
            lines.add(line);
        }
        fr.close();
        br.close();

        //Search the word and return the index
        for (String l : lines){
            if (l.contains(word)){
                System.out.println(lines.indexOf(l));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        searchingWord("ProgrammingHistory","However");
    }
}
