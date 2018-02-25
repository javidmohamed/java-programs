class DevopsStudent
{
  String name;
  int age;

public void display()
{

System.out.println("Displaying student detail...");
System.out.println("Name is : "+name);
System.out.println("Age is : "+age);

}

public static void main(String[] args)
{
System.out.println("Inside main method.....");

//display();
// syntax :   ClassName objectname=new ClassName();

DevopsStudent stud=new DevopsStudent();

stud.display();

stud.name="Apsal";
stud.age=20;
stud.display();

}


}