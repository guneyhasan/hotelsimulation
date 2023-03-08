import java.io.*;

public class Main {

    static int employeeNumber=0;
    static int roomNumber=0;
    static int customerNumber=0;
    static int reservationNumber=0;
    static Hotel hotel= new Hotel();

    static String input;
    static String[] splittedCommands;

    static void addRoom(String[] a,int i)
    {
        for(int j=0;j<Integer.valueOf(a[1]);j++){
            Room c = new Room();
            //c is class of rooms
            c.type=a[2];
            c.aircondition=Boolean.valueOf(a[3]);
            c.balcony=Boolean.valueOf(a[4]);
            c.price=Integer.valueOf(a[5]);
            c.isReserved=false;

            hotel.Rooms[i]=c;
            i++;
            roomNumber++;
        }

    }
    static void addEmployee(String[] a,int i)
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

        hotel.Employees[i]=b;
        employeeNumber++;

    }

    static void addCustomer(String[] a,int i){
        Customer d= new Customer();
        //d is class of customers
        d.name=a[1];
        d.surname=a[2];
        d.gender=a[3];
        d.birthday=a[4];
        d.adresstext=a[5];
        d.district=a[6];
        d.city=a[7];
        d.phone=a[8];

        hotel.Customers[i]=d;

        customerNumber++;
    }

    static void addReservation(String[] a,int i){
        //c is class of rooms
        if(hotel.Rooms[Integer.valueOf(a[2])-1]!=null && hotel.Rooms[Integer.valueOf(a[2])-1].isReserved==false)
        {
            hotel.Rooms[Integer.valueOf(a[2])-1].isReserved=true;

            Reservation e= new Reservation();
            //e is class of reservations
            e.customerId=Integer.valueOf(a[1])-1;
            e.roomId=Integer.valueOf(a[2])-1;
            e.startDate=a[3];
            e.endDate=a[4];

            hotel.Reservations[i]=e;

            reservationNumber++;
        }
    }

    static void listRooms(){
        System.out.println(" ");
        //c is class of rooms
        for(int i=0;i<hotel.Rooms.length;i++){
            if(hotel.Rooms[i]!=null){
                System.out.print("  Room #"+(i+1)+" ");
                System.out.print(hotel.Rooms[i].type+" ");
                if(hotel.Rooms[i].aircondition==true){
                    System.out.print("aircondition ");
                }
                else {
                    System.out.print("no-aircondition ");
                }
                if(hotel.Rooms[i].balcony==true){
                    System.out.print("balcony ");
                }
                else{
                    System.out.print("no-balcony ");
                }
                System.out.print( hotel.Rooms[i].price+" ");
                System.out.println(" ");
            }
        }
        System.out.println(" ");
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

    static void listCustomers(){
        System.out.println(" ");
        //d is class of customers
        for(int i=0;i<hotel.Customers.length;i++){
            if(hotel.Customers[i]!=null){
                System.out.print("  Customers #"+(i+1)+" ");
                System.out.print(hotel.Customers[i].name+" ");
                System.out.print(hotel.Customers[i].surname+" ");
                System.out.print(hotel.Customers[i].gender+" ");
                System.out.print(hotel.Customers[i].birthday+" ");
                System.out.print(hotel.Customers[i].adresstext+" ");
                System.out.print(hotel.Customers[i].district+" ");
                System.out.print(hotel.Customers[i].city+" ");
                System.out.print(hotel.Customers[i].phone+" ");
                System.out.println("");
            }
        }
    }

    static void listReservations(){
        for(int i =0;i<hotel.Reservations.length;i++){
            if(hotel.Reservations[i]!=null){
                System.out.print("  Room #");
                System.out.print((hotel.Reservations[i].roomId+1)+" ");
                // d is class of customers
                System.out.print(hotel.Customers[hotel.Reservations[i].customerId].name+" "+hotel.Customers[hotel.Reservations[i].customerId].surname+" ");
                System.out.print( hotel.Reservations[i].startDate+" ");
                System.out.print( hotel.Reservations[i].endDate+" ");
                System.out.println(" ");
            }
        }
    }

    /*
    static void searchCustomer(String a){
        char[] check=a.toCharArray();
        if(a.endsWith("*") && check[check.length-2]!='*'  || a.endsWith("?") && check[check.length-2]!='?'){

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
    */
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

            else if(splittedCommands[0].equals("addReservation")){
                //this if for visual improvements
                if(reservationNumber==0){
                    System.out.println(" ");
                }
                System.out.println(input);
                addReservation(splittedCommands,reservationNumber);
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

            else if(splittedCommands[0].equals("listReservations")){
                System.out.println("");
                System.out.println(input);
                listReservations();
            }

            else if(splittedCommands[0].equals("searchCustomer")){
                System.out.println("");
                System.out.println(input);
                //searchCustomer(splittedCommands[1].toString());
            }
        }

        commands.close();
    }
}



