import java.util.List;
import java.util.ArrayList;

public class Lists{
    public List<Car> getCarByBrand(List<Car> cars, String brand){
        List<Car> result = new ArrayList<>();
        for(Car car: cars){
            if(car.getBrand().equals(brand)) result.add(car);
        }
        return result;
    }

    public List<Car> getModelAge(List<Car> cars, String model, int n){
        List<Car> result = new ArrayList<>();
        for (Car car: cars){
            if(car.getModel().equals(model) && car.getAge() > n) result.add(car);
        }
        return result;
    }

    public List<Car> getYearPrice(List<Car> cars, int prod_year, int price){
        List<Car> result = new ArrayList<>();
        for(Car car: cars){
            if((car.getProd_year() == prod_year) && (car.getPrice() > price)) result.add(car);
        }
        return result;
    }
}
