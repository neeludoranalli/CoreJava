class Stand
{
static void stand()
{
System.out.println("shows the features of stand");
}
static void count(int legs)
{
System.out.println("total number of legs for stand" +legs);
}

static void count(int legs,float size)
{
System.out.println("total number of legs for stand and size" +legs +"\t" +size);
}
static void hit(int time)
{
System.out.println("stand can hit " +time);
}
}
class TestStand
{
public static void main(String []args)
{
int std = 2;
float siz = 900.0f;
Stand.count(std,siz);
int num =5;
Stand.hit(num);
}
}