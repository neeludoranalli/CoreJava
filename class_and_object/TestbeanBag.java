class TestbeanBag
{
public static void main(String []args)
{
float perimeter=beanBag.perimeter;
System.out.println(perimeter);
double beans=beanBag.noOfBeans;
System.out.println(beans);
beanBag bag = new beanBag();
float size=bag.size;
System.out.println(size);
int Bags =bag.noOfBags;
System.out.println(Bags);
float width=bag.width;
System.out.println(width);
beanBag.sit();
beanBag.carry();
String comfort=bag.comfortable();
String flex =bag.flexible();
String usage=bag.use();
System.out.println(comfort);
System.out.println(flex);
System.out.println(usage);
}
}