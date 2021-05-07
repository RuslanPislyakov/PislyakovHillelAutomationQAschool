package HomeWork4;

// 7. Написать программу, который переворачивает массив
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        int iterations = array.length / 2;
        if (array.length % 2 != 0) iterations = (array.length - 1) / 2;

        int temp;

        for (int i = 0; i < iterations; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("Reverse array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
