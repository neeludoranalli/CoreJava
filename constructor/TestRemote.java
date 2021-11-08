class TestRemote
{
public static void main(String []args)
{ 
Remote remote=new Remote("tv remote",12,4);
String res=remote.DisplayAll();
System.out.println(res);
}
}