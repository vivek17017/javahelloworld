package world;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[]args) {
        System.out.println("Enter your name and age");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=0;
        while (!sc.hasNextInt())
        {
            sc.next();

        }
        age=sc.nextInt();
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
