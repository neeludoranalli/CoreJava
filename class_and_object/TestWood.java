class TestWood
{
public static void main(String []args)
{
float len=Wood.length;
System.out.println(len);
int wood=Wood.noOfWoods;
System.out.println(wood);
Wood stick = new Wood();
byte size=stick.size;
System.out.println(size);
int bundle =stick.noOfBundle;
System.out.println(bundle);
float width =stick.width;
System.out.println(width);
Wood.hit();
Wood.cut();
String fire=stick.burn();
String stnd=stick.stand();
String falll=stick.fall();
System.out.println(fire);
System.out.println(stnd);
System.out.println(falll);
}
}