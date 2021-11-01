class TestBiscuits
{
public static void main(String []args)
{
float size=Biscuits.size;
System.out.println(size);
int noofbiscuits=Biscuits.noOfBiscuits;
System.out.println(noofbiscuits);
Biscuits bis = new Biscuits();
float length=bis.size;
System.out.println(length);
String name =bis.name;
System.out.println(name);
float weight=bis.weight;
System.out.println(weight);
Biscuits.taste();
Biscuits.eat();
String brk=bis.break();
String swt =bis.sweet();
String dipp=bis.dip();
System.out.println(brk);
System.out.println(swt);
System.out.println(dipp);
}
}