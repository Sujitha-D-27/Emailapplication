package emailapp;
import java.util.*;
public class Emailapp {
    Scanner sc=new Scanner(System.in);
    String fname;
    String lname;
    String dept;
    String email;
    String password;
    int mailcapacity=500;
    String alter_mail;
    public  Emailapp(String fname,String lname){
        this.fname=fname;
        this.lname=lname;
        System.out.println("New Employeee:"+this.fname+""+this.lname);
       this.dept=this.setDept();
       this.password=this.generate_password(8);
       this.email=this.generate_email();

    }
    public String generate_email(){
        return this.fname.toLowerCase()+this.lname.toLowerCase()+"@"+this.dept.toLowerCase()+"dept.com";
    }
    public String setDept() {
        System.out.println("Department codes \n1 for sales \n2 for development \n3 for Accounting \n0 for None");
        boolean flag = false;
        do {
            System.out.println("Enter department code");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    return "Sales";
                }
                case 2 -> {
                    return "Development";
                }
                case 3 -> {
                    return "Accounting";
                }
                case 0 -> {
                    return "None";
                }
                default -> System.out.println("Invalid choice");
            }
        } while (!flag);
        return null;
    }

    public String generate_password(int length){
        Random r =new Random();
        String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small="abcdefghijklmnopqrstuvwxyz";
        String numbers="0123456789";
        String symbols="!@#$%&?";
        String values=caps+small+numbers+symbols;
        String password="";
        for(int i=0;i<length;i++){
            password+=values.charAt(r.nextInt(values.length()));
        }
        return password;
    }
    public void set_password(){
        boolean flag=false;
        do{
        System.out.println("Do you want to change password!(Y/N)");
        char choice=sc.next().charAt(0);
            if (choice == 'Y' || choice == 'y') {
                flag=true;
                System.out.println("Enter current password");
                String temp=sc.next();
                if(temp.equals(this.password)){
                    System.out.println("Enter new Password");
                    this.password=sc.next();
                    System.out.println("Password changed successfully");
                }
                else{
                    System.out.println("Incorrect Password");
                }
            }
            else if(choice=='N'|| choice=='n'){
                flag=true;
                System.out.println("password changed option cancelled!");
            }
            else{
                System.out.println("Invalid choice");
            }

        }while(!flag);
    }
    public void set_mailcap(){
        System.out.println("Current capacity="+this.mailcapacity+"mb");
        System.out.println("Enter new mailbox capacity:");
        this.mailcapacity=sc.nextInt();
        System.out.println("Mailbox capacity is successfully changed");
    }
    public void alternate_mail(){
        System.out.println("Enter new alternate mail:");
        this.alter_mail=sc.next();
        System.out.println("Alternate email is set");
    }
    public void getInfo(){
        System.out.println("New:"+this.fname+" "+this.lname);
        System.out.println("Department:"+this.dept);
        System.out.println("Email:"+this.email);
        System.out.println("Password:"+this.password);
        System.out.println("Mailbox capacity:"+this.mailcapacity);
        System.out.println("Alternate mail"+this.alter_mail);
    }


    
}
