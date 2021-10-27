class Shoes
{
static void Color()
{
System.out.println("shows the color of shoes");
}
static void size(int num)
{
System.out.println("Shoe size is:" +num);
}

static void size(int num,float weight)
{
System.out.println("size of shoe and weight of shoe" +num +"\t" +weight);
}
static void price(float cost)
{
System.out.println("price of shoes" +cost);
}
}
class TestShoes
{
public static void main(String []args)
{
int num = 4;
float gram = 30.0f;
Shoes.size(num,gram);
float costt = 4999.0f;
Shoes.price(costt);
}
}