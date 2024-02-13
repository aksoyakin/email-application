package v2;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Wide Spectrums","ws.com");
        Employee employee = new Employee("Akin","Aksoy", new Development());
        Email email = new Email(employee,company);
    }
}
