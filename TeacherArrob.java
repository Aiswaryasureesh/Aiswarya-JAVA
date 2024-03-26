import java.util.Scanner;
class Employee
{
protected int empid;
protected String name;
protected double salary;
protected String address;
public Employee(int empid,string name,double salary,string address)
{
this.empid=empid;
this.name=name;
this.salary=salary;
this.address=address;
}
}
class Teacher extends Employee
{
private String dept;
private String sub;
public Teacher(int empid,String name,double salary,String address,string dept,String sub)
{
Super(empid,name,salary,address);
this.dept=dept;
this.sub=sub;
}
public void display()
{
System.out.println("employeeid:"+empid);
System.out.println("name:"+name);
System.out.println("salary:"+salary);
System.out.println("address:"+address);
System.out.println("department:"+dept);
System.out.println("Subjects taught:"+sub);
System.out.println();
}
}
public class TeacherArrob
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the number of teacher:");
int N=sc.nextInt();
sc.nextLine();
Teacher [] teachers=new Teacher[N];
System.out.println("enter details for Teacher");
for(int i=0;i<N;i++)
{
System.out.print("employeeid:");
int empid=sc.nextInt();
sc.nextLine();
System.out.print("name:");
String name=sc.nextLine();
System.out.print("salary:");
double salary=sc.nextDouble();
sc.nextLine();
System.out.print("address:");
String address=sc.nextLine();
System.out.print("department:");
String dept=sc.nextLine();
System.out.print("subject taught:");
String sub=sc.nextLine();
teacher[i]=new Teacher(empid,name,salary,address,dept,sub);
}
System.out.println("/n details of all teacher:");
for(Teacher teacher:teachers)
teacher.display();
}
}

