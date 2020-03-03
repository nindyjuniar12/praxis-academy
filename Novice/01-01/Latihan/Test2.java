import java.io.*;
public class Test2 {

  //variabel instan ini terlihat untuk setiap kelas anak.
   public String name;

   // variabel gaji hanya terlihat di kelas Karyawan.
   private double salary;

   // The name variable is assigned in the constructor.
   public Test2 (String empName) {
      name = empName;
   }

   // The salary variable is assigned a value.
   public void setSalary(double empSal) {
      salary = empSal;
   }

   // This method prints the employee details.
   public void printEmp() {
      System.out.println("name  : " + name );
      System.out.println("salary :" + salary);
   }

   public static void main(String args[]) {
      Test2 empOne = new Test2("Nindy");
      empOne.setSalary(1000);
      empOne.printEmp();
   }
}