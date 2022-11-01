import java.util.*;

public class practice {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        int k = 0;
        while (arr[k] != s) {
            for (int i = k + 1; i < n; i++) {
                arr[k] += arr[i];
                if (arr[k] == s) {
                    list.add(k + 1);
                    list.add(i + 1);
                    return list;
                }
            }
            k++;
        }
        list.add(-1);
        return list; 
    }

    static ArrayList<Integer> moveNegativeElement(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.fill(arr, 0);
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
        return list;
    }

    public static int doUnion(int a[], int n, int b[], int m) 
    {   
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(a[i]);
            count++;
        }
        
        for (int i = 0; i < m; i++) {
            if (list.contains(b[i])) {
                continue;
            } else {
                list.add(b[i]);
                count++;
            }
        }
        return count;
    }

    static int MissingNumber(int arr[], int n) {
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if (i != arr[i - 1]) {
                return i;
            }
        }
        return n;
    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int a[] = new int[n];
        Arrays.fill(a, 0);
        for (int i = 0; i < n; i++) {
            if (a[arr[i]] != 1) {
                a[arr[i]] = 1;
            } else {
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static int findMin(int arr[], int n) {
        int min = arr[0];
        for (int i = 1; i < n - 1; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {
         int[] arr = {1, 2, 3, 5, 2, 5};



         int n = arr.length;

        //  System.out.println(subarraySum(arr, n, 17));

        //  System.out.println(moveNegativeElement(arr, n));

        // System.out.println(doUnion(arr, n, b, m));

        // System.out.println(MissingNumber(b, m));

        System.out.println(duplicates(arr, n));

        System.out.println(findMin(arr, n));

    }
}
