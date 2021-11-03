class TestBook
{
public static void main(String []args)
{
Book.open();
Book book=new Book();
int BOOK=book.close();
System.out.println(BOOK);
}
}