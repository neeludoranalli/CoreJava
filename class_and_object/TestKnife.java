class TestKnife
{
public static void main(String []args)
{
flaoat length=Knife.length;
System.out.println(length);
int num=Knife.noOfKnife;
System.out.println(num);
Knife nife=new Knife();
byte size=nife.size;
System.out.println(size);
String clr=nife.color;
System.out.println(clr);
float wght=nife.weight;
System.out.println(wght);
Knife.cut();
Knife.kill();
String break=nife.break();
String pain=nife.pain();
String hurt=nife.hurt();
System.out.println(break);
System.out.println(pain);
System.out.println(hurt);
}
}