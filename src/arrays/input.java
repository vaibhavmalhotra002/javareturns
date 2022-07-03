package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
//        int[] arr=new int[5];
//        //coventional input
//        arr[0]=24;
//        arr[1]=4;
//        arr[2]=424;
//        arr[3]=244;
//        arr[4]=242;
//        System.out.println(arr[2]);
//
////input using for loop
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i]=in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr)); //it takes an integer array and convert it into a string
////printing the above for loop
////        for (int i = 0; i <arr.length ; i++) {
////            System.out.print(arr[i]  + " ");
////        }
//        for (int num : arr) { //for every element in array, print the element
//            System.out.print(num + " ");//here num represents element of array
//        }
        String[] str =new String[5];
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1]="vaibhav";
        System.out.println(Arrays.toString(str));

    }
}
