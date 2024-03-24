package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
    	String[] seasons = {"Winter", "Spring", "Summer", "Fall"};
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }
        return seasons;
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
    	
    	int[] array = new int[length];
        for (int i = 1; i < length; i++) {
            array[i] = i + 1;
        }

        return array;

    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
    	int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
    	int i;
    	for( i = 1; i<=arr.length;i++ ) {
    		if( arr[i] == number ) {
    			//System.out.println(number);    		
    			return i;
    		
    	}}
    	return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
    	String[] reversedArray = new String[arr.length];
    	for (int i = arr.length -1, j=0; i>=0; i--, j++ ) {
    		reversedArray[j] =arr[i];
    			//System.out.println(i);
    		}
    	return reversedArray;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
    	 int count = 0;
    	    for (int num : arr) {
    	        if (num > 0) {
    	            count++;
    	        }
    	    }

    	    int[] onlyPositiveNumbers = new int[count];
    	    int index = 0;
    	    for (int num : arr) {
    	        if (num > 0) {
    	            onlyPositiveNumbers[index] = num;
    	            index++;
    	        }
    	    }

    	    return onlyPositiveNumbers;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
    	// Ordenar los arrays unidimensionales en orden ascendente de longitud
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].length > arr[j].length) {
                    int[] temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Ordenar los números en cada array unidimensional en orden ascendente
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                for (int k = j + 1; k < arr[i].length; k++) {
                    if (arr[i][j] > arr[i][k]) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;
                    }
                }
            }
        }

        return arr;
    }
    
    
    public static void main(String[] args) {
    	
    	ArrayTasks tasks = new ArrayTasks();
    	
    	tasks.seasonsArray();
    	
    	tasks.generateNumbers(3);
    	
    	
    	int[] arr = {1, 2, 3, 4, 5};
    	tasks.totalSum(arr);
    	
    	int[] arrD = {1, -32, 3, 4, 5};
    	tasks.findIndexOfNumber(arrD, 5);
    	
    	String[] arrT= {"Levi", "Armin", "Eren"};
    	tasks.reverseArray(arrT);
    	
    	int[] arrC = {2,6,7,-9,-45,3,4};
    	tasks.getOnlyPositiveNumbers(arrC);
    	
    	int[][] matriz = new int[4][3];
    	tasks.sortRaggedArray(matriz);
    	
    	
    }
}








