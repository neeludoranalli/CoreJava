class TestHotel
{
public static void main(String []args)
{
Hotel htl=new Hotel();
htl.name="Taj";
String name=htl.name;
System.out.println(name);
htl.noOfRooms=200;
int noofroom=htl.noOfRooms;
System.out.println(noofroom);
htl.height=98f;
float height=htl.height;
System.out.println(height);
htl.noOfhotel=30;
int noOfhotel=htl.noOfhotel;
System.out.println(noOfhotel);
}
}