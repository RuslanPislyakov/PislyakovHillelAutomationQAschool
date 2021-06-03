package HomeWork10;

/*
Для входящей строки вернуть версию без первого и последнего символов
строки. Строка может быть любой длины, включая 0.
 */
public class Task2 {

    public static String withoutFirstAndLastChar(String inputString) {
        String result = "";
        try {
            result = inputString.substring(1, inputString.length() - 1);
        } catch (Exception e) {
            System.out.println("There are no enough symbols in the string field for method correct work");
        }
        return result;
    }

    public static void main(String[] args) {
        String testString = "ab";
        System.out.println(withoutFirstAndLastChar(testString));
    }
}
