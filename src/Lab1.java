import com.sun.org.apache.regexp.internal.RE;

import java.util.Scanner;

/**
 * This class contains the dynamically allocated array and it's processing
 * Student Name: siyang Xiong
 * Student Number: 040938012
 * Course: CST8130 - Data Structures
 *
 * @author Linda Crane
 * @author Melissa Sienkiewicz
 */
public class Lab1 {

    /**
     * @param args
     */

    private Numbers num1 = new Numbers();

    public static void main(String[] args) {

        Lab1 lab1 = new Lab1();
        lab1.displayMainMenu();


    }

    private void displayMainMenu() {
        Scanner input = new Scanner(System.in);
        int choice;
        do {

            try {

                System.out.println("Please select one of the following:");
                System.out.println("1: Initialize a default array");
                System.out.println("2: To specify the max size of the array");
                System.out.println("3: Add value to the array");
                System.out.println("4: Display values in the array");
                System.out.println("5: Display the average of the values");
                System.out.println("6: Enter multiple values");
                System.out.println("7: Read values from file");
                System.out.println("8: Save values to file");
                System.out.println("9: To Exit");
                System.out.print("SELECTION: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        num1 = new Numbers();
                        break;
                    case 2:
                        System.out.print("array size is : ");
                        int size = input.nextInt();
                        num1 = new Numbers(size);
                        break;
                    case 3:
                        System.out.print("Enter value:");
                        num1.addValue(input);
                        break;
                    case 4:
                        System.out.println(num1.toString());
                        break;
                    case 5:
                        System.out.println("Average is : " + num1.calcAverage());
                        break;
                    case 6:
                        System.out.print("How many values do you wish to add?");
                        int numForMutInput = input.nextInt();
                        num1.addMultipleValue(input, numForMutInput);
                        break;
                    case 7:
                        System.out.println("Name of the file to read from:");
                        String readFileName = input.next();
                        num1.readFile(readFileName);
                        break;
                    case 8:
                        System.out.println("Name of the file to save from:");
                        String saveFileName = input.next();
                        num1.saveFile(saveFileName);
                        break;
                    case 9:
                        System.out.println("Bye bye");
                        break;
                    default:
                        break;
                }

            } catch (Exception e) {
                choice = 0;

            }

        } while (choice != 9);
    }


}