public class Reservation {
    public int customerId;
    public int roomId;
    public String startDate;
    public String endDate;

    static int reservationNumber=0;

    private static Hotel hotel=new Hotel();

    static void addReservation(String[] a){
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

            hotel.Reservations[reservationNumber]=e;

            reservationNumber++;
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
}
