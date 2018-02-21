package com.company;

public class ShellSort {

    public void sort(int[] a){
        int count = 0;
        int gap = 7;
        int j;
        for(int i = gap; i < a.length; i++ ){
            int temp = a[i];
            for(j = i; j >= gap && temp < a[j - gap] ; j = j - gap){
                a[j] = a[j-gap];
                count++;
            }
            a[j] = temp;
        }

        gap = 3;
        for(int i = gap; i < a.length; i++ ){
            int temp = a[i];
            for(j = i; j >= gap && temp < a[j - gap] ; j = j - gap){
                a[j] = a[j-gap];
                count++;
            }
            a[j] = temp;
        }

        gap = 1;
        for(int i = gap; i < a.length; i++ ){
            int temp = a[i];
            for(j = i; j >= gap && temp < a[j - gap] ; j = j - gap){
                a[j] = a[j-gap];
                count++;
            }
            a[j] = temp;
        }
        System.out.println("The number of compare in ShellSort is: " +count);
    }
}
