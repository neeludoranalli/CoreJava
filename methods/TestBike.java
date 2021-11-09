class TestBike
{
 public static void main(String []args)
{
  Bike.brand(args);
 
  int res= Bike.travel(7000);
  System.out.println(res);

Bike b=new Bike();
  String result=b.colour();
  System.out.println(result);
 
 }

 }