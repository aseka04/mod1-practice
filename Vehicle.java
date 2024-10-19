import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    String marka;
    String model;
    int year;

    public Vehicle(String marka, String model, int year) {
        this.marka = marka;
        this.model = model;
        this.year = year;
    }

    void zapusk_on(){
        System.out.println("Zapusk nachalsya");
    }
    void zapuck_off(){
        System.out.println("Zapusk stop");
    }
}
class Car extends Vehicle{
    int col_dverei;
    String tran;

    public Car(String marka, String model, int year, int col_dverei, String tran) {
        super(marka, model, year);
        this.col_dverei = col_dverei;
        this.tran = tran;
    }

    @Override
    public String toString() {
        return "Car{" +
                "col_dverei=" + col_dverei +
                ", tran='" + tran + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
class Motorcycle extends Vehicle{
    String type_kuzov;
    boolean box;

    public Motorcycle(String marka, String model, int year, String type_kuzov, boolean box) {
        super(marka, model, year);
        this.type_kuzov = type_kuzov;
        this.box = box;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "type_kuzov='" + type_kuzov + '\'' +
                ", box=" + box +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
class Garage{
    List<Vehicle> list = new ArrayList<>();
    void add(Vehicle vehicle){
        list.add(vehicle);
    }
    void remove(Vehicle vehicle){
        list.remove(vehicle);
    }
}
class Fleet{
    List<Garage> list = new ArrayList<>();

    void add(Garage garage){
        list.add(garage);
    }
    void remove(Garage garage){
        list.remove(garage);
    }
}

class Main2{
    public static void main(String[] args) {
        Car car = new Car("toyota", "camry", 2011, 4,"f");
        Motorcycle motorcycle = new Motorcycle("audi", "gjaa", 2024, "norm", true);
        Garage garage = new Garage();
        garage.add(car);
        garage.add(motorcycle);
        System.out.println("before");
        for(Vehicle c : garage.list){
            System.out.println(c);
        }
        System.out.println("after");
        garage.remove(car);
        for(Vehicle c : garage.list){
            System.out.println(c);
        }

    }
}