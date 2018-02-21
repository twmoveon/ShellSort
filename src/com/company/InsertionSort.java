package com.company;

public class InsertionSort {
    public void sort(int[] a){
        int i, j, k;
        int count = 0;
        for (i = 1; i < a.length; i++)
        {
            for (j = i - 1; j >= 0; j--) {
                if (a[j] < a[i]) {
                    count++;
                    break;
                }
                count++;
            }
            if (j != i - 1)
            {
                int temp = a[i];
                for (k = i - 1; k > j; k--){
                    a[k + 1] = a[k];
                }
                a[k + 1] = temp;
            }
        }
        System.out.println("The number of compare in InsertionSort is: " +count);
    }
}
