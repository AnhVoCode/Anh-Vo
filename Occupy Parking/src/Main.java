import jdk.internal.org.objectweb.asm.tree.LdcInsnNode;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        String yesterday = in.nextLine();
        String today = in.nextLine();
        for(int i=0;i<yesterday.length();i++){
            if(yesterday.charAt(i)=='C' && yesterday.charAt(i)==today.charAt(i)){
                System.out.println(i);
            }
        }
    }
}
