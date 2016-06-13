package br.com.carreira.algorithm.thirtydays;

import java.util.Scanner;
//65535  16
public class BinaryConsecutiveOne {
	
	public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        int n = 44535;
        StringBuilder s = new StringBuilder("");
        while (true) {
            int r = n % 2;
            s.append(r);
              
            if (n/2 == 1 ) {
                s.append(n/2);
                break;
            }
             n = n / 2 ;
        }
        String bi = s.reverse().toString();
        System.out.println(bi);
        int account = 0;
        int total = 0;
        for (int i=0; i < bi.length(); i++) {
        	if (bi.charAt(i) == '1') {
        		account = account + 1;
        	} 
        	
        	if (bi.charAt(i) == '0') {
        		account = 0;
        	}
        	
        	if (account > total || total == 0) {
        			total = account;
        	}
        	
        	
        }
        System.out.println(total);
    }
	

}
