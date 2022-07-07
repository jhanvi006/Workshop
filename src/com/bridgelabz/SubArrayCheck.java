package com.bridgelabz;

public class SubArrayCheck {
    static boolean isSubArray(int arr1[], int arr2[], int sizeOfArrayOne, int sizeOfArrayTwo){
        int i=0, j=0;
        for (i = 0; i < sizeOfArrayTwo; i++) {
            for (j = 0; j < sizeOfArrayOne; j++) {
                if (arr2[i] == arr1[j])
                    break;
            }
            if (j == sizeOfArrayOne)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 9};

        if (isSubArray(arr1, arr2, arr1.length, arr2.length))
            System.out.println("Array 2 is sub array of array 1");
        else
            System.out.println("Array 2 is not sub array of array 1");
    }
}
