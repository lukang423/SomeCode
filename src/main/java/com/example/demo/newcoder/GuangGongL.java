package com.example.demo.newcoder;

import java.util.Scanner;

public class GuangGongL {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

    String lineNumberStr=scanner.nextLine();
    int lineNumber=Integer.parseInt(lineNumberStr);
    if(lineNumber<0)
        return;
        else{
        for(int i=0;i<lineNumber;i++){
            String inputNumbers=scanner.nextLine();
            String[] inputNumberArray=inputNumbers.split(" ");

            long x=Long.parseLong(inputNumberArray[0]);
            long a=Long.parseLong(inputNumberArray[1]);
            long y=Long.parseLong(inputNumberArray[2]);
            long b=Long.parseLong(inputNumberArray[3]);

            if(x>y){
                long t=x;
                x=y;
                y=t;

                t=b;
                b=a;
                a=t;
            }


            long z=x;
            int n=1;
            long re=0;
            long len=x*x;

            while(z<y){
                re=z;
                z=z*len;
                n+=2;
            }
            if(z>y){
                n--;
                if(re*x==y){
                    if((b*n)==a){
                        System.out.println("Yes");
                    }
                    else
                        System.out.println("No");
                }
                else
                    System.out.println("No");
            }

            else{
                if((b*n)==a){
                    System.out.println("Yes");
                }
                else
                    System.out.println("No");
            }


        }
    }
}
}
