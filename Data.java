interface Up{

    final int a = 25;

    void fun();

}
public class Data implements Up{

    public void fun(){
        System.out.println("Implementing Interface Fun()");
    }

    public static void main(String[] args) {
        Data obj = new Data();
        obj.fun();
        System.out.println(a);
    }
}
