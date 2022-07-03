package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //syntax
        ArrayList<Integer> list =new ArrayList<Integer>(10);
//        list.add(67);
//        list.add(45);
//        list.add(688);
//        list.add(56);
//        System.out.println(list);
//        list.set(0, 24);
//        System.out.println(list.contains(456));
//        list.remove(2);
//        System.out.println(list);
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
       // System.out.println(list);
    }
}
