package br.com.carreira.algorithm.thirtydays;

import java.util.Scanner;

public class BinaryConsecutiveOne {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = "";
        while (true) {
            int r = n % 2;
            s = s + r;
              
            if (n/2 == 1 || n%2 == 0) {
                s = s + (n/2);
                break;
            }
             n = n / 2 ;
        }
        System.out.println(s);
    }

}
