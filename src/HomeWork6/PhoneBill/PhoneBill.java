package HomeWork6.PhoneBill;

public class PhoneBill {

    private double spentInternet;
    private int ukraineCallsTimeInMinute;
    private int abroadCallsZone1Time;
    private int abroadCallsZone2Time;
    private int smsAmount;

    public PhoneBill(double spentInternet, int ukraineCallsTimeInMinute, int abroadCallsZone1Time, int abroadCallsZone2Time, int smsAmount) {
        this.spentInternet = spentInternet;
        this.ukraineCallsTimeInMinute = ukraineCallsTimeInMinute;
        this.abroadCallsZone1Time = abroadCallsZone1Time;
        this.abroadCallsZone2Time = abroadCallsZone2Time;
        this.smsAmount = smsAmount;
    }

    public double monthBillCalculation() {
        double costsBeforeTax = internetCost(spentInternet) + ukraineCallsCost(ukraineCallsTimeInMinute) + smsCost(smsAmount)
                + callsAbroadZone1Cost(abroadCallsZone1Time) + callsAbroadZone2Cost(abroadCallsZone2Time);
        return costsBeforeTax * 1.07;
    }

    public double internetCost(double spentGb) {
        if (spentGb < 8) return 0;
        else return (spentGb - 8) * 1024 * 0.1; // 50 грн за 500 мб это будет 50/500= 0,1 грн/мб
    }

    public double ukraineCallsCost(int time) {
        if (time < 500) return time * 0.5;
        else return 500 * 0.5 + (time - 500) * 0.75;
    }

    public double smsCost(int smsAmount) {
        if (smsAmount < 50) return smsAmount * 1;
        else return (smsAmount * 1) + (smsAmount - 50) * 1.5;
    }

    public double callsAbroadZone1Cost(int time) {
        return time * 1.5;
    }

    public double callsAbroadZone2Cost(int time) {
        return time * 2;
    }
}

