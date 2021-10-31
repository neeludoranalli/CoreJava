class TestOrganisms
{
public static void main(String []args)
{
Organisms cell=new Organisms();
cell.name="Amiba";
String name=cell.name;
System.out.println(name);
cell.noOfBacteria=20;
int noOfBacteria=cell.noOfBacteria;
System.out.println(noOfBacteria);
cell.length=107f;
float length=cell.length;
System.out.println(length);
cell.noOfOrganisms=3;
byte noOfOrganisms=cell.noOfOrganisms;
System.out.println(noOfOrganisms);
cell.noOfCells=234;
int noOfCells=cell.noOfCells;
System.out.println(noOfCells);
}
}