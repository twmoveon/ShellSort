package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {
    private static int N = 32768;
    private static String path = "/.../DSA_HW2_TongWu(tw445)/dataset-problem2-hw2/data1.32768";

    public static void main(String[] args) throws IOException {
	// write your code here
        implementInsertionSort();
        implementShellSort();
    }

    public static void implementInsertionSort() throws IOException {
        InsertionSort insertionSort = new InsertionSort();
        int[] array = loadArray();
        insertionSort.sort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void implementShellSort() throws IOException {
        ShellSort shellSort = new ShellSort();
        int[] array = loadArray();
        shellSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] loadArray() throws IOException {
        int[] array = new int[N];
        File filename = new File(path);
        InputStreamReader reader = new InputStreamReader(
                new FileInputStream(filename)); // Create a reader object
        BufferedReader br = new BufferedReader(reader);
        String line = "";
        int i = 0;
        while (line != null && i < array.length) {
            line = br.readLine(); // Read each line
            if(line != null)
                array[i] = Integer.parseInt(line);
            i++;
        }
        return array;
    }
}
