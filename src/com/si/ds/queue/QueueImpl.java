package com.si.ds.queue;

import java.util.Arrays;
import java.util.Scanner;

public class QueueImpl {

    int[] ar = null;
    int f = -1, r = -1;

    QueueImpl(int size) {
        ar = new int[size];
        Arrays.fill(ar, 999);
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int T = Integer.parseInt(scanner.nextLine());

        QueueImpl s = new QueueImpl(T);
        for (int j = 0; j < T; j++) {
            String[] strs = scanner.nextLine().split(" ");
            if ("Enqueue".equals(strs[0])) {
                int x = Integer.parseInt(strs[1]);
                s.enqueue(x);
            } else {
                int pop = s.dequeue();
                System.out.println(pop == 999 ? "Empty" : pop);
            }
        }
    }

    public void enqueue(int x) {
        r++;
        ar[r] = x;
    }

    public int dequeue() {
        int value = 999;
        if (f != r) {
            f++;
            value = ar[f];
        }
        return value;
    }
}
