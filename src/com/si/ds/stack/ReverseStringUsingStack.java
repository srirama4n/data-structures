package com.si.ds.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int T = Integer.parseInt(scanner.nextLine());
        for (int j = 0; j < T; j++) {
            String[] strs = scanner.nextLine().split(" ");
            Stack<String> stack = new Stack<>();
            Arrays.stream(strs).forEach(str -> stack.push(str));
            while (!stack.isEmpty()){
                rev(stack.pop());
            }
            System.out.println();
        }
    }

    private static void rev(String s){
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            stack.push(c);
        }
        char[] r = new char[stack.size()];
        stack.stream().forEach(System.out::print);
        System.out.print(" ");
    }

}