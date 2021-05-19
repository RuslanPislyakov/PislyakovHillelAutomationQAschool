package HomeWork6.Salary;

public class SalesAgentSalary {
    private int workedHours; // Отработанные часы
    private double reitPerHour; // Рейт, долларов в час
    private int yearsOfWorkExpirience; // Стаж работы
    private int dealsAmount; // Количество продаж
    private double salesAmount; // Сумма продаж

    double salary; // Вычисляемая ЗП

    public SalesAgentSalary(int workedHours, double reitPerHour) {
        this.workedHours = workedHours;
        this.reitPerHour = reitPerHour;
    }

    public SalesAgentSalary(int workedHours, double reitPerHour, int yearsOfWorkExpirience, int dealsAmount, double salesAmount) {
        this.workedHours = workedHours;
        this.reitPerHour = reitPerHour;
        this.yearsOfWorkExpirience = yearsOfWorkExpirience;
        this.dealsAmount = dealsAmount;
        this.salesAmount = salesAmount;
    }


    public double overtimePayment(int workedHours, double reitPerHour) {
        if (workedHours > 160) {
            return (workedHours - 160) * 1.5 * reitPerHour;
        } else return 0;
    }

    public double workExperienceCoefficient(int years) {
        double coefficient = 0;
        if (years < 2) coefficient = 1.0;
        if (years > 2 & years <= 4) coefficient = 1.2;
        if (years > 4 & years <= 6) coefficient = 1.3;
        if (years > 6) coefficient = 1.4;
        return coefficient;
    }

    public double amountOfDealsBonus(int dealsAmount, int yearsOfWorkExpirience) {
        double bonus = 0;
        if (dealsAmount > 20) bonus = 250.0;
        if (dealsAmount < 10) bonus = -150.0;
        if (yearsOfWorkExpirience == 0) bonus = 0;
        return bonus;
    }

    public double salesAmountBonus(double salesAmount) {
        double bonus = 0;
        if (salesAmount > 15000) bonus = 250.0;
        return bonus;
    }

    public double getSalary() {
        if (workedHours < 160) {
            salary = workedHours * reitPerHour * workExperienceCoefficient(yearsOfWorkExpirience) + overtimePayment(workedHours, reitPerHour)
                    + amountOfDealsBonus(dealsAmount, yearsOfWorkExpirience) + salesAmountBonus(salesAmount);
        } else
            salary = 160 * reitPerHour * workExperienceCoefficient(yearsOfWorkExpirience) + overtimePayment(workedHours, reitPerHour)
                    + amountOfDealsBonus(dealsAmount, yearsOfWorkExpirience) + salesAmountBonus(salesAmount);
        return salary;
    }
}
