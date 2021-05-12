class A {
 int data=40;
 void msg()
{
System.out.println("HELLO JAVA");}
}

public class SimpleDefault{
public static void main(String args[]){
A obj=new A();
System.out.println(obj.data);
obj.msg();
}
}