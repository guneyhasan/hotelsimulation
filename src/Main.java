import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int employeeNumber=0;
    static int roomNumber=0;
    static int customerNumber=0;
    static Employee b= new Employee();
    static rooms c = new rooms();
    static Customer d= new Customer();
    static String input;
    static String[] splittedCommands;
    static void addRoom(String[] a,int i)
    {
        //c is class of rooms
        c.numberOfRooms[i]=Integer.valueOf(a[1]);
        c.type[i]=a[2];
        c.aircondition[i]=Boolean.valueOf(a[3]);
        c.balcony[i]=Boolean.valueOf(a[4]);
        c.price[i]=Integer.valueOf(a[5]);

        roomNumber++;

    }
    static void addEmployee(String[] a,int i)
    {
        //b is class of employees
        b.name[i]=a[1];
        b.surname[i]=a[2];
        b.gender[i]=a[3];
        b.birthday[i]=a[4];
        b.adresstext[i]=a[5];
        b.district[i]=a[6];
        b.city[i]=a[7];
        b.phone[i]=a[8];
        b.job[i]=a[9];
        b.salary[i]=Integer.valueOf(a[10]);

        employeeNumber++;

    }

    static void addCustomer(String[] a,int i){
        //d is class of customers
        d.name[i]=a[1];
        d.surname[i]=a[2];
        d.gender[i]=a[3];
        d.birthday[i]=a[4];
        d.adresstext[i]=a[5];
        d.district[i]=a[6];
        d.city[i]=a[7];
        d.phone[i]=a[8];

        customerNumber++;
    }

    static void listRooms(){
        System.out.println(" ");
        //c is class of rooms
        for(int i=0;i<c.price.length;i++){
            if(c.type[i]!=null){
                System.out.print("  Room #"+(i+1)+" ");
                System.out.print(c.numberOfRooms[i]+" ");
                System.out.print(c.type[i]+" ");
                if(c.aircondition[i]==true){
                    System.out.print("aircondition ");
                }
                else {
                    System.out.print("no-aircondition ");
                }
                if(c.balcony[i]==true){
                    System.out.print("balcony ");
                }
                else{
                    System.out.print("no-balcony ");
                }
                System.out.print( c.price[i]+" ");
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }
    static void listEmployees(){
        System.out.println(" ");
        //b is class of employees
        for(int i=0;i<b.name.length;i++){
            if(b.name[i]!=null){
                System.out.print("  Employee #"+(i+1)+" ");
                System.out.print(b.name[i]+" ");
                System.out.print(b.surname[i]+" ");
                System.out.print(b.gender[i]+" ");
                System.out.print(b.birthday[i]+" ");
                System.out.print(b.adresstext[i]+" ");
                System.out.print(b.district[i]+" ");
                System.out.print(b.city[i]+" ");
                System.out.print(b.phone[i]+" ");
                System.out.print(b.job[i]+" ");
                System.out.print(b.salary[i]+" ");
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

    static void listCustomers(){
        System.out.println(" ");
        //d is class of customers
        for(int i=0;i<d.name.length;i++){
            if(d.name[i]!=null){
                System.out.print("  Customers #"+(i+1)+" ");
                System.out.print(d.name[i]+" ");
                System.out.print(d.surname[i]+" ");
                System.out.print(d.gender[i]+" ");
                System.out.print(d.birthday[i]+" ");
                System.out.print(d.adresstext[i]+" ");
                System.out.print(d.district[i]+" ");
                System.out.print(d.city[i]+" ");
                System.out.print(d.phone[i]+" ");
                System.out.println("");
            }
        }
    }

    static void searchCustomer(String a){
        if(a.endsWith("*")  || a.endsWith("?")){

            if(a.endsWith("*")){
                a=a.substring(0,a.indexOf('*'));
            }

            if(a.endsWith("?")){
                a=a.substring(0,a.indexOf('?'));
            }

            //d is class of customers
            for(int i=0;i<d.name.length;i++){
                if(d.name[i]!=null){
                    if(d.name[i].toString().contains(a)){
                        System.out.print("  Customers #"+(i+1)+" ");
                        System.out.print(d.name[i]+" ");
                        System.out.print(d.surname[i]+" ");
                        System.out.print(d.gender[i]+" ");
                        System.out.print(d.birthday[i]+" ");
                        System.out.print(d.adresstext[i]+" ");
                        System.out.print(d.district[i]+" ");
                        System.out.print(d.city[i]+" ");
                        System.out.print(d.phone[i]+" ");
                        System.out.println("");
                    }
                }
            }
        }
    }
    //splitting commands.txt and adding them to the array
    public static void main(String[] args) throws IOException
    {
        //reading text file
        BufferedReader commands= new BufferedReader(new FileReader("commands.txt"));
        //adding them to array with splitting
        while((input=commands.readLine())!=null){
            splittedCommands=input.split(";");
        //checking their commands
            if(splittedCommands[0].equals("addRoom")){
                //this is for visual improvements
                if(roomNumber==0){
                    System.out.println(" ");
                }
                System.out.println(input);
                addRoom(splittedCommands,roomNumber);
            }

            else if(splittedCommands[0].equals("addEmployee")){
                //this is for visual improvements
                if(employeeNumber==0){
                    System.out.println(" ");
                }
                System.out.println(input);
                addEmployee(splittedCommands,employeeNumber);
            }

            else if (splittedCommands[0].equals("addCustomer")){
                //this is for visual improvements
                if(customerNumber==0){
                    System.out.println(" ");
                }
                System.out.println(input);
                addCustomer(splittedCommands,customerNumber);
            }
            else if(splittedCommands[0].equals("listEmployees")){
                System.out.println("");
                System.out.println(input);
                listEmployees();
            }

            else if(splittedCommands[0].equals("listRooms")){
                System.out.println("");
                System.out.println(input);
                listRooms();
            }

            else if(splittedCommands[0].equals("listCustomers")){
                System.out.println("");
                System.out.println(input);
                listCustomers();
            }

            else if(splittedCommands[0].equals("searchCustomer")){
                System.out.println("");
                System.out.println(input);
                searchCustomer(splittedCommands[1].toString());
            }


        }

        commands.close();
    }
}



