class Employee{
  int salary =10000;
}
class Accountant extends Employee
{
  int id= 1001;
}
class Main {
    public static void main(String[]args)
  {
    Accountant A = new Accountant();
    System.out.println("Salary: " + A.salary); 
        System.out.println("ID: " + A.id);        
  }
  }
