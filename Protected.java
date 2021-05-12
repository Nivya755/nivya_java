class A {
protected int data=40;
protected void msg()
{
System.out.println("HELLO JAVA");}
}

public class Protected {
public static void main(String args[]){
A obj=new A();
System.out.println(obj.data);
obj.msg();
}
}