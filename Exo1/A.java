package Exo1;

public class A{
    int i;
    public A(){
    System.out.println("init A");
    this.i = 3;
    }
    public A(int i){
    System.out.println("init A");
    this.i = i;
    }
    public String toString(){
    return "A avec i="+i;
    }
    }