public class Customer {
    public String name;
    public String surname;
    public String gender;
    public String birthday;
    public String adresstext;
    public String district;
    public String city;
    public String phone;

    static int customerNumber=0;

    private static Hotel hotel=new Hotel();

    static void addCustomer(String[] a){
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

        hotel.Customers[customerNumber]=d;

        customerNumber++;
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
        System.out.println("");
    }

}
