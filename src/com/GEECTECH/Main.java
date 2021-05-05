package com.GEECTECH;

import java.util.Arrays;

public class Main {
    public static  void main  ( String [] args ){

        double [] numbers = {5,-6,8,-7,-1,8,9,6};
        boolean isFirstNegativeNumber = false;
        int count = 0;
        double resultSum = 0;
ssr();
        for (double number:numbers
             ) {if (number < 0){
                 isFirstNegativeNumber= true;
        }
            if ( isFirstNegativeNumber){
                if (number  > 0){
                    resultSum =resultSum + number;
                    count++;
                }
            }
        }
        System.out.println( "Среднее арифматическое число " + resultSum/count);
    }
    public static  void  ssr(){
        int[] array ={10,2,1,6,8,3,18};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    }

