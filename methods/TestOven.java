class Oven
{
static void cook()
{
System.out.println("oven can cook the food");
}
static void cook(int times)
{
System.out.println("oven can cook number of times" +times);
}

static void cook(int times,float type)
{
System.out.println("total number of time and type of food" +times +"\t" +type);
}
static void heat(int item)
{
System.out.println("Oven can heat the number food items" +item);
}
}
class TestOven
{
public static void main(String []args)
{
int ovn = 2;
float typ = 8.0f;
Oven.cook(ovn,typ);
int itm = 5;
Oven.heat(itm);
}
}