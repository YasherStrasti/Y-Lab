package Task1;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        boolean is_Sorted = false;
        while (!is_Sorted) {
            is_Sorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    is_Sorted = false;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
