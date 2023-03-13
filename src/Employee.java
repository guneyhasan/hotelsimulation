public class Employee {
   public String name;
   public String surname;
   public String gender;
   public String birthday;
   public String adresstext;
   public String district;
   public String city;
   public String phone;
   public String job;
   public int salary;

   static int employeeNumber=0;

   private static Hotel hotel =new Hotel();

   static void addEmployee(String[] a)
   {
      Employee b= new Employee();
      //b is class of employees
      b.name=a[1];
      b.surname=a[2];
      b.gender=a[3];
      b.birthday=a[4];
      b.adresstext=a[5];
      b.district=a[6];
      b.city=a[7];
      b.phone=a[8];
      b.job=a[9];
      b.salary=Integer.valueOf(a[10]);

      hotel.Employees[employeeNumber]=b;
      employeeNumber++;

   }

   static void listEmployees(){
      System.out.println(" ");
      //b is class of employees
      for(int i=0;i<hotel.Employees.length;i++){
         if(hotel.Employees[i]!=null)
         {
            System.out.print("  Employee #"+(i+1)+" ");
            System.out.print(hotel.Employees[i].name+" ");
            System.out.print(hotel.Employees[i].surname+" ");
            System.out.print(hotel.Employees[i].gender+" ");
            System.out.print(hotel.Employees[i].birthday+" ");
            System.out.print(hotel.Employees[i].adresstext+" ");
            System.out.print(hotel.Employees[i].district+" ");
            System.out.print(hotel.Employees[i].city+" ");
            System.out.print(hotel.Employees[i].phone+" ");
            System.out.print(hotel.Employees[i].job+" ");
            System.out.print(hotel.Employees[i].salary+" ");
            System.out.println("");
         }
      }
      System.out.println(" ");
   }
}
