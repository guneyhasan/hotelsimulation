import java.io.*;


public class Main {

    public static Room room =new Room();
    public static Employee employee= new Employee();
    public static Customer customer=  new Customer();
    public static Reservation reservation = new Reservation();
    static String input;
    static String[] splittedCommands;


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
            if(input.equals("")){
                System.out.println(" ");
            }

            else{
                splittedCommands=input.split(";");
                //checking their commands

                if(splittedCommands[0].equals("addRoom")){
                    System.out.println(input);
                    room.addRoom(splittedCommands);
                }

                else if(splittedCommands[0].equals("addEmployee")){
                    System.out.println(input);
                    employee.addEmployee(splittedCommands);
                }

                else if (splittedCommands[0].equals("addCustomer")){
                    System.out.println(input);
                    customer.addCustomer(splittedCommands);
                }

                else if(splittedCommands[0].equals("addReservation")){

                    System.out.println(input);
                    reservation.addReservation(splittedCommands);
                }
                else if(splittedCommands[0].equals("listEmployees")){

                    System.out.println(input);
                    employee.listEmployees();
                }

                else if(splittedCommands[0].equals("listRooms")){
                    System.out.println(input);
                    room.listRooms();
                }

                else if(splittedCommands[0].equals("listCustomers")){
                    System.out.println(input);
                    customer.listCustomers();
                }

                else if(splittedCommands[0].equals("listReservations")){
                    System.out.println(input);
                    reservation.listReservations();
                }

                else if(splittedCommands[0].equals("searchCustomer")){
                    System.out.println(input);
                }
            }
        }

        commands.close();
    }
}



