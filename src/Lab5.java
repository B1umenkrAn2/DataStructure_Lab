import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Lab5 {

    public static void main(String[] args) {

    Lab5 lab5 = new Lab5();
    lab5.Menu();

    }
    private void Menu() {
        BinarySearch bs = new BinarySearch();
        Scanner input = new Scanner(System.in);
        int choice;
        do {

            try {

                System.out.println("Please select one of the following:");
                System.out.println("1: add");
                System.out.println("2: Search");
                System.out.println("3: Display");
                System.out.println("4: To Exit");
                System.out.print("SELECTION: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("input :");
                        int addNum = input.nextInt();
                        bs.add(addNum);
                        break;
                    case 2:
                        System.out.println("search number: ");
                        int searchNum = input.nextInt();
                        System.out.println(bs.search(searchNum));
                        break;
                    case 3:
                        bs.toString();
                        break;
                    case 4:
                        System.out.println("bye bye");
                        break;
                    default:
                        break;
                }

            }catch (Exception e){
                choice = 0;

            }

        } while (choice != 6);
    }


}

