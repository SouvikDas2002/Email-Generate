package EmailApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            ArrayList<ArrayList<Email>> emails = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("How many account you need to create");
        int t=sc.nextInt();
        while(t>0) {
            System.out.println("Enter your first name: ");
            String fn = sc.next();
            System.out.println("Enter your last name: ");
            String ln = sc.next();

            Email em1 = new Email(fn, ln);

            System.out.println("Enter length of your password that you want: ");
            int len = sc.nextInt();
            em1.createPass(len);
            System.out.println("Your password is :" + em1.getPass());
            System.out.println("Set mailbox capacity :");
            int cap=sc.nextInt();
            em1.setMailboxCapacity(cap);
            System.out.println("Your mail is: " + em1.getMail());

            ArrayList<Email> email = new ArrayList<>();
            email.add(em1);
            emails.add(email);
            t--;
        }
        System.out.println("Results");
        for(ArrayList<Email> mail:emails){
            System.out.println(mail);
        }

    }
}