/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class fibonacci {
    
    static long fibo(int number) {
        
        long[] fibArray;
        int sum;
        fibArray = new long[10000];
        fibArray[0] = 0;
        fibArray[1] = 1;
        System.out.println(0);
        System.out.println(1);
        for (int i = 1; i <= number - 2; ++i) {
            sum = (int) (fibArray[i] + fibArray[i - 1]);
            fibArray[i + 1] = sum;
            System.out.println(sum);   
        }
        return 0;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        fibo(number);
        
    }
    
}
