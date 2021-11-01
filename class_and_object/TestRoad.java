class TestRoad
{
public static void main(String []args)
{
float length=Road.length;
System.out.println(length);
Road rd= new Road();
String name=rd.name;
System.out.println(name);
int roads=rd.noOfRoads;
System.out.println(roads);
Road.walk();
Road.run();
String trvl=rd.travel();
System.out.println(trvl);
}
}