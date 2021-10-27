class Time
{
static void show()
{
System.out.println("shows the time");
}
static void show(int num)
{
System.out.println("Show the hour:" +num);
}

static void show(int num,float number)
{
System.out.println("show the hour and minutes" +num +"\t" +number);
}
static void run(float times)
{
System.out.println("Clock can run constantly" +times);
}
}
class TestTime
{
public static void main(String []args)
{
int hr = 4;
float min = 30.0f;
Time.show(hr,min);
float clk = 40.0f;
Time.run(clk);
}
}