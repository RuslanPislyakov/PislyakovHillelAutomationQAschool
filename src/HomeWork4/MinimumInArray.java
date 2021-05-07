package HomeWork4;

// 1. Написать программу, которая находит минимальное значение в массиве
public class MinimumInArray {
    public static void main(String[] args) {
        int elements[] = {5, 3, -1, 9, 22};
        int min = elements[0];
        for (int element : elements) {
            if (element < min) min = element;
        }
        System.out.println("Minimum element of the array is " + min);
    }
}
