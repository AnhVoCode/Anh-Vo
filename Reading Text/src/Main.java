import java.io.*;
import java.util.ArrayList;

public class Main {
    static void searchingWord(String fileName, String word){
        
    }

    public static void main(String[] args) throws IOException {
        ArrayList<String> sentence = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory");
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        while ((line = br.readLine())!= null){
            sentence.add(line);
        }
    }
}
