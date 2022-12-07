package Programming_II_Final_Project;

import java.util.Scanner;

public class ClinicApp {

    public static void main(String[] args) {
        boolean loopMain = true;
        boolean loopSub = true;
        char choice = ' ';
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("=============Medical Clinic Main Menu============");
            System.out.println("[1] Appointment");
            System.out.println("[2] Doctor");
            System.out.println("[3] Patient");
            System.out.println("[4] Treatment");
            System.out.println("[5] Payment");
            System.out.println("[6] Exit system");
            System.out.print("Please choose one of above (1-6): ");
            choice = input.next().charAt(0);
            switch (choice){
                case '1' :
                    loopSub = true;
                    do{
                        System.out.println("====================Appointment===================");
                        System.out.println("<1> Make an appointment");
                        System.out.println("<2> Cancel an appointment");
                        System.out.println("<3> Show all appointments");
                        System.out.println("<4> Change an appointment");
                        System.out.println("<5> Back to the main menu");
                        System.out.println("Please choose one of above (1-5):");
                        choice = input.next().charAt(0);
                        switch (choice){
                            case '1':
                                System.out.println("Make an appointment");
                                break;
                            case '2':
                                System.out.println("Cancel an appointment");
                                break;
                            case '3':
                                System.out.println("Show all appointments");
                                break;
                            case '4':
                                System.out.println("Change an appointment");
                                break;
                            case '5':
                                System.out.println("Back to the main menu");
                                loopSub = false;
                                break;
                        }
                    }while (loopSub);
                    break;
                case '2' :
                    loopSub = true;
                    do{
                        System.out.println("======================Doctor======================");
                        System.out.println("<1> Add a doctor");
                        System.out.println("<2> Delete a doctor");
                        System.out.println("<3> Show doctors list");
                        System.out.println("<4> Back to the main menu");
                        System.out.println("Please choose one of above (1-4):");
                        choice = input.next().charAt(0);
                        switch (choice){
                            case '1':
                                System.out.println("Add a doctor");
                                break;
                            case '2':
                                System.out.println("Delete a doctor");
                                break;
                            case '3':
                                System.out.println("Show doctors list");
                                break;
                            case '4':
                                System.out.println("Back to the main menu");
                                loopSub = false;
                                break;
                        }
                    }while (loopSub);
                    break;
                case '3' :
                    loopSub = true;
                    do{
                        System.out.println("======================Patient=====================");
                        System.out.println("<1> Add a patient");
                        System.out.println("<2> Delete a patient");
                        System.out.println("<3> Show patients list");
                        System.out.println("<4> Back to the main menu");
                        System.out.println("Please choose one of above (1-4):");
                        choice = input.next().charAt(0);
                        switch (choice){
                            case '1':
                                System.out.println("Add a patient");
                                break;
                            case '2':
                                System.out.println("Delete a patient");
                                break;
                            case '3':
                                System.out.println("Show patients list");
                                break;
                            case '4':
                                System.out.println("Back to the main menu");
                                loopSub = false;
                                break;
                        }
                    }while (loopSub);
                    break;
                case '4' :
                    loopSub = true;
                    do{
                        System.out.println("=====================Treatment====================");
                        System.out.println("<1> Add a treatment");
                        System.out.println("<2> Delete a treatment");
                        System.out.println("<3> Show treatments list");
                        System.out.println("<4> Back to the main menu");
                        System.out.println("Please choose one of above (1-4):");
                        choice = input.next().charAt(0);
                        switch (choice){
                            case '1':
                                System.out.println("Add a treatment");
                                break;
                            case '2':
                                System.out.println("Delete a treatment");
                                break;
                            case '3':
                                System.out.println("Show treatments list");
                                break;
                            case '4':
                                System.out.println("Back to the main menu");
                                loopSub = false;
                                break;
                        }
                    }while (loopSub);
                    break;
                case '5' :
                    loopSub = true;
                    do{
                        System.out.println("======================Payment=====================");
                        System.out.println("<1> Add a payment");
                        System.out.println("<2> Show all payments");
                        System.out.println("<3> Change a payment");
                        System.out.println("<4> Show all payments");
                        System.out.println("<5> Back to the main menu");
                        System.out.println("Please choose one of above (1-3):");
                        choice = input.next().charAt(0);
                        switch (choice){
                            case '1':
                                System.out.println("Add a payment");
                                break;
                            case '2':
                                System.out.println("Delete a payment");
                                break;
                            case '3':
                                System.out.println("Change a payment");
                                break;
                            case '4':
                                System.out.println("Show all payments");
                                break;
                            case '5':
                                System.out.println("Back to the main menu");
                                loopSub = false;
                                break;
                        }
                    }while (loopSub);
                    break;
                case '6' :
                    System.out.println("[6] Exit system");
                    loopMain = false;
                    break;
            }
        }while (loopMain);
    }
}

