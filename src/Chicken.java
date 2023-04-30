public class Chicken {
    int id;
    int egg;

    public Chicken(int id, int egg) {
        this.id = id;
        this.egg = egg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }

    @Override
        public String toString() {
            return "Chicken{" +
                    "id=" + id +
                    "," + egg +"шт яиц"+
                    '}';
        }
    }
