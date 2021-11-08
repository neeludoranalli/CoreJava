class Remote
{

String name;
int buttons;
int size;

Remote(String n,int b,int s)
{
name=n;
buttons=b;
size=s;
}
String DisplayAll()
{
String print=name+"\t"+buttons+"\t"+size;
return print;
}
}
