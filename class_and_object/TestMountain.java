class TestMountain
{
public static void main(String []args)
{
float height=Mountain.height;
System.out.println(height);
double width=Mountain.width;
System.out.println(width);
Mountain moun= new Mountain();
String name=moun.name;
System.out.println(name);
int mountain=moun.noOfMountain;
System.out.println(mountain);
Mountain.peak();
Mountain.steep();
String rdg=moun.ridges();
String ls=moun.landscape();
String vw=moun.view();
System.out.println(rdg);
System.out.println(ls);
System.out.println(vw);
}
}