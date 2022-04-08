package com.company;

public class Main {

    public static void main(String[] args) {
	    int n = 15, l, pos, key;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            l = n-i;
            a[i] = l * 2;
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            key = a[i];
            pos = binarySearch(a, 0, i-1, key);
            for (int j = i-1; j >= pos; j--) {
                a[j+1] = a[j];
            }
            a[pos] = key;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }


    public static int binarySearch(int[] arr, int start, int end, int key) {
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(key < arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }
}
