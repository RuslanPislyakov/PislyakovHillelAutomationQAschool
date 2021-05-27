package HomeWork7.Task3_Phone;

public class SmartphoneTester {
    public static void main(String[] args) {

        IOSSmartphone iosSmartphone = new IOSSmartphone();
        iosSmartphone.chargerInterface();
        iosSmartphone.operationalSystem();
        iosSmartphone.applicationsStore();
        System.out.println("iOS smartphone");
        System.out.println("Charger interface: " + iosSmartphone.getChargerType());
        System.out.println("Application market: " + iosSmartphone.getApplicationStore());
        System.out.println("Operation system: " + iosSmartphone.getOperationSystem());
        System.out.println("");

        AndroidSmartphone androidSmartphone = new AndroidSmartphone();
        androidSmartphone.chargerInterface();
        androidSmartphone.operationalSystem();
        androidSmartphone.applicationsStore();
        System.out.println("Android smartphone");
        System.out.println("Charger interface: " + androidSmartphone.getChargerType());
        System.out.println("Application market: " + androidSmartphone.getApplicationStore());
        System.out.println("Operation system: " + androidSmartphone.getOperationSystem());

    }
}
