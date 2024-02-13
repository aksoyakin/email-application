package v2;

public class Sales extends Department{
    private String shortName = "sal";

    public Sales(String name, String domainName) {
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
