package com.sf.gandalf.algorithms.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchAlgorithms {

    static List<String> algorithms = new ArrayList<>();

    static {
        algorithms.add("1. Linear Search");
        algorithms.add("2. Binary Search");
    }

    static int[] list = new int[]{2, 7, 9, 0, 6, 18, 5, 3};

    public static void main(String[] args) {

        algorithms.forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Select a Search Algorithm : \n");
        int selection = scanner.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Linear Search");

                System.out.println(LinearSearch.search(list, 18));

                System.out.println("Recursive :" +LinearSearch.search(list, list.length, 18));
                break;
            case 2:
                System.out.println("Quick Search");

                break;
            default:
                System.out.println("Invalid Selection.");
        }

    }

}
