import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This class contains the dynamically allocated array and it's processing
 * Student Name:
 * Student Number:
 * Course: CST8130 - Data Structures
 *
 * @author Linda Crane
 * @author Melissa Sienkiewicz
 */
public class Numbers {
    /**
     * Stores Float values.
     */
    private Float[] numbers;

    /**
     * Store the number of items currently in the array.
     */
    private int numItems;

    /**
     * Default Constructor
     */
    public Numbers() {
        numItems = 0;
        numbers = new Float[1];
    }

    /**
     * Constructor that initializes the numbers array.
     *
     * @param size - Max size of the numbers array
     */
    public Numbers(int size) {
        numItems = 0;
        numbers = new Float[size];
    }

    /**
     * Adds a value in the array
     *
     * @param keyboard - Scanner object to use for input
     */
    public void addValue(Scanner keyboard) {

        if (numItems < numbers.length) {
//			System.out.println("Enter value:");
            numbers[numItems] = keyboard.nextFloat();
            numItems++;
        } else {
            System.out.println("array is full ");
        }


    }

    /**
     * Calculates the average of all the values in the numbers array.
     *
     * @return float value that represents the average
     */
    public float calcAverage() {
        if (this.numItems == 0) {
            return (float) 0;
        } else {

            float sum = 0f;
            float avg = 0f;
            for (int i = 0; i < numItems; i++) {
                sum += numbers[i];
            }
            avg = sum / numItems;
            return avg;
        }
    }

    @Override
    public String toString() {
        String s = "number are : \n";
        if (numItems == 0) {
            return s;


        } else {

            for (int i = 0; i < numItems; i++) {

                s += numbers[i];
                s += "\n";
            }

            return s;
        }
    }

    public void addMultipleValue(Scanner Keyboard, int valueNum) {

        if (valueNum <= numbers.length - numItems) {

            for (int i = 0; i < valueNum; i++) {
                System.out.print("Enter value:");
                addValue(Keyboard);
            }

        } else {
            System.out.println("No room in array to add all values");
        }
    }

    public void readFile(String fileName) {
//        System.out.println(fileName);
        try {

            File readFile = new File("f:\\"+fileName);

//            if (!input.ready()) {
//                System.out.println("File can't be find !");
//            }
                Scanner scanFile = new Scanner(readFile);
                int totalNum = Integer.parseInt(scanFile.next());
                while (scanFile.hasNext()){

                    if ( totalNum<= numbers.length - numItems) {
                        for (int i = 0; i < totalNum; i++) {
                            numbers[numItems] = Float.parseFloat(scanFile.next());
                            numItems++;
                        }

                    } else {
                        System.out.println("No room in array to add all values");

                    }

                }





        } catch (FileNotFoundException ex) {
            System.out.println("can't find the file check the path or file name !");

        }

}

    public void saveFile(String filename) throws IOException {


        FileWriter output = new FileWriter(filename);
//        boolean newFile = output.createNewFile();
        try {
//            if (!newFile) {
//                System.out.println("can't creat this file!");
//            }


            output.write(String.valueOf(numItems));
            output.write("\n");
            output.flush();
            for (int i = 0; i < numItems; i++) {
                output.write(numbers[i].toString());
                output.write("\n");
            }
            System.out.println("lab2.txt !!");
            output.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Can't find the file in this path!");
        } catch (IOException ex) {
            System.out.println("Input error please try again ! ");

        }
    }

}
