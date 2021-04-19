public class Cat {
    public int weight;
    public String name;
    public int age;
    public String color;
    static int catCount;

    public Cat() {

    }

    public Cat(int weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
        catCount++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

