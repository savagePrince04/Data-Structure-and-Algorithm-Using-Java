package Lec3;

public class Partition_of_array {
    public static void main(String[] args) {
        int[] arr = {5,7,9,8,3,2,4};
        int idx = Partition(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(idx);
    }

    public static int Partition(int[] arr, int low, int high) {
        int item = arr[high];
        int idx = low;
        for (int i = low; i < high; i++) {
            if (arr[i] < item) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }

        }
        int temp = arr[high];
        arr[high] = arr[idx];
        arr[idx] = temp;
        return idx;
    }
}
