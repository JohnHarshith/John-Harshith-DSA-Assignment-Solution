package com.greatlearning.dsa;

import java.util.LinkedList;
import java.util.Scanner;

public class Floors {
    public static void main(String[] args) {
        LinkedList<Integer> q = new LinkedList<Integer>();
        Maximum m = new Maximum();
        int n,size;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Total Number of Floors in the Building: ");
        n = sc.nextInt();
        int i,j=0,max,count=0,t;
        System.out.println();
        for(i=0; i<n; i++) {
            System.out.print("Enter the Floor Size Given on Day "+(i+1)+": ");
            size = sc.nextInt();
            q.add(size);
        }
        i = 0;
        System.out.println("\nThe Order of Construction is as Follows: ");
        while(q.size()>0) {
            System.out.print("Day "+(j+1)+" : ");
            max = m.largestElement(q);
            if(q.get(i)==max) {
                System.out.print(max+" ");
                q.remove(i);
                int temp = 0,c = count;
                if(count!=0) {
                    int k = 0;
                    while(c>0) {
                        t = m.largestElement(q);
                        if(t==q.get(k)) {
                            t = q.get(k);
                            System.out.print(t+" ");
                            q.remove(k);
                            i = i-1; 
                            c = c-1; 
                            k = k-1; 
                            temp++;
                        } 
                        else 
                            k++;
                    }
                }
                count -= temp;
                i--;
                System.out.println();
            }
            else {
                count++;
                System.out.println();
            }
            i++;
            j++;
    
        }
        System.out.println();
    }
}
