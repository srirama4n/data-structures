package com.si.ds.stack;

import java.util.Arrays;
import java.util.Scanner;

public class StackImp {

    int[] ar = null;
    int p = -1;

    StackImp(int size) {
        ar = new int[size];
        Arrays.fill(ar, 999);
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int T = Integer.parseInt(scanner.nextLine());

        StackImp s = new StackImp(T);
        for (int j = 0; j < T; j++) {
            String[] strs = scanner.nextLine().split(" ");
            if ("push".equals(strs[0])) {
                int x = Integer.parseInt(strs[1]);
                s.push(x);
            } else {
                int pop = s.pop();
                System.out.println(pop == 999 ? "Empty" : pop);
            }
        }
    }

    public void push(int x) {
        p = p + 1;
        ar[p] = x;
    }

    public int pop() {
        int r = 999;
        if (p > -1) {
            r = ar[p];
            p = p - 1;
        }
        return r;
    }

}
