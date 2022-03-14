package Inheritance;

class Bicycle{
    public int gear;
    public int speed;
    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }
    public String toString(){
        return ("No of gears: " + gear + "\n"+ "speed of bicycle: " + speed);
    }
}
 
class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int gear,int speed,int startHeight){
        super(gear,speed);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    public String toString(){
        return (super.toString() + "\nseat height is "+ seatHeight);
    }
}
 
public class Basic_Inheritance{
    public static void main(String args[]){
        MountainBike mb = new MountainBike(5, 50, 13);
        System.out.println(mb.toString());
    }
}