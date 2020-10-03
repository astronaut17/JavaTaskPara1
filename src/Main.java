import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Car car1 = new Car(1, "Chevrolet", "Camaro", 2013, "yellow", 4000, 50);
        Car car2 = new Car(2, "Audi", "A8", 2012, "white", 9000, 100);
        Car car3 = new Car(3, "Aston-Martin", "V8 Vantage", 2010, "green", 12000, 120);
        List<Car> cars = Arrays.asList(car1, car2, car3);
        System.out.printf("CarList has %d elements \n", cars.size());
        for(Car car : cars){
            System.out.println(car.toString());
        }

        Lists result = new Lists();
        System.out.println("List of Audi cars: ");
        List<Car> resultList1 = result.getCarByBrand(cars, "Audi");
        for(Car a: resultList1) System.out.println(a.toString());
        System.out.println("List of Chevrolet Camaro cars, older than 2 years: ");
        List<Car> resultList2 = result.getModelAge(cars, "Camaro", 2);
        for(Car a: resultList2) System.out.println(a.toString());
        System.out.println("List of cars produced in 2010 with a price higher than 10000$: ");
        List<Car> resultList3 = result.getYearPrice(cars, 2010, 10000);
        for(Car a: resultList3) System.out.println(a.toString());
    }
}