package com.sf.gandalf.algorithms.sort;

import com.sf.gandalf.algorithms.search.LinearSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class SortingAlgorithms {

    static List<String> algorithms = new ArrayList<>();

    static {
        algorithms.add("1. Bubble Sort");
        algorithms.add("2. Quick Sort");
    }

    static int list[] = new int[]{2, 7, 9, 0, 6, 18, 5, 3};

    private static void print(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void main(String[] args) {

        algorithms.stream().forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Select a Sort Algorithm : \n");
        int selection = scanner.nextInt();
        int[] result;
        switch (selection) {
            case 01:
                System.out.println("Bubble Sort");
                result = BubbleSort.sort(list);
                print(result);
                break;
            case 02:
                System.out.println("Quick Sort");
                result = QuickSort.sort(list);
                print(result);
                break;
            default:
                System.out.println("Invalid Selection.");
        }

    }
}
