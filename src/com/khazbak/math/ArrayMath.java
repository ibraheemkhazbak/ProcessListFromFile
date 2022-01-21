package com.khazbak.math;

public class ArrayMath implements ArrayMathI{

    @Override
    public int min(int[] array) {
        int min=array[0];
        for (int number:array) {
            min=Math.min(min,number);
        }
        return min;
    }

    @Override
    public int max(int[] array) {
        int max=array[0];
        for (int number:array) {
            max=Math.max(max,number);
        }
        return max;
    }

    @Override
    public int sum(int[] array) {
        int sum=0;
        for (int number: array) {
            sum+=number;
        }
        return sum;
    }

    @Override
    public double average(int[] array) {
        double avg=array[0];
        for (int number: array) {
            avg=(avg+number)/2;
        }
        return first_N_Digits(avg,3);
    }

    private double first_N_Digits(double number,int n) {
        int multiplier=(int)Math.pow(10,n);
    return Math.floor(number*multiplier)/multiplier;
    }
}
