class TestVehicles
{
  public static void main(String []args){
 
Vehicles v=new Vehicles(args);
     

Vehicles v1=new Vehicles("car");
  String res=v1.printall();
  System.out.println(res);

Vehicles v2=new Vehicles("bike","red");
  String res2=v2.printall();
  System.out.println(res2);
 
 short price=20000;
 boolean useful=true;
Vehicles v3=new Vehicles("cycle","black", price ,useful);
   System.out.println(v3.printall());
  }

}
  