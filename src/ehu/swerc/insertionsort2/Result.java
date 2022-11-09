package ehu.swerc.insertionsort2;

import java.util.*;

class Result {

    public static void insertionSort(int i, List<Integer> ar) {
        int sort = ar.get(i);
        i--;
        while (i >= 0 && ar.get(i) > sort) {
            ar.set(i + 1, ar.get(i));
            i--;
        }
        ar.set(i + 1, sort);
        print(ar);
    }

    public static void insertionSort2(int n, List<Integer> intList) {
        for(int i=1;i<intList.size();i++){
            insertionSort(i, intList);
        }
    }

    private static void print(List<Integer> ar) {
        for(int e: ar) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

}


