package OOP.Encapsulation;

public class City {

    private long population;
    private String name;
    private int yearFounded;
     String language;

    public void setPopulation(long population){
        this.population = population;

    }
     public void setName(String name){
        this.name=name;
     }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public long getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    private  void grow(){
        System.out.println("this city is growing fast");
    }

}
