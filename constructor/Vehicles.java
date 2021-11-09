class Vehicles
{
 String name;
 String color;
 short wheels;
boolean useful;
 String[] args=new String[5];
 
Vehicles(String []args)
{
   System.out.println("Vehicels");
   for(int i=0;i<args.length;i++)
{
    System.out.println(args[i]);
 }
}
  
Vehicles(String n) 
{
name=n;
}
Vehicles(String name,String color)
{
this.name=name;
this.color=color;
}
Vehicles(String name ,String color,short wheels,boolean useful)
{
this(name) ;
this.color=color;
this.wheels=wheels;
this.useful=useful;
 }
  
  String printall(){
  
  String display = name+"  "+color+"   "+wheels+"  "+useful   ;
  
    return display;
     }

 }
