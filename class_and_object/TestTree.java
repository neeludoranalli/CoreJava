class TestTree
{
public static void main(String []args)
{
float height=Tree.height;
System.out.println(height);
double width=Tree.width;
System.out.println(width);
Tree tr = new Tree();
String name=tr.name;
System.out.println(name);
int mangoes=tr.noOfMangoes;
System.out.println(mangoes);
byte root =tr.noOfRoot;
System.out.println(root);
Tree.grow();
Tree.gives();
String frt=tr.fruits();
String fal=tr.fall();
String absr=tr.absorb();
System.out.println(frt);
System.out.println(fal);
System.out.println(absr);
}
}