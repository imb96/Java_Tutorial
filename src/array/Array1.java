package array;

import java.lang.reflect.Array;

public class Array1 {
    public static void main(String[] args) {
        int[] score = new int[5];
        int k = 1;

        score[0] = 10;
        score[1] = 20;
        score[k+1] = 30;
        score[3] = 40;
        score[4] = 50;

        int tmp = score[k+2] + score[4];

        for(int i = 0; i < score.length; i++) {
            System.out.println("score[i]: " + score[i]);
        }

        System.out.println("tmp: " + tmp);

        System.out.println("error: " + score[5]);
    }
}
