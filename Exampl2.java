import java.util.Scanner;
public class Example2
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.print("Enter name: ");
String na = input.nextLine();
System.out.print("Enter age: ");
int age = input.nextInt();
System.out.print("Name:" + na +"\nAge: " +age);
}
}
