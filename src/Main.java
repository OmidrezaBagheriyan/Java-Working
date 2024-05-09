import java.util.Scanner;

public class Main {

    String fullName, job, tel, email;

    public static void main(String[] args) {
        Main main = new Main();
        main.setup();
    }

    void setup() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter full name:");
        String fullName = sc.nextLine();
        System.out.println("Please enter job:");
        String job = sc.nextLine();
        System.out.println("Please enter tel:");
        String tel = sc.nextLine();
        System.out.println("Please enter email:");
        String email = sc.nextLine();
        input(fullName, job, tel, email);
        sc.close();
        System.out.println("\nYour card visit");
        System.out.println(showInputs());
    }

    void input(String fullName, String job, String tel, String email) {
        this.fullName = fullName;
        this.job = job;
        this.tel = tel;
        this.email = email;
    }

    String showInputs() {
        return String.format("%1$s\n%2$s\n%3$s\n%4$s", this.fullName, this.job, this.tel, this.email);
    }
}