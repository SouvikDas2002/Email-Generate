package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultpassSize=10;
    private String department;
    private String email;
    private int mailboxCapacity=200;
    private String alternateEmail;

    public Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);

        this.department=setDepartment();
        System.out.println("Department: "+this.department);
    }
    private String setDepartment() {
        System.out.print("Enter the department:\n1 for Sales \n2 for Development \n3 for Accounting\n");
        Scanner in = new Scanner(System.in);
        int dept=in.nextInt();
        if(dept==1){
            return "Sales";
        }else if(dept==2){
            return "Development";
        }else{
            return "Accounting";
        }
    }
    private void passwordGenerate(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] password=new char[length];
        for(int i=0;i<length;i++){
            int rand=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        this.password=new String(password);
    }
    private void createEmail(){
        this.email=firstName+"."+lastName+"@"+department+"company.com";
        System.out.println("Successfully created 1");
    }

    public void createPass(int length){
//        (length >= 6) ? passwordGenerate(length) : passwordGenerate(defaultpassSize);
        if(length<6)
            passwordGenerate(defaultpassSize);
        else
            passwordGenerate(length);

        createEmail();
    }
    public String getPass() {return password;}
    public String getMail() {return this.email;}
    public void setMailboxCapacity(int cap){this.mailboxCapacity=cap;}

    @Override
    public String toString() {
        return "Email{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", mailboxCapacity=" + mailboxCapacity +
                ", alternateEmail='" + alternateEmail + '\'' +
                '}';
    }
}
