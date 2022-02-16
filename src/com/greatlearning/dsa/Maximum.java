package com.greatlearning.dsa;

import java.util.LinkedList;

public class Maximum {
    int largestElement(LinkedList<Integer> q) { 
        int max = Integer.MIN_VALUE; 
        for(int j=0; j<=q.size()-1; j++) { 
            if(max < q.get(j)) 
                max = q.get(j); 
        } 
        return max; 
    } 
}
