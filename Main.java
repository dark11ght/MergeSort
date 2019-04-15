package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 3, 5));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(2, 4, 6));

        MergeSort.merge(a, b);
        System.out.println(a);
        System.out.println(b);
    }
}
