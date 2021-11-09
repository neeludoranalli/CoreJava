class Boat
{
 String name;
 String color;
 int size;
boolean useful;
 String[] args=new String[5];
 
Boat(String []args)
{
   System.out.println("Vehicels");
   for(int i=0;i<args.length;i++)
{
    System.out.println(args[i]);
 }
}
  
Boat(String n) 
{
name=n;
}
Boat(String name,String color)
{
this.name=name;
this.color=color;
}
Boat(String name ,String color,int size,boolean useful)
{
this(name) ;
this.color=color;
this.size=size;
this.useful=useful;
 }
  
  String printall(){
  
  String display = name+"  "+color+"   "+size+"  "+useful   ;
  
    return display;
     }

 }
