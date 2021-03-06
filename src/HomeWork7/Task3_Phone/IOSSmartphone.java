package HomeWork7.Task3_Phone;

public class IOSSmartphone extends Phone {

    private String chargerType;
    private String operationSystem;
    private String applicationStore;

    public String getChargerType() {
        return chargerType;
    }

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getApplicationStore() {
        return applicationStore;
    }

    public void setApplicationStore(String applicationStore) {
        this.applicationStore = applicationStore;
    }

    @Override
    public void chargerInterface() {
        setChargerType("Lightening");
    }

    @Override
    public void operationalSystem() {
        setOperationSystem("iOS");
    }

    @Override
    void applicationsStore() {
        setApplicationStore("App Store");
    }
}
