package november;

public class Dogs{

    String name;
    String breed;
    String colour;
    double age;
    double weight;
    double height;

    public Dogs(String name, String breed, String colour, double age, double weight, double height){
        this.name = name;
        this. breed = breed;
        this.colour = colour;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }
    public String getBreed(){
        return  breed;
    }

    public void setBreed(String breed){
      this.breed = breed;
    }
}
