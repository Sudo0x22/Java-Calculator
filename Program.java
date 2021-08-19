import java.util.Scanner;
import java.util.*;

class BlueSoftwareInJava {
    public static void main(String[] args) {
        String Title = "[-] First Java Project [-]";
        String about = "[-] Coded in Java [-]";
        System.out.println(Title);
        System.out.println(about);

        Scanner user = new Scanner(System.in);
        System.out.println("[-] Enter Username: ");
        String username = user.next();

        if (username != "") {
            Scanner pass = new Scanner(System.in);
            System.out.println("[-] Enter Password: ");
            String password = pass.next();
            if (username != "" && password != "") {
                System.out.println("[+] Calculator In Java [+]");
                while(username != "" && password != "") {
                    System.out.println("[+] Enter Two Numbers: ");
                    Scanner cal = new Scanner(System.in);
                    int number_one, number_two;
                    number_one = cal.nextInt();
                    number_two = cal.nextInt();
                    int answer;
                    System.out.println("1 For Add, 2 For sub, 3 for multi, 4 for div 5 for greater, 6 for less then");
                    int type;
                    type = cal.nextInt();
                    if (type == 1) {
                        System.out.println(add(number_one, number_two));
                    } else if (type == 2) {
                        System.out.println(sub(number_one, number_two));
                    } else if (type == 3) {
                        System.out.println(multi(number_one, number_two));
                    } else if (type == 4) {
                        System.out.println(div(number_one, number_two));
                    } else {
                        System.out.println("[+] Please enter two numbers or more...");
                    }
                }
            } else {
                System.out.println("[--] Error Please enter a password...");
            }
        } else {
            System.out.println("[--] Error Please enter a username...");
        }
    }

    public static int add(int y, int x) {
        int result = y + x;
        return result;
    }
    public static int sub(int y, int x) {
        int result = y - x;
        return result;
    }
    public static int multi(int y, int x) {
        int result = y * x;
        return result;
    }
    public static int div(int y, int x) {
        int result = y % x;
        return result;
    }
    public static int greater(int y, int x) {
        int result = y > x;
        return result;
    }
    public static int less(int y, int x) {
        int result = y < x;
        return result;
    }
}