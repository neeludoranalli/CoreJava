class Bag
{
 String brand;
 String types;
 short price;
boolean useful;
 String[] args=new String[5];
 
Bag(String []args)
{
   System.out.println("Earphones");
   for(int i=0;i<args.length;i++)
{
    System.out.println(args[i]);
 }
}
  
Bag(String b) 
{
brand=b;
}
Bag(String brand,String types)
{
this.brand=brand;
this.types=types;
}
Bag(String b ,String t,short p,boolean n)
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
