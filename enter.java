class parent{
    public void fun1(){
        System.out.println("Parent fun1()");
    }
    public void fun2(){
        System.out.println("Parent fun2()");
    }
}
class child extends parent{
    public void fun1(){
        System.out.println("child fun1()");
    }
    public void fun2(){
        System.out.println("child fun2()");
    }
}
public class enter {
    public static void main(String[] args) {
        parent a = new parent();
        a.fun1();
        a.fun2();
        parent b = new child();
        b.fun1();
        b.fun2();   
    }
}
