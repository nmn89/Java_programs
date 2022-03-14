class one{
    public void show1(){
        System.out.println("Multilewel Inheritance");
    }
}
class two extends one{
    public void show2(){
        System.out.println("Ongraph");
    } 
}
class three extends two{
    public void show3(){
        System.out.println("Technologies");
    }
}
public class Text {
    public static void main(String[] args){
        three obj = new three();
        obj.show1();
        obj.show2();
        obj.show3();
    }
}
