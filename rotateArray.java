import java.util.Arrays;

class rotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k < 0) {
            k = k + nums.length;
        }
        reversearray(nums, 0, nums.length - k - 1);
        reversearray(nums, nums.length - k, nums.length - 1);
        reversearray(nums, 0, nums.length - 1);

    }

    public static void reversearray(int[] arr, int start, int end) {
        int lindex = start;
        int rindex = end;
        while (lindex < rindex) {
            int temp = arr[lindex];
            arr[lindex] = arr[rindex];
            arr[rindex] = temp;
            lindex++;
            rindex--;
        }
    }
}