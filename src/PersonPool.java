import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonPool {
    private static final PersonPool personPool = new PersonPool();
    List<Person> personList = new ArrayList<Person>();

    private PersonPool() {
        City city = new City(400, 400);
        for (int i = 0; i < 5000; i++) {
            Random random = new Random();
            int x = (int) (100 * random.nextGaussian() + city.getCenterX());
            int y = (int) (100 * random.nextGaussian() + city.getCenterY());
            if (x > 700) {
                x = 700;
            }
            Person person = new Person(city, x, y);
            personList.add(person);
        }
    }

    public static PersonPool getInstance() {
        return personPool;
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
