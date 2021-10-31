class TestPark
{
public static void main(String []args)
{
Park park=new Park();
park.name="lalbag";
String name=park.name;
System.out.println(name);
park.noOfPark=2000;
int noofpark=park.noOfPark;
System.out.println(noofpark);
park.length=98f;
float length=park.length;
System.out.println(length);
park.size=10;
byte size=park.size;
System.out.println(size);
park.noOfTree=30;
int noOfTree=park.noOfTree;
System.out.println(noOfTree);
}
}