package HomeWork5;

/*
2 - Расчёт зарплаты агента по продажам
Расчёт зарплаты нужно разбить на несколько методов:
1. Первый метод получает количество отработанных часов и базовую ставку
если количество отработанных часов больше 160 то каждый последующий час
по коэф 1,5 (параметры у метода - входящие часы int, возвращаемое значение
double коэффициент)
2. Второй метод - получает коэффициент на базовые часы (которые до 160) в
зависимости от стажа работы (параметры у метода - стаж работы int,
возвращаемое значение double коэффициент)
до 2 лет 1
от 2 до 4 - 1.2
от 4 до 6 - 1.3
от 6 лет - 1.4
3. В зависимости от количества продаж - больше 20 - бонус 250, меньше 10
штраф 150 (параметры у метода - количество продаж int, возвращаемое
значение double бонус за количество продаж)
4. четвертый в зависимости от суммы продаж больше 15000 $ - тоже добавляется
бонус (параметры у метода - сумма продаж double, возвращаемое значение
double бонус за сумму продаж)
В методе main проинициализировать все нужные переменные, вызвать методы и
сделать расчет. Результат вывести в консоль
 */
public class AgentSalary {
    public static void main(String[] args) {
        int workedHours = 150; // Отработанные часы
        double reitPerHour = 10; // Рейт, долларов в час
        int yearsOfWorkExpirience = 3; // Стаж работы
        int dealsAmount = 8; // Количество продаж
        double salesAmount = 16000; // Сумма продаж

        double baseSalary;

        System.out.print("Agent salary: ");
        if (workedHours < 160) {
            baseSalary = workedHours * reitPerHour;
        } else baseSalary = 160 * reitPerHour;
        double salary = baseSalary * workExperienceCoefficient(yearsOfWorkExpirience) + overtimePayment(workedHours, reitPerHour)
                + amountOfDealsBonus(dealsAmount) + salesAmountBonus(salesAmount);
        System.out.println(salary);
    }

    static double overtimePayment(int workedHours, double reitPerHour) {
        if (workedHours > 160) {
            return (workedHours - 160) * 1.5 * reitPerHour;
        } else return 0;
    }

    static double workExperienceCoefficient(int years) {
        double coefficient = 0;
        if (years < 2) coefficient = 1.0;
        if (years > 2 & years <= 4) coefficient = 1.2;
        if (years > 4 & years <= 6) coefficient = 1.3;
        if (years > 6) coefficient = 1.4;
        return coefficient;
    }

    static double amountOfDealsBonus(int dealsAmount) {
        double bonus = 0;
        if (dealsAmount > 20) bonus = 250.0;
        if (dealsAmount < 10) bonus = -150.0;
        return bonus;
    }

    static double salesAmountBonus(double salesAmount) {
        double bonus = 0;
        if (salesAmount > 15000) bonus = 250.0;
        return bonus;
    }
}
