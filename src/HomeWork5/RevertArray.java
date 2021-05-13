package HomeWork5;

/*
1 - Написать метод (void) который переворачивает массив. В main должен быть вызван
метод который переворачивает массив, потом вывести с помощью sout. Важно - не
вывести в консоль с последнего элемента, а проапдейтить существующий массив с
помощью void
 */
public class RevertArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original array");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        revertArray(array);
        
        System.out.println("Reverted array");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    static void revertArray(int[] arrayInMethod) {
        int iterations = arrayInMethod.length / 2;
        if (arrayInMethod.length % 2 != 0) iterations = (arrayInMethod.length - 1) / 2;

        int temp;

        for (int i = 0; i < iterations; i++) {
            temp = arrayInMethod[i];
            arrayInMethod[i] = arrayInMethod[arrayInMethod.length - 1 - i];
            arrayInMethod[arrayInMethod.length - 1 - i] = temp;
        }
    }
}
