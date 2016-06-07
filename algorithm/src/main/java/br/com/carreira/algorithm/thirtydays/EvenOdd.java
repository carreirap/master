package br.com.carreira.algorithm.thirtydays;

import java.util.Scanner;
/**
 * Separa as string pela posição 0,1,2,3,4
 *  Given the input:
 *    2
 * 	  Linux
 *    Forever
 *  The code will print:
 *    Lnx iu
 *	  Frvr oee
 *  The result is separed by positions even and odd;  
 * @author Paulo Carreira
 *
 */
public class EvenOdd {
	
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String[] str = new String[number];
        sc.nextLine();
        for (int i=0; i<number; i++) {
            str[i] =  sc.nextLine();
        }
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i=0; i<str.length; i++) {
            for(int j=0; j<str[i].length(); j++) {
                if (j == 0) {
                    even.append(str[i].charAt(j));
                } else if (j % 2 == 0) {
                    even.append(str[i].charAt(j));
                } else {
                    odd.append(str[i].charAt(j));
                }
            }
            System.out.println(even.toString() + " " + odd.toString());
            even.delete(0,even.length());
            odd.delete(0,odd.length());
        }
        sc.close();
       
    }

}
