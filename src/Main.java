public class Main {
    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4};
        int x = original[original.length - 1];

        for (int i = original.length - 1; i >= 0; i--) {
            if (i == 0) {
                original[i] = x;
            } else {
                original[i] = original[i - 1];
            }
        }
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
    }

    //public static int[] insert(int[] arr, int element, int index) {
    //        int[] nums = arr;
    //        nums[index] = element;
    //        return nums;
    //    }
}