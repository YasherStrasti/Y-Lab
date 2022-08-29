package Task2;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        long rangeBegin = 10L;
        long rangeEnd = 100L;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = (int)(Math.random() * 70 + 10);
                long currentTime = System.nanoTime();
                array[i][j] = (int)(rangeBegin + (currentTime % ((rangeEnd - rangeBegin) * 100)) / 100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int maxIndex = array[0][0];
        int minIndex = array[0][0];
        int result = 0, count = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > maxIndex) maxIndex = array[i][j];
                if (array[i][j] < minIndex) minIndex = array[i][j];
                result += array[i][j];
                count++;
            }
        }
        result /= count;
        System.out.println("\nМаксимальное значение: " + maxIndex + "\nМинимальное значение: " + minIndex + "\nСреднее значение: " + result);
    }
}
