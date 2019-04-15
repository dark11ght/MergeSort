package com.company;

import java.util.ArrayList;

public class MergeSort {

    public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) throws Exception{
        ArrayList<Integer> mergeArray = new ArrayList<>(a.size() + b.size());

        int indexA = 0;
        int indexB = 0;

        while (indexA < a.size() && indexB < b.size()){
            mergeArray.add(a.get(indexA) < b.get(indexB) ? a.get(indexA++) : b.get(indexB++));
        }

        ArrayList<Integer> LastIndex;
        int lastInd;
        if (indexA < a.size()){
            LastIndex = a;
            lastInd = indexA;
        }else{
            LastIndex = b;
            lastInd = indexB;
        }

        for(int i = lastInd; i < LastIndex.size(); i++){
            mergeArray.add(LastIndex.get(i));
        }
        a.clear();
        a.addAll(mergeArray);
    }
}
