class encapsulate{
    private String name;
    private int age;
    private int sal;
    public void set(String newName,int myAge,int mySal){
        name = newName;
        age = myAge;
        sal = mySal;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getSal(){
        return sal;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        encapsulate obj = new encapsulate();
        obj.set("Manish",22, 50000);
        System.out.println("My name, age and salary is " + 
        obj.getName() + " " +obj.getAge() + " " +obj.getSal());   
    }
}
