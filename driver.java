abstract class company{
    String cname;
    abstract void out();
    public company(String cname){
        System.out.println("Abstract(Parent) class Constructor called");
        this.cname = cname;
    }  
}

class employee extends company{
    int eno;
    int esal;
    public employee(String cname,int eno, int esal){
        super(cname);
        System.out.println("Base class Constructor called");
        this.eno = eno;
        this.esal = esal;
    }
    void out(){
        System.out.println("Company name is " + cname +
         "\nEmployee no. is " + eno + 
         "\nEmployee Salary is " + esal);
    }
}
public class driver {
    public static void main(String[] args) {
        employee e = new employee("Ongraph", 507, 50000);
        e.out();
    }
}
