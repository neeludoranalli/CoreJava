class Application
{
static void record()
{
System.out.println("shows the Records");
}
static void record(float stud_percent,int stud_id)
{
System.out.println("Student percentage is" +stud_percent);
System.out.println("Student id is" +stud_id);
}

static void manage()
{
System.out.println("manages the application");
}
static void manage(int studentid,char grade)
{
System.out.println("Student id is:"+studentid);
System.out.println("Student grade is:"+grade);
}
}
class TestApplication
{
public static void main(String []args)
{
float percent = 95.0f;
int id = 34;
Application.record(percent,id);
int ID =8;
char Student ='b';
Application.manage(ID,Student);
}
}