import java.lang.Math;
import java.util.Arrays;
import java.util.Hashtable;

public class dsaEasy {
    public static boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        int x = (int) (Math.log(n) / Math.log(2));
        System.out.println(x);
        if (Math.pow(2, x) == n) {
            return true;
        }
        return false;
    }

    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i < j && j > -1) {
            if (nums[i] + nums[j] == 0) {
                return nums[j];
            } 
            if (nums[i] + nums[j] < 0) {
                i++;
            }

            if (nums[i] + nums[j] > 0) {
                j--;
            }
        }
        return -1;
    }

    public static int commonFactors(int a, int b) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                if (b % i == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void maximum69Number (int num) {
        int arr[] = new int[10];
        Arrays.fill(arr, 0);

        int i=3;
        while(num!=0){
            arr[i--]=num%10;
            num/=10;
        }

        for(i=0;i<=3;i++){
            if(arr[i]==6) {
                arr[i]=9;
                break;
            }
        }

        int ans=0,mul=1;
        for(i=3;i>=0;i--){
            ans+=(mul*arr[i]);
            mul*=10;
        }
        System.out.println(ans);
    }

    public static void main(String args[]) {
        boolean ans = isPowerOfTwo(0);
        System.out.println(ans);

        int[] nums = {-956,-831,-707};
        int ans2 = findMaxK(nums);
        System.out.println(ans2);

        int x = commonFactors(25, 30);
        System.out.println(x);

        maximum69Number(9669);
    }
}