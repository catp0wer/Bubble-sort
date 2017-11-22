package com.company;
public class Main {

    public static void main(String[] args) {
        int[] myArray = {9, 8, -9, 6};
        System.out.println("Initial array is: " + java.util.Arrays.toString(myArray));
        boolean existChanges = true;
        int temp;

        while (existChanges){
            for(int i=0; i < myArray.length-1; i++){
                existChanges = false;
                if (myArray[i] >myArray[i+1]) {
                    temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;
                    existChanges = true;
                }
            }
        }
        System.out.format("Sorted array is:  ");
        printArray(myArray);
    }

    public static void printArray(int[] input_array){
        for(int i=0; i < input_array.length; i++)
            System.out.print(input_array[i] + " ");
    }
}