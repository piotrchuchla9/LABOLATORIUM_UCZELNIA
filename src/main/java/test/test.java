package test;

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int middle = 0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                middle = middle + ((int) Math.pow(2,j)) * b;
                int result = (a + middle);
                System.out.print(result + " ");
            }
            middle = 0;
            System.out.println();
        }
        in.close();
    }
}