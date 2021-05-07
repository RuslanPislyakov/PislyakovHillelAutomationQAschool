package HomeWork4;

// 6. Написать программу, которая подсчитывает количество элементов массива int*ов,
//которые делятся на 2, но не делятся на 3 и выводит в консоль
public class CountDivideOn2andNotDivideOn3 {
    public static void main(String[] args) {
        int array[] = {4, 1, 3, 6, 8, 9, 3, 5};
         int divideOn2andNotDivideOn3counter = 0;
        for (int element : array) {
            if (element % 2 == 0 & element % 3 != 0) {
                divideOn2andNotDivideOn3counter++;
                System.out.println(element);
            }
        }
        System.out.println("There are " + divideOn2andNotDivideOn3counter + " numbers that divide on 2 and not divide on 3. The list of such numbers is above");
    }
}
