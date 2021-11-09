class TestEarphones
{
  public static void main(String []args){
 
  Earphones ep=new Earphones(args);
     

 Earphones ep1=new Earphones("boat");
  String res=ep1.printall();
  System.out.println(res);

Earphones ep2=new Earphones("boat","wired");
  String res2=ep2.printall();
  System.out.println(res2);
 
 short price=2000;
 boolean useful=true;
Earphones er=new Earphones("boat","bluetooth", price ,useful);
   System.out.println(er.printall());
  }

}
  