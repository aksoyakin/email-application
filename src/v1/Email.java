package v1;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 8;
    String alternateEmail;
    private String companySuffix = "akinsoycompany.com";

    //constructor to receive the first and lastname
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("oldversion.Email CREATED: " + firstName + " " + lastName);

        //call a method asking for the department - return the department
        this.department = setDepartment();
        //System.out.println("Department: " + department);

        //call a method that returns random password
        this.password = randomPassword(defaultPasswordLength);
        //System.out.println("Your password is: " + password);

        //combine elements to generate email
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
        //System.out.println("Your email is: " + email);
    }

    //ask for the department
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES:" +
                "\n1 for Sales" +
                "\n2 for Development" +
                "\n3 for Accounting" +
                "\n0 for none " +
                "\nEnter department code: ");

        Scanner scanner = new Scanner(System.in);
        int departmentSelect = scanner.nextInt();

        if (departmentSelect == 1)
            return "Sales";
        else if (departmentSelect == 2)
            return "Development";
        else if (departmentSelect == 3)
            return "Accounting";
        else
            return "";
    }

    // generate a random password
    private String randomPassword(int length){
        // ==> bunu geliştir.
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXVZ0123456789!@£#$½{[]}*%";

        char[] password = new char[length];
        for (int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // set the mailbox capacity
    public void setMailBoxCapacity(int mailBoxCapacity){
        this.mailBoxCapacity = mailBoxCapacity;
    }

    // set the alternate email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }

    // create a method for the mail

    // change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        System.out.println("*******************");
        return "Display Name: " + firstName + " " + lastName +
                "\nCompany oldversion.Email: " + email +
                "\nPassword: " + password +
                "\nMailbox Capacity: " + mailBoxCapacity + "mb" +
                "\n*******************";

    }
}
