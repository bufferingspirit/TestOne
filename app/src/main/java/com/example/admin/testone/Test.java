package com.example.admin.testone;

import java.lang.Math;

import static java.lang.Math.pow;

/**
 * Created by Admin on 8/7/2017.
 */


public class Test {

    public static void main(String[] args) {

        String p1 = "racecar";
        String p2 = "fjzqqzjf";
        String p3 = "Not";
        String p4 = "working";

        isPalindrome(p1);
        isPalindrome(p2);
        isPalindrome(p3);
        isPalindrome(p4);

    }

    public static void isArmstrong(){
        for(int i = 100; i < 1000; i++){
            String num = Integer.toString(i);
            int first = Character.getNumericValue(num.charAt(0));
            int second = Character.getNumericValue(num.charAt(1));
            int third = Character.getNumericValue(num.charAt(2));

            if(i == (pow(first, 3) + pow(second, 3) + pow(third, 3))){
                System.out.println();
            };
        }
    }


    public static void isPalindrome(String p) {
        System.out.println(p);
        int right = p.length() - 1;
        int left = 0;
        boolean flag = true;
        while(right > left){
            if(p.charAt(right) != p.charAt(left)){
                flag = false;
            }
            right--;
            left++;
        }
        if(flag){
            System.out.println("Is palindrome");
        }
        else{
            System.out.println("Is Not palindrome");
        }
    }
}
