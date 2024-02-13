package v2;

public class Company {
    private String name;
    private String domainName;
    public Company(){

    }

    public Company(String name, String domainName) {
        this.name = name;
        this.domainName = domainName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
}
