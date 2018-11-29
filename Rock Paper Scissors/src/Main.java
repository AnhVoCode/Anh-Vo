import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Integer the variable
        int u;  //u = userChoice
        int c;  //c = computerChoice

        //Input for userChoice (Cast the scanner into integers)
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your move: 0 = rock, 1 = paper, 2 = scissors ");
        u = Integer.parseInt(scan.next());

        //Check if the userChoice is in the range 0-2
        if (u > 2 || u < 0){
            System.out.println("Invalid Choice");
            System.out.println("Enter again: 0 = rock, 1 = paper, 2 = scissors");
            u == Integer.parseInt(scan.next());
        }

        //Generate the random input for computerChoice
        System.out.println("Computer choice: ");
        Random number = new Random(3);
        c == Integer.parseInt(scan.next(number);

        //Determine the winner
        // If both user and the computer choose the same choice, they tie
        if (u == c){
            if (u==0){
                System.out.println("Both players chose rock. Tie");
            }
            else if (u==1){
                System.out.println("Both players chose paper. Tie");
            }
            else if (u==2){
                System.out.println("Both players chose scissors. Tie");
            }

        }

        //User chose rock
        if (u==0){
            if (c==1){
                System.out.println("You chose rock, Computer chose paper");
                System.out.println("Computer wins");
            }
            else{
                System.out.println("You chose rock, Computer chose scissors");
                System.out.println("You win");
            }
        }

        //User chose paper
        else if (u==1){
            if(c==0){
                System.out.println("You chose paper, Computer chose rock");
                System.out.println("You win");
            }
            else{
                System.out.println("You chose paper, Computer chose scissors");
                System.out.println("Computer wins");
            }
        }
        else{
            if (c==0){
                System.out.println("You chose scissors, Computer chose rock");
                System.out.println("Computer wins");
            }
            else{
                System.out.println("You chose scissors, Computer chose paper");
                System.out.println("You win");
            }
            scan.close();
        }




    }
}






