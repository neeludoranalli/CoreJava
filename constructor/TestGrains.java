class TestMammals
{
public static void main(String []args)
{
Grains grn=new Grains();
grn.name="POPCORN";
String name=grn.name;
System.out.println(name);
grn.noOfGrains=500;
int noofGrains=grn.noOfGrains;
System.out.println(noofGrains);
grn.weight=98f;
float weight=grn.weight;
System.out.println(weight);
}
}