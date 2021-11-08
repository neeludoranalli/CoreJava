class MusicalInstruments
{

String name;
int size;
String shape;
 
MusicalInstruments(String n,int s,String sh)
{
name=n;
size=s;
shape=sh;
}
String DisplayAll()
{
String print=name+"\t"+size+"\t"+shape;
return print;
}
}
