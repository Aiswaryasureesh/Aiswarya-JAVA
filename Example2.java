import java.util.Scanner;
public class Example2
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.print("enter name: ");
String na=input.nextLine();
System.out.print("enter age: ");
int age=input.nextInt();
System.out.println("name:"+na+"\nage:"+age);	
}
}
