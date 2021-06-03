package HomeWork10;

/*
1. Написать метод который принимает в себя строку с несколькими словами и
возвращает строку с одним словом, которое идет за текущим в upper case
(например мы ищем строке “Get a modern feel with a smudge-resistant only for
$2.50, you can finish now” слово которой идет после слова “feel” (т.е. должен
вернуть “WITH” )
 */
public class Task1 {

    public static String afterFellInUpperCase(String inputString) {

        String result = null;

        String[] arrayString = inputString.split(" ");
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].equals("feel")) result = arrayString[i + 1].toUpperCase();
        }
        return result;
    }

    public static void main(String[] args) {

        String testString = "Get a modern feel with a smudge-resistant only for $2.50, you can finish now";

        System.out.println(afterFellInUpperCase(testString));
    }
}
