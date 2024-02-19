package Exo1;

public class B extends A{
    A a;
    int i;
    public B(){
    super();
    System.out.println("init B");
    this.a = new A(5);
    this.i = 4;
    }
    public String toString(){
    return "B avec i="+i+" et "+a.toString();
    }
    public static void main(String[] t){
    A b = new B();
    System.out.println(b.toString());
    }
    }