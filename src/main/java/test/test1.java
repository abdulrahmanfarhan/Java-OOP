package test;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int sum = 0;
        while ((n = s.nextInt()) >= 0) {
            sum += n;
        }
        System.out.println(sum);
    }

}
