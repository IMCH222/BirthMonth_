import java.util.Scanner;

public class BirthMonth_ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        int invalidMonth = 0;

        System.out.print("Enter your birth month: ");

        birthMonth = in.nextInt();
        in.nextLine();

        if((birthMonth >= 1) && (birthMonth < 12)){
            System.out.println("Your birth month is: " + birthMonth);
        }
        else if((birthMonth < 1) || (birthMonth > 12)){
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }

    }
}