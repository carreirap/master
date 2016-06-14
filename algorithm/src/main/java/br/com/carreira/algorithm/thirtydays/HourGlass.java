package br.com.carreira.algorithm.thirtydays;

import java.util.Scanner;

public class HourGlass {
	/*
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

19

-1 -1 0 -9 -2 -2
-2 -1 -6 -8 -2 -5
-1 -1 -1 -2 -3 -4
-1 -9 -2 -4 -4 -5
-7 -3 -3 -2 -9 -9
-1 -3 -1 -2 -4 -5

-6

-1 1 -1 0 0 0
0 -1 0 0 0 0
-1 -1 -1 0 0 0
0 -9 2 -4 -4 0
-7 0 0 -2 0 0
0 0 -1 -2 -4 0

0
	  
	 */
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int column = 0;
        int line = 0;
        int total = 0;
        boolean fistStep = false;
        do { 
        	int hourGlass = 0;
        	for (int i=0; i < 3; i++) {
        		for(int j=0; j < 3; j++){
        			if ( i == 0 || i == 2) {
        				System.out.print(arr[i + line][j+column] + " " );
        				hourGlass += arr[i + line][j+column];
        			}
        			if (i == 1 && j == 1) {
        				System.out.print(arr[i+line][j+column] + " ");
        				hourGlass += arr[i + line][j+column];
        			}
        		
        		}
        		System.out.print("\n\n");
        	}
        	if (hourGlass > total || fistStep == false) {
        		fistStep = true;
        		total = hourGlass;
        	}
        	line +=1;
        	if (arr[0].length - line < 3) {
        		column +=1;
        		line=0;
        	}
        	
        } while (arr[0].length - column >= 3);
        
        System.out.println(total);
    }

}
