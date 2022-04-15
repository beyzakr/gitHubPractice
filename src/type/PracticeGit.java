package type;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeGit {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        /*for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }*/
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println("----------------------------------------");

        ArrayList<String> cars1 = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars1);  // Sort cars
        for (String i : cars1) {
            System.out.println(i);
        }

        System.out.println("-----------------------------------------");


        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // Sort myNumbers

        for (int num : myNumbers) {
            System.out.println(num);
        }

    }


}
