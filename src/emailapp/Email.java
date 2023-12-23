package emailapp;
import java.net.SocketPermission;
import java.util.Scanner;

public class Email {
    // we make these content private so that user cann't access 

    private String firstname, lastname, password, department, email, alterEmail;
    private String compSuffix = "anycompany.com";
    private int mailboxCapacity = 500;
    
    private int defaultPasswordLength = 10;

    // we will word via constructuor so that easier to access and receive details
    public Email(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        // System.out.println("Email Created: " + this.firstname +" " + this.lastname);

        this.department = setDepartment();
        // System.out.println("Department: "+ this.department);
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is" + this.password);

        email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department.toLowerCase()+"."+compSuffix.toLowerCase();
        // System.out.println("Your email is: " + email);





    }



    private String setDepartment(){
        System.out.println("Choose the department for company email: \n1 for Sale \n2 for Development \n3 for Accounting \n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1){
            return "Sales";}
        else if (depChoice == 2){
            return "Development";}
        else if (depChoice == 3){
            return "Accounting";}
         else{
            return "";}
    }



    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*-_.,";
        char[] password = new char[length];
        for (int i = 0; i<length; i++){
            int rand = (int) Math.random() * passwordSet.length();
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password); 
    }

    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;

    }
    public void setAlterEmail(String altEmail){
        this.alterEmail = altEmail;
    }
    public void changePassword(String password){
        this.password = password;
    }
    public int getMaiboxCapacity() {return mailboxCapacity;}
    public String getAlternateEmail(){return alterEmail;}
    public String getPassword(){ return password;}

    // This display can be designed as user wants
    public String showInfo(){
        return ("\nDISPLAY NAME: \n First Name= " + firstname + " Last Name= " + lastname +
        "\n COMPANY DEPARTMENT: " + department +
        "\n EMAIL: " + email+
        "\n MAILBOX CAPACITY: " + mailboxCapacity + "Mb");
    }


}
