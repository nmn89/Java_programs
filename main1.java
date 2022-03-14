class One{
    public void show(){
        System.out.println("Single");
    }
}
class Two extends One{
    public void show2(){
        System.out.println("Inheritance");
    }
}
public class main1 {
    public static void main(String[] args){
    Two obj = new Two();
    obj.show();
    obj.show2();
    }
}
