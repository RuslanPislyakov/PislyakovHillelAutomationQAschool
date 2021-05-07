package HomeWork4;

// 3. Написать программу, которая сортирует массив от минимума в максимум
public class ArraySorting {
    public static void main(String[] args) {
        int array[] = {5, 1, 3, 6, 8, 9, 3, 5};
        boolean isRearrangementTakePlace;
        int temp;
        do {
            isRearrangementTakePlace = false;
            for (int i = 1; i <= array.length - 1; i++) {
                if (array[i - 1] > array[i]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isRearrangementTakePlace = true;
                }
            }
        }
        while (isRearrangementTakePlace);

        for (int element : array) {
            System.out.println(element);
        }
    }
}
