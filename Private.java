class A {
private int data=40;
private void msg()
{
System.out.println("HELLO JAVA");}
}

public class Private{
public static void main(String args[]){
A obj=new A();
System.out.println(obj.data);
obj.msg();
}
}