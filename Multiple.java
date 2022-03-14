interface employee{
    void setename(String a);
    void setesal(int b);
}

interface family{  
    void setnop(int c);
}

class person implements employee,family{
    String ename;
    int age;
    int esal;
    int nop;
    
    public void setename(String name){
        ename = name;
    } 
    public void setesal(int sal){
        esal = sal;
    }
    public void setnop(int p){
        nop = p;
    }
    public void setage(int value){
        age = value;
    }
    public void print(){
        System.out.println("Person Name: " + ename +
        "\nPerson age: " + age +
        "\nPerson Salary: " + esal +
        "\nNo. of person in family" + nop);
    }

}

public class Multiple {
    public static void main(String[] args) {
        person obj = new person();
        obj.setename("Manish");
        obj.setage(25);
        obj.setesal(100000);
        obj.setnop(10);
        obj.print();
    }
}
