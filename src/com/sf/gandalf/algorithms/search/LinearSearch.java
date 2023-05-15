package com.sf.gandalf.algorithms.search;

public class LinearSearch {

    public static int search(int[] list, int value) {

        for (int i = 0; i < list.length; i++) {
            if(list[i] == value)
                return i;
        }

        return -1;
    }

    /**
     * Recursive
     * @param list
     * @param size
     * @param value
     * @return
     */
    public static int search(int[] list, int size, int value) {

        if (size == 0) {
            return -1;
        } else if(list[size - 1] == value) {
            return size - 1;
        } else {
            return search(list, size - 1, value);
        }
    }


}
