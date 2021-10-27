class Calculator
{
static void Calculate()
{
System.out.println("Calculator Calculates the problem");
}
static void sum(int a,int b)
{
System.out.println("add two numbers" +a +"\t" +b);
}
static void sum(int a,float b,int c)
{
System.out.println("add Three numbers"+a +"\t" +b +"\t" +c);
}
static void sub(int A,int B)
{
System.out.println("Substac two numbers"+A +"\t" +B);
}
}
class TestCalculator
{
public static void main(String []args)
{
int num =6;
int number = 8;
Calculator.sum(num,number);
int aaa = 7;
float bbb = 7.0f;
int ccc = 1;
Calculator.sum(aaa,bbb,ccc);
int AA =5;
int BB = 4;
Calculator.sub(AA,BB);
}
}