//Find Second Largest Number in Array

package com.workshop;
import java.util.Scanner;
public class Workshop {
    public static void main(String[] args) {
            int i, j, temp;
            System.out.println("Welcome in Workshop Project...!");
            System.out.println("Enter number of elements: ");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            // System.out.println(size);

            int[] arr = new int[size];
            //take input from user
            System.out.println("Enter Elements...");
            for (i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            getSecondLargestElement(arr,size);
        }
        public static void getSecondLargestElement(int [] arr,int size){
            int i, j, temp;
            for (i = 0; i < size; i++) {
                for (j = i + 1; j < size; j++) {
                    //sort array in ascending order, alternatively we can use sort();
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Second Largest element in array is: "+(arr[size - 2]));
        }
}
