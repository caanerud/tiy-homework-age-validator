import java.util.Scanner;

/**
 * Created by chrisaanerud on 3/20/17.
 */
public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Validator validator = new Validator();

        System.out.println("This program has you enter your age and determines whether or not you can access this very important website.");
        System.out.println("Please enter your age.");

        String userInput = scanner.nextLine();

        try {

            Double.parseDouble(userInput);
            if (validator.validateAge(userInput)) {

                    System.out.println("You can now enjoy our wide variety of content.");
                }
            }

        catch(NumberFormatException e){
                System.out.println("You need to enter age as a whole number.");

            }
catch(Exception f) {
                System.out.println(f.getMessage());
            }

    }
}