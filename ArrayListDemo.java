
import java.util.ArrayList;
public class ArrayListDemo {




        public static void main(String[] args) {
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            System.out.println(cars);

            cars.add(1,"dodge");
            System.out.println(cars);

            cars.remove(1);
            System.out.println(cars);
        }
    }



