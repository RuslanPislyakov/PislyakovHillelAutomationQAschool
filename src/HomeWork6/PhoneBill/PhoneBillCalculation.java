package HomeWork6.PhoneBill;

/*
2 Счет за телефон
Рассчитать стоимость пакета в месяц. Инициализацию getPhoneBill сделать с
помощью конструтора из другого класса
1. Стоимость интернета до 8гб включена в пакет, после 50 грн / 500 мб (вход
параметр кол-во потраченных гб)
2. Звонки по Украине до 500 минут 0,5 грн / мин после 0,75
3. Смс до 50 шт 1 грн после 1,50
4. Звонки за рубеж зона 1 1.5 грн/мин
5. Звонки за рубеж зона 2 2 грн/мин
После подсчёта суммы добавляется налог 7 %
 */
public class PhoneBillCalculation {
    public static void main(String[] args) {
        PhoneBill phoneBill = new PhoneBill(10.0, 600, 120, 100, 10);
        System.out.println("Phone bill is " + phoneBill.monthBillCalculation() + " uah");
    }
}
