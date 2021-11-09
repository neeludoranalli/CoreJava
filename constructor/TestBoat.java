class TestBoat
{
  public static void main(String []args){
 
Boat b=new Boat(args);
     

Boat b1=new Boat("titanic");
  String res=b1.printall();
  System.out.println(res);

Boat b2=new Boat("titanic","red");
  String res2=b2.printall();
  System.out.println(res2);
 
int size=463;
 boolean useful=true;
Boat b3=new Boat("cycle","black",size ,useful);
   System.out.println(b3.printall());
  }

}
  