class TestSky
{
public static void main(String []args)
{
float perimeter=Sky.perimeter;
System.out.println(perimeter);
double size=Sky.size;
System.out.println(size);
Sky sky = new Sky();
String color=sky.color;
System.out.println(color);
int radius=sky.radius;
System.out.println(radius);
float length =sky.length;
System.out.println(length);
Sky.rain();
Sky.night();
String lgt=sky.light();
String mov =sky.move();
String rn=sky.rainbow();
System.out.println(lgt);
System.out.println(mov);
System.out.println(rn);
}
}