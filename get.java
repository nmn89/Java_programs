class first{
    public void show1(){
        System.out.println("Hierarchical Inheritance");
    }
}
class second extends first{
    public void show2(){
        System.out.println("class A");
    } 
}
class third extends first{
    public void show3(){
        System.out.println("class B");
    }
}
public class get {
    public static void main(String[] args){
        second a = new second();
        a.show1();
        a.show2();
        third b = new third();
        b.show1();
        b.show3();
    }
}
