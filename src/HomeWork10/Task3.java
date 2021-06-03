package HomeWork10;

/*
Если длина строки меньше или равно 3, то она остается без изменений. Если
больше 3, то нужно вернуть новую строку, которая составляет 3 копии первых
трех символов
 */
public class Task3 {
    public static String repeatRepeatRepeat(String inputString) {
        if (inputString.length() > 3) return inputString.concat(inputString).concat(inputString);
        else return inputString;
    }

    public static void main(String[] args) {
        String testString = "abcd";
        System.out.println(repeatRepeatRepeat(testString));
    }
}
