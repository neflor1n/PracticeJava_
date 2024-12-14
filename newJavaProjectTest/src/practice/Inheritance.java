package practice;

class Vehicle {
    protected String brand = "Hellcat";
    public void Hunk() {
        System.out.println("Tuut, tuut");
    }
    protected String brand2 = "Mustang";
    public void hunk2() {
        System.out.println("Tuut, tuut!!");
    }
}



public class Inheritance extends Vehicle {
    public String modelName = "Ford";
    public static void main(String[] args) {
        Inheritance myCar = new Inheritance();
        myCar.Hunk();
        myCar.hunk2();
        System.out.println(myCar.brand + " " + myCar.modelName);
        System.out.println(myCar.brand2 + " " + myCar.modelName);


    }

}
