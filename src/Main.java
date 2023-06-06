public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 2.3. ООП часть 2. Интерфейсы и полиморфизм");

        Car toyota = new Car("Toyota", 4);
        Car ferrari = new Car("Ferrari", 4);


        Truck volvo = new Truck("Volvo", 6);
        Truck man = new Truck("MAN", 8);


        Bicycle giant = new Bicycle("GIANT", 2);
        Bicycle trek = new Bicycle("TREK", 2);


        ServiceStation station = new ServiceStation();

        station.service(toyota);
        station.service(ferrari);
        station.service(giant);
        station.service(trek);
        station.service(volvo);
        station.service(man);
    }
}

