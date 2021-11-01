class TestZoo
{
public static void main(String []args)
{
Zoo zoo=new Zoo();
zoo.name="MysoreZoo";
String name=zoo.name;
System.out.println(name);
zoo.noOfAnimals=20;
int noOfAnimals=zoo.noOfAnimals;
System.out.println(noOfAnimals);
zoo.length=1000f;
float length=zoo.length;
System.out.println(length);
byte noOfTiger=zoo.noOfTiger;
System.out.println(noOfTiger);
int noOfZoo=zoo.noOfZoo;
System.out.println(noOfZoo);
}
}