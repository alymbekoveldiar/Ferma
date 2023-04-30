public class Cow {
    int id;
    String breed;
    int milk;

    public Cow(int id, String breed, int milk) {
        this.id = id;
        this.breed = breed;
        this.milk = milk;
    }
    public Cow(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    @Override
    public String toString() {
        return "Корова{" +
                "id=" + id +
                ", порода=" + breed + '\'' +
                ", литтр молока " + milk +
                '}';

    }
}
