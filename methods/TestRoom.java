class TestRoom
{
public static void main(String []args)
{
Room.open();
Room room=new Room();
String res=room.close();
System.out.println(res);
}
}