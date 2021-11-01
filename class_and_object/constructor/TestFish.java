class TestFish
{
public static void main(String []args)
{
Fish starfish=new Fish();
starfish.name="smallfish";
String name=starfish.name;
System.out.println(name);
starfish.size=20;
int size=starfish.size;
System.out.println(size);
starfish.weight=100f;
float weight=starfish.weight;
System.out.println(weight);
starfish.noOfWings=2;
byte noOfWings=starfish.noOfWings;
System.out.println(noOfWings);
}
}