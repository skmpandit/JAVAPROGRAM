package garbage;

public class garbage2 
{
	 private int ID;
	 private String name;
	 private int age;
	 private static int nextId=1;
	 public garbage2(String name,int age)
	 {
		 this.name=name;
		 this.age=age;
		 this.ID=nextId;
	 }
	 public void show()
	 {
		 System.out.println("ID = "+ID+"\nName = "+name+"\nAge = "+age);
	 }
	 public void showNextId()
	 {
		 System.out.println("Next employee id will be = "+nextId);
	 }
}
class usseEmployee
{
	public static void main(String[] args)
	{
		garbage2 E=new garbage2("GFG1",58);
		garbage2 S=new garbage2("GFD1",530);
		garbage2 B=new garbage2("GFH1",60);
		E.show();
		S.show();
		B.show();
		E.showNextId();
		S.showNextId();
		B.showNextId();
		{
			garbage2 X=new garbage2("TMD2",34);
			garbage2 Y=new garbage2("TMF2",74);
			X.show();
			Y.show();
			X.showNextId();
			Y.showNextId();
		}
		E.showNextId();
	}
}
