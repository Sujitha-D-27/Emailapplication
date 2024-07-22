package emailapp;
import java.awt.*;
import java.util.*;
public class Email {
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First name");
        String fname=sc.next();
        System.out.println("Enter Last name");
        String lname=sc.next();
        Emailapp e=new Emailapp(fname,lname);
        int choice=-1;
        do{
            System.out.println("\n------------\nEnter your choice\n1.Show Info \n2.Change Password\n3.Change mailbox capacity\n4.Set Alternate mail\n5.Exit");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    e.getInfo();
                    break;
                case 2:
                    e.set_password();
                    break;
                case 3:
                    e.set_mailcap();
                    break;
                case 4:
                    e.alternate_mail();
                    break;
                case 5:
                    System.out.println("Thankyou for using application");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }while(choice!=5);

    }
}
