package cn.cgjiang.test;

class A{
    public String name;
    public A(String name){
        this.name = name;
    }
}
class B{
    private String name;
    public A a =new A("aaaa");
    public B(String name){
        this.name = name;
    }
}

public class test{
    public static void main(String args[]) {

        B b = new B("bbbb");
        System.out.println(b.a.name);
    }
        }