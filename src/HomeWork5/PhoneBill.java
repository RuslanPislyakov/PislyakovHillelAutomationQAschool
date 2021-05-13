package HomeWork5;

/*
3 - Счет за телефон
Рассчитать стоимость пакета в месяц. Расчёт по каждому из параметров
сделать в отдельном методе. Потом общий подсчёт провести в методе main и вывести
в консоль c помощью sout
1. Стоимость интернета до 8гб включена в пакет, после 50 грн / 500 мб (вход
параметр кол-во потраченных гб)
2. Звонки по Украине до 500 минут 0,5 грн / мин после 0,75
3. Смс до 50 шт 1 грн после 1,50
4. Звонки за рубеж зона 1 1.5 грн/мин
5. Звонки за рубеж зона 2 2 грн/мин
После подсчёта суммы добавляется налог 7 %
 */
public class PhoneBill {
    public static void main(String[] args) {
        double spentInternet = 10.0;
        int ukraineCallsTimeInMinute = 600;
        int abroadCallsZone1Time = 120;
        int abroadCallsZone2Time = 100;

        double costsBeforeTax = internetCost(spentInternet) + ukraineCallsCost(ukraineCallsTimeInMinute)
                + callsAbroadZone1Cost(abroadCallsZone1Time) + callsAbroadZone2Cost(abroadCallsZone2Time);
        double phoneBill = costsBeforeTax * 1.07;
        System.out.println("Phone bill is " + phoneBill + " uah");

    }

    static double internetCost(double spentGb) {
        if (spentGb < 8) return 0;
        else return (spentGb - 8) * 1024 * 0.1; // 50 грн за 500 мб это будет 50/500= 0,1 грн/мб
    }

    static double ukraineCallsCost(int time) {
        if (time < 500) return time * 0.5;
        else return 500 * 0.5 + (time - 500) * 0.75;
    }

    static double callsAbroadZone1Cost(int time) {
        return time * 1.5;
    }

    static double callsAbroadZone2Cost(int time) {
        return time * 2;
    }
}
