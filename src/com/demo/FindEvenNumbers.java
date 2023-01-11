package com.demo;

import java.util.ArrayList;
import java.util.List;

public class FindEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(9);
        list.add(12);
        list.add(18);
        list.add(21);
        list.add(24);

        FindEvenNumbers evenNumbers = new FindEvenNumbers();
        evenNumbers.printEvenNum(list);
    }

    private void printEvenNum(List<Integer> list) {
        String even = "";
        String odd="";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                even = even + list.get(i) + " ";
            }else {
                odd=odd+list.get(i)+" ";
            }
        }
        System.out.print("Even numbers :" +even);
        System.out.print("\nodd numbers :" +odd);
    }


}
