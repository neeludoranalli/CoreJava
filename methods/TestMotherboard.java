class Motherboard
{
static void connect()
{
System.out.println("shows the connectivity");
}
static void connect(int times)
{
System.out.println("total number of connection" +times);
}

static void connect(int times,byte socket)
{
System.out.println("total number of connections and number of sockets" +times +"\t" +socket);
}
static void store(int data)
{
System.out.println("Motherboard can store the type of data" +data);
}
}
class TestMotherboard
{
public static void main(String []args)
{
int mthr = 2;
byte sock = 1;
Motherboard.connect(mthr,sock);
int type = 5;
Motherboard.store(type);
}
}