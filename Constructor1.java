class Employee{
int empno;
String eName;
Employee(){
empno = 100;
eName = "Amrita";
}
void show()
{
System.out.println("\n Employee No: " + empno + "\n Employee Name: " + eName);
}
}
class Constructor1{
public static void main(String args[])
{
Employee obj1 = new Employee();
obj1.show();
}
}

