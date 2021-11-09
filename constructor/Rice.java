public class Rice 
{
String brand;
String name;
float quantity;
int price;
char colour;
String[] names= new String[4];
Rice(String []names)
{
for(int i=0;i<names.length;i++)
System.out.println(names[i]);
 }
Rice()
 {
System.out.println("RICE ");
 }
Rice(String name,int price)
{
this.name=name;
this.price=price;
System.out.println(name+"\t"+price);
}
Rice( String brand, String name,float size,int price,char colour)
{
this.brand=brand;
this.name=name;
this.quantity=quantity;
this.price=price;
this.colour=colour;
System.out.println(brand +"\t" +name +"\t" +quantity +"\t" +price +"\t" +colour);
         }
}