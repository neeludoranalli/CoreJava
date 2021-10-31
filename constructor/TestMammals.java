class TestMammals
{
public static void main(String []args)
{
Mammals maml=new Mammals();
maml.name="WHALES";
String name=maml.name;
System.out.println(name);
maml.noOfGlands=5;
int noofGlands=maml.noOfGlands;
System.out.println(noofGlands);
maml.noOfBones=3;
int noofBones=maml.noOfBones;
System.out.println(noofBones);
maml.weight=98f;
float weight=maml.weight;
System.out.println(weight);
maml.noOfHeart=4;
int noofHeart=maml.noOfHeart;
System.out.println(noofHeart);
}
}