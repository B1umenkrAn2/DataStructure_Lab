import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This class contains the dynamically allocated array and it's processing
 * Student Name: 
 * Student Number:  
 * Course: CST8130 - Data Structures
 * @author Linda Crane
 * @author Melissa Sienkiewicz
 *
 */
public class Numbers {
	/**
	 * Stores Float values.
	 */
	private Float [] numbers;
	
	/**
	 * Store the number of items currently in the array.
	 */
	private int numItems;

	/**
	 * Default Constructor
	 */
	public Numbers() {
		// TODO Write code here to initialize a "default" array since this is the default constructor
		numItems = 0;
		numbers = new Float[5];
	}

	/**
	 * Constructor that initializes the numbers array.
	 * @param size - Max size of the numbers array
	 */
	public Numbers(int size) {
		// TODO Write code here to initialize the numbers array of max 'size'
		numItems = 0;
		numbers = new Float[size];
	}
	
	/**
	 * Adds a value in the array
	 * @param keyboard - Scanner object to use for input
	 */
	public void addValue(Scanner keyboard) {
		// TODO Write code here to add the values in the array
		if (numItems<numbers.length){
//			System.out.println("Enter value:");
			numbers[numItems] = keyboard.nextFloat();
			numItems++;
		}else {
			System.out.println("array is full ");
		}


	}
	
	/**
	 * Calculates the average of all the values in the numbers array.
	 * @return float value that represents the average
	 */
	public float calcAverage() {
		// TODO Write code to return the average of the values in the array
		if (numItems==0){
			return  (float)0 ;
		}

		float sum;
		float avg = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = +numbers[i];
			avg = sum / numItems;
		}

		return avg;
	}

	@Override
	public String toString() {
		String s ="number are :" ;
		// TODO Write code for an appropriate toString method
		if (numItems == 0){
			return s ;



		}else {

			for (int i = 0; i < numbers.length; i++) {

				s += numbers[i];
				s +="\n";
			}

			return s ;
		}
	}
	
}
