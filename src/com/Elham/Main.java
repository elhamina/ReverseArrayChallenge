package com.Elham;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myarray = {1,2,3,4,5};
        //reverse(myarray);
        //System.out.println("Array.length" + myarray.length);

        System.out.println("Original Array = " + Arrays.toString(myarray));
        reverse(myarray, myarray.length);
    }
    public static void reverse(int[] array){
        int leng = array.length - 1;
        int swap;
        for(int i=0; i < leng /2; i++){
            swap = array[i];
            array[i] = array[leng-i];
            array[leng -i] = swap;
        }
        System.out.println();
        System.out.print("reversed array: ");
        for(int i=0; i < array.length; i++){
            System.out.print( array[i] +" " );
        }

    }
    public static void reverse(int[] array, int number){
        int[] reverse = new int [number];
        reverse = Arrays.copyOf(array, array.length);
        int last = number;
        for(int i=0; i < number; i++){
            reverse[last - 1] = array[i];
            last --;
        }
        // print the reverse array
        System.out.print("Reverse integers = [");
        for(int i=0; i < number; i++){
            System.out.print(reverse[i] + " ");
        }
        System.out.print("]");
    }


}
