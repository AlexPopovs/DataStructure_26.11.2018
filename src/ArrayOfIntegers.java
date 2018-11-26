
import java.util.Scanner;

public class ArrayOfIntegers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {      // "while" is used here because we need loop to make program able to terminate and we need to use "break".

            System.out.println("Please input your digit for array");

            int size = in.nextInt();
            int[] user = new int[size];

            System.out.println("Program successfully initialized an array");

            System.out.println("\nDo you want to enter another digit? Your Answers: 0 - yes, 1 - no");

           // while (true) {      // "while" is used here because we need loop to make program able to terminate and we need to use "break".

                int wantToContinue = in.nextInt();

                if (wantToContinue == 0) {

                    System.out.println("Please input your digit for array");
                    int size1 = in.nextInt();
                    int[] user1 = new int[size1];

                    System.out.println("Program successfully initialized an array");
                    System.out.println("\nDo you want to enter another digit? Your Answers: 0 - yes, 1 - no");
                    int size2 = in.nextInt();
                    int[] user2 = new int[size2];

                } else if (wantToContinue == 1) {
                    System.out.println("Thank you for using our product and Good bye!");
                    break;
                }

            //}
        }
    }
}
// try to use cases