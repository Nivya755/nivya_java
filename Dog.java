class Dog
{
//Intense Variables
String name;
int age;
//constructor Decleration of class
public Dog(string name,int age)
{
this.name=name;
this.age=age;
}
public void getname()
{
System.out.println(name);
}
public void getAge()
{
System.out.println(age);
}
public static voidmain(string a[])
Dog tuffy=new Dog("tuffy",5);
Dog tuffy1=new Dog("tuffy",4);
Dog tuffy2=new Dog("tuffy2",15);
tuffy.getname();
tuffy.getAge();
tuffy1.getName();
tuffy2.getAge();
}
}