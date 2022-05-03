package OOP.Encapsulation;

public class CityTest {
    public static void main(String[] args) {


        City city = new City();
        city.language ="English";
        System.out.println(city.getName());
        city.setName("Chicago");//initializing the city name
        System.out.println(city.getName());

    }
}
