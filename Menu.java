
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("=============Medical Clinic Main Menu============");
        System.out.println("1 Appointment");
        System.out.println("2 Doctor");
        System.out.println("3 Patient");
        System.out.println("4 Treatment");
        System.out.println("5 Payment");
        System.out.println("6 Exit system");
        System.out.println("Please choose one of above (1-6): ");
        System.out.println("==================================================");

        int choice = scan.nextInt();


        scan.close();

    }

}
