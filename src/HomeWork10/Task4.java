package HomeWork10;

/*
Взять последний символ в строке и вернуть новую строку с последним
символом, добавленным спереди и сзади, «cat» -> «tcatt».
public String backAround(String str) {}
 */
public class Task4 {
    public static String backAround(String inputString) {
        String lastSymbolInTheString = String.valueOf(inputString.charAt(inputString.length() - 1));
        return lastSymbolInTheString + inputString + lastSymbolInTheString;
    }

    public static void main(String[] args) {
        String testString = "Hello";
        System.out.println(backAround(testString));
    }
}
