package com.example.demo.newcoder;

import java.util.Scanner;

public class GuangGongA {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for(int i=0;i<t;i++){
            int n=scanner.nextInt();
            int sum=0;
            for(int j=1;j<n;j++){
                sum+=n-j;
            }
            System.out.println(sum);
        }
    }
}
