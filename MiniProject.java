import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        System.out.println("Radhe Radhe");

        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do {
            System.out.println("Guess the number(1-100) : ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber) {
                System.out.println("Correct number");
                break;
            }
            else if(userNumber > myNumber)  {
                System.out.println("Your number is large");
            }
            else {
                System.out.println("Your number is small");
            }
        } while(userNumber >=0 );
        System.out.println("My number was : ");
        System.out.println(myNumber);
    }
}
