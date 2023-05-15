package com.sf.gandalf.algorithms.search;

import java.util.Arrays;

public class BinarySearch {

    /**
     * search
     * @param arr
     * @param value
     * @param recursive
     * @return
     */
    public static int search(int[] arr, int value, boolean recursive) {
        if(recursive == true) {
            System.out.println("Binary Search (Recursive) on Array "+ Arrays.toString(arr) +" to find value :"+value);
            return binarySearchRecursive(arr, value, 0, arr.length -1);
        } else {
            System.out.println("Binary Search on Array "+ Arrays.toString(arr) +" to find value :"+value);
            return binarySearchIterative(arr, value);
        }
    }

    /**
     * binarySearchIterative
     * @param arr
     * @param value
     * @return
     */
    public static int binarySearchIterative(int[] arr, int value) {

        int low = 0;
        int high = arr.length - 1;
        int index = -1;

        while (low <= high) {
            int mid   = (low + high) / 2;
            if (arr[mid] < value) {
                low = mid + 1;
            } else if(arr[mid] > value) {
                high = mid - 1;
            } else if(arr[mid] == value) {
                index = mid;
                break;
            }
        }

        return index;
    }

    /**
     * binarySearchRecursive - Recursive
     * @param arr
     * @param value
     * @param low
     * @param high
     * @return
     */
    public static int binarySearchRecursive(int[] arr, int value, int low, int high) {

        int index = -1;
        int mid   = (low + high) / 2;

        if(high < low) {
            return -1;
        }

        if (value < arr[mid]) {
            return binarySearchRecursive(arr, value, low, mid - 1);
        } else if(value > arr[mid]) {
            return binarySearchRecursive(arr, value, mid + 1, high);
        } else if(arr[mid] == value) {
            index = mid;
        }

        return  index;
    }

}
