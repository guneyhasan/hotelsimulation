public class Room {

    public String type;

    public boolean aircondition;

    public boolean balcony;

    public int price;

    public boolean isReserved;

    static int roomNumber=0;

    private static Hotel hotel= new Hotel();

    static void addRoom(String[] a)
    {
        for(int j=0;j<Integer.valueOf(a[1]);j++){
            Room c = new Room();
            //c is class of rooms
            c.type=a[2];
            c.aircondition=Boolean.valueOf(a[3]);
            c.balcony=Boolean.valueOf(a[4]);
            c.price=Integer.valueOf(a[5]);
            c.isReserved=false;

            hotel.Rooms[roomNumber]=c;
            roomNumber++;
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


}
