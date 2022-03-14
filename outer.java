class code{
    public code(){
        System.out.println("Method Overloading");
    }
    public int multiply(int a,int b){
        System.out.println("Two integer arguments");
        return a*b;
    }
    public double multiply(double a,double b){
        System.out.println("Two double arguments");
        return a*b;
    }
    public int multiply(int a,int b,int c){
        System.out.println("Three integer arguments");
        return a*b*c;
    }
    public void multiply(char a){
        System.out.println("Single character argument");
    }
}
    
public class outer {
    public static void main(String[] args){
        code a = new code();
        System.out.println(a.multiply(6,2));
        System.out.println(a.multiply(6.0,2.0));
        System.out.println(a.multiply(6,2,3));
        a.multiply('n');
    }
}
