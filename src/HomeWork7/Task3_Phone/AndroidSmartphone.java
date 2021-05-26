package HomeWork7.Task3_Phone;

public class AndroidSmartphone extends Phone{
    @Override
    public void chargerInterface() {
        System.out.println("Type-C");
    }

    @Override
    void operationalSystem() {
        System.out.println("Android");
    }

    @Override
    void applicationsStore() {
        System.out.println("Play Market");
    }
}
