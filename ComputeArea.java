import java.util.Scanner;
public class ComputeArea{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
/*double radius;
double area;
radius=20;
area=radius*radius*3.14159;*/
System.out.println("enter radius: ");
double radius=input.nextDouble();
double area=radius*radius*3.14159;
/*float radius=input.nextFloat();
float area=(float)(radius*radius*3.14);*/
System.out.println("area="+area);
}
}
