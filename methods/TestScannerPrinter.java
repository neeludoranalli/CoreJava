class ScannerPrinter
{
static void scan()
{
System.out.println("Scan the pages");
}
static void count(int page)
{
System.out.println("Count the pages:" +page);
}

static void count(int page,float line)
{
System.out.println("number of pages and line" +page +"\t" +line);
}
static void print(float pages)
{
System.out.println("Print the pages" +pages);
}
}
class TestScannerPrinter
{
public static void main(String []args)
{
int num = 4;
float lin = 30.0f;
ScannerPrinter.count(num,lin);
float prnt = 65.0f;
ScannerPrinter.print(prnt);
}
}