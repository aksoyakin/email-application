package v2;

public class Accounting extends Department{
    private String shortName = "acc";

    public Accounting(String name, String domainName) {
        super(name, domainName);
    }

    public String getShortName() {
        return shortName;
    }

    @Override
    String returnDepartment() {
        return shortName;
    }

}
