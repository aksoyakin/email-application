package v2;

public class Development extends Department {
    private String shortName = "dev";

    public Development() {

    }

    public String getShortName() {
        return shortName;
    }

    @Override
    String returnDepartment() {
        return shortName;
    }

}
