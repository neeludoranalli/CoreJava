class Wood
{
static float length = 11f;
static int noOfWoods =2;
byte size = 3;
int noOfBundle = 19;
float width=4f;
static void hit()
{
System.out.println("HIT");
}
static void cut()
{
System.out.println("CUT");
}
String burn()
{
return"fire";
}
String stand()
{
return"wood can stand";
}
String fall()
{
return"wood can fall";
}
}