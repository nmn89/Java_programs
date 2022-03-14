class parent{
    public void show(){
        System.out.println("Parent class");
    }
}
class child extends parent{
    public void show(){
        System.out.println("Child class");
    } 
}
public class Main2 {
    public static void main(String[] args){
        parent obj1 = new parent();
        obj1.show();
        parent obj2 = new child();
        obj2.show();
    }
}
