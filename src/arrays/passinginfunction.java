package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class passinginfunction {
    public static void main(String[] args) {
        int[] nums=new int[4];
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0]=99;
    }
}
