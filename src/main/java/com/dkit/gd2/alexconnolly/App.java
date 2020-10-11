package com.dkit.gd2.alexconnolly;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        /*Write a program that takes user input and initialises an array
        of ten integers and then prints four lines of output, containing the following, using
        the following array as an example:
        [1,2,3,4,5,6,7,8,9,10]
        1. Every element at an even index -> [1,3,5,7,9],
        2. Every even element -> [2,4,6,8,10],
        3. All elements in reverse order -> [10,9,8,7,6,5,4,3,2,1],
        4. Only print out first and last element -> [1,10]
        */
        Scanner keyboard = new Scanner(System.in);

        int[] arrayInput = new int[10];
        getUserToPopulateArray(keyboard, arrayInput);
        System.out.println(Arrays.toString(arrayInput));
        printEvenIndex(arrayInput);
        printToEven(arrayInput);
        printReverse(arrayInput);
        printFirstLast(arrayInput);

    }

    private static void getUserToPopulateArray(Scanner keyboard, int[] arrayInput)
    {
        for(int i = 0; i<10; i++)
        {
            System.out.printf("%d element of the array: ", +i);
            arrayInput[i] = keyboard.nextInt();
        }
    }

    private static void printEvenIndex(int[] arrayInput)
    {
        for (int i = 0; i < arrayInput.length; i+=2) {
                System.out.println(arrayInput[i]);
        }
    }

    private static void printToEven(int[] arrayInput)
    {
        for (int i = 0; i < arrayInput.length; i++) {
            if (arrayInput[i] % 2 == 0) {
                System.out.println(arrayInput[i]);
            }
        }
    }

    private static void printReverse(int[] arrayInput)
    {
        for(int i = arrayInput.length - 1; i>=0; i--){
            System.out.println(arrayInput[i]);
        }
    }

    private static void printFirstLast(int[] arrayInput)
    {
        System.out.println(arrayInput[0]+ ", " +arrayInput[9]);
    }


}
