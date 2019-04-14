package com.example.demo;

/**
 * @program: demo
 * @description:
 * @author: wanzeyu
 * @create: 2019-02-14 09:47
 **/
public class Bsearch {

    //add1
    //add2
    public int bsearch(int[] arr , int value) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (high - low) / 2;
            if (value == arr[mid]) {

            } else if (value > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    return -1;
    }
    public int bsearch2(int[] arr , int value) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (high - low) / 2;
           if (value > arr[mid]) {
                low = mid + 1;
            } else if (value < arr[mid]){
                high = mid - 1;
            } else{
               if ((mid==0)|| arr[mid -1] !=value ) {
                   return mid;
               }else {
                   high = mid -1 ;
               }
           }
        }
        return -1;
    }
    private int bsearchInternally(int[] a, int low, int high, int value) {
        if (low < high) {
            return -1;
        }

        int mid = low + ((high - low) >> 1);
        if (a[mid] == value) {
            return mid;
        } else if (a[mid] < value) {
            return bsearchInternally(a, mid + 1, high, value);
        } else {
            return bsearchInternally(a, low, mid - 1, value);
        }

    }
    public static void main(String[] args) {

    }
}
