import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Take in a string
        String s = "Hello";
        byte[] stringBytes = s.getBytes();
        System.in.read(stringBytes);
        for (int b:stringBytes){
            System.out.println((char)b);
        }

        //Writes the byte to file
        FileOutputStream out = new FileOutputStream("out.txt");

    }
}
