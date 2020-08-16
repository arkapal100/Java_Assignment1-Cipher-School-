// package Cipher_School.Java_Assignment2;
import java.util.ArrayList;
class Employee{
   int empId;
   String empName;
   String empDes;
   float salary;
   String address;

   public Employee(int empId,String empName,String empDes,float salary,String address)
   {
       this.empId = empId;
       this.empName = empName;
       this.empDes = empDes;
       this.salary = salary;
       this.address = address;
   }


}
public class Problem3 {
    public static void main(String[] args) {
    ArrayList<Employee> list = new ArrayList<>();
    list.add(new Employee(1,"Arka","Programmer",50000,"West Bengal"));
    list.add(new Employee(2,"Ajay","Developer",60000,"Rajasthan"));
    list.add(new Employee(3,"Abhishek","Actor",55000,"Madhyapradesh"));
    list.add(new Employee(4,"Kunal","Trainer",45000,"Madhyapradesh"));
    list.add(new Employee(5,"Naresh","Gamer",40000,"Mandi"));
    list.add(new Employee(6,"Sonu","Scientist",50000,"Hariyana"));
    list.add(new Employee(7,"Dilip","Programmer",50000,"West Bengal"));
    list.add(new Employee(8,"Mahadi","Cyber",50000,"Bangladesh"));
    list.add(new Employee(9,"Susen","Teacher",50000,"West Bengal"));
    list.add(new Employee(10,"Pradipta","Trainee",50000,"Mayanmar"));

    list.stream().forEach(ls -> System.out.println(ls.empName));
    list.stream().filter(ls -> ls.salary > 50000).forEach(ls ->System.out.println(ls.salary));
    list.stream().filter(ls -> ls.address.startsWith("M")).forEach(ls -> System.out.println(ls.address));
    list.stream().filter(ls ->ls.empDes.endsWith("e")).forEach(ls->System.out.println(ls.empDes));
    }
    
}