class Earphones
{
 String brand;
 String types;
 short price;
boolean useful;
 String[] args=new String[5];
 
Earphones(String []args)
{
   System.out.println("Earphones");
   for(int i=0;i<args.length;i++)
{
    System.out.println(args[i]);
 }
}
  
Earphones(String b) 
{
brand=b;
}
Earphones(String brand,String types)
{
this.brand=brand;
this.types=types;
}
Earphones(String b ,String t,short p,boolean n)
{
this(b) ;
this.types=t ;
this.price=p;
this.useful=n;
 }
  
  String printall(){
  
  String display = brand+"  "+types+"   "+price+"  "+useful   ;
  
    return display;
     }

 }
