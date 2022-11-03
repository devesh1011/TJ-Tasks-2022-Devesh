package Array;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class arrayLevel1 {
    public static int peakElement(int[] arr, int n) {
        if (n == 1) {
            return 1;
        }

        int first = 0;
        int last = n - 1;

        if (arr[first] > arr[first + 1]) {
            return 1;
        }
        if (arr[last] > arr[last - 1]) {
            return 1;
        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] || arr[i] > arr[i + 1]) {
                return 1;
            }
        }
        return 0;
    }

    public static void getMinMax(long a[], long n) {
        long arr[] = new long[2];
        long min = a[0];
        long max = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        }
        arr[0] = min;
        arr[1] = max;

        for (int i = 0; i < 2; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void reverseArray(int arr[], int n) {
        int a[] = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            a[j] = arr[i];
            j++;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    public static void sortArray(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }

        list.sort(null);
        System.out.println(list);
    }

    public static int findFrequency(int A[], int x) {
        int freq = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                freq++;
            }
        }
        return freq;
    }

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;
        int cs = 0;
        int i = 0;
        while (i < n) {
            cs += arr[i];
            // System.out.println(cs);
            if (cs > s) {
                idx += 1;
                cs = 0;
                i = idx - 1;
            }
            if (cs == s) {
                list.add(idx + 1);
                list.add(i + 1);
                return list;
            }
            i++;
        }
        list.add(-1);
        return list;
    }

    public static void segregateElements(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                list.add(arr[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                list.add(arr[i]);
            }
        }

        System.out.println(list);
    }

    public static void doUnion(int a[], int n, int b[], int m) {
        // ArrayList<Integer> list = new ArrayList<>();
        // int i = 0;
        // int j = 0;
        // while (i < n && j < m) {
        //     if (a[i] < b[j]) {
        //         list.add(a[i]);
        //         i++;
        //     } else if (a[i] > b[j]) {
        //         list.add(b[j]);
        //         j++;
        //     } else {
        //         i++;
        //         j++;
        //     }
        //     // while (i < n)
        //     // list.add(a[i++]);
        //     // while (j < m)
        //     // list.add(b[j++]);
        // }
        // System.out.println(list);

        Set<Integer> set = new TreeSet<Integer>();

        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        for (int j = 0; j < m; j++) {
            set.add(b[j]);
        }

        for (int k : set) {
            System.out.print(k + " ");
        }
    }

    public static void main(String args[]) {
        // long arr[] = {1, 345, 234, 21, 56789};
        // long n = arr.length;

        // getMinMax(arr, n);
        int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
        int n = arr.length;

        // reverseArray(arr, n);

        // sortArray(arr, n);

        // ArrayList<Integer> l = subarraySum(arr, n, 6);
        // System.out.println(l);

        segregateElements(arr, n);

        int a[] = { 5, 3 };
        int b[] = { 1, 2, 3, 4, 5 };
        n = a.length;
        int m = b.length;

        doUnion(a, n, b, m);
    }
}
