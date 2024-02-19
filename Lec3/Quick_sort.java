package Lec3;

public class Quick_sort {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 2, 1, 8, 3, 4 };
        Sort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void Sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int idx = Partition(arr, low, high);
        Sort(arr, low, idx - 1);
        Sort(arr, idx + 1,high);

    }

    public static int Partition(int[] arr, int si, int ei) {
        // TODO Auto-generated method stub

        int item = arr[ei];
        int idx = si;
        for (int i = si; i < ei; i++) {
            if (arr[i] < item) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }

        }
        int temp = arr[ei];
        arr[ei] = arr[idx];
        arr[idx] = temp;
        return idx;
    }
}
