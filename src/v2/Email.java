package v2;

public class Email {

    private Employee employee;
    private String employeeFirstName;
    private String employeeLastName;
    private String companyDomainName;
    private String departmentName;
    private int defaultPasswordLength = 12;
    private String mailAddress;
    private String password;

    public Email(Employee employee, Company company) {
        this.employee = employee;
        employeeFirstName = employee.getFirstName();
        employeeLastName = employee.getLastName();
        companyDomainName = company.getDomainName();
        departmentName = employee.getDepartment().returnDepartment();

        mailAddress = generateMail();
        password = generateRandomPassword(defaultPasswordLength);
        printInfo();
    }
    public String generateMail(){
        String email = employeeFirstName.toLowerCase() + "." +
                employeeLastName.toLowerCase() +
                "@" + departmentName + "." +
                companyDomainName.toLowerCase();
        return email;
    }
    public String generateRandomPassword(int length){
        String upperCaseAlphabet = "ABCDEFGHIJKLMOPRSTUVYZWQ";
        String lowerCaseAlphabet = upperCaseAlphabet.toLowerCase();
        String numbers = "1234567890";
        String characters = "!'+%&/()@?*";
        String passwordSet = upperCaseAlphabet + lowerCaseAlphabet + numbers + characters;

        char[] createdPassword = new char[length];
        for (int i = 0; i < length; i++){
            int random = (int) (Math.random() * passwordSet.length());
            createdPassword[i] = passwordSet.charAt(random);
        }
        password = new String(createdPassword);
        return password;
    }
    public void printInfo(){
        System.out.print("Your email created successfully." +
                "\nDisplay Name: " + employeeFirstName + " " + employeeLastName +
                "\nMail Address: " + mailAddress +
                "\nPassword: " + password);
    }


}
