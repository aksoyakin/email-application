package v2;

public abstract class Department extends Company {

    public Department(){

    }
    public Department(String name, String domainName) {
        super(name, domainName);
    }

    abstract String returnDepartment();




}
