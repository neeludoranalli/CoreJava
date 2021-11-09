class TestBag
{
  public static void main(String []args){
 
 Bag b=new Bag(args);
     

 Bag b1=new Bag("Skybags");
  String res=b1.printall();
  System.out.println(res);

Bag b2=new Bag("adidas","School bag");
  String res2=b2.printall();
  System.out.println(res2);
 
 short price=2000;
 boolean useful=true;
Bag b3=new Bag("skybag","hand bag", price ,useful);
   System.out.println(b3.printall());
  }

}
  