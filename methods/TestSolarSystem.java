class SolarSystem
{
static void show()
{
System.out.println("shows Solar System");
}
static void count(int planet)
{
System.out.println("total number of planets" +planet);
}

static void count(int planet,float size)
{
System.out.println("total number of planets" +planet +"\t" +size);
}
static void move(int time)
{
System.out.println("planets are rotating" +time);
}
}
class TestSolarSystem
{
public static void main(String []args)
{
int galaxy = 8;
float siz = 34.0f;
SolarSystem.count(galaxy,siz);
int hour =8;
SolarSystem.move(hour);
}
}