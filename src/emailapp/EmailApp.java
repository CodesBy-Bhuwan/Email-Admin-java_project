
package emailapp;

public class EmailApp {
    public static void main(String[] args){
    // We can create dialogue box for username to enter manually;
    Email em1 = new Email("Me", "You");

    // em1.changePassword(password);
    // em1.setAlterEmail("j@gmail.com");
    // System.out.println(em1.getAlternateEmail());
    System.out.println(em1.showInfo());
    }
}

