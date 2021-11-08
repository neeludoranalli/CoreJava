class Keyboard
{
int size;
String color;
int noOfKeys;
String shape;
 
Keyboard(int s,String clr,int keys,String sh)
{
size=s;
color=clr;
noOfKeys=keys;
shape=sh;
}
String DisplayAll()
{
String print=size+"\t"+color+"\t"+noOfKeys+"\t"+shape;
return print;
}
}

