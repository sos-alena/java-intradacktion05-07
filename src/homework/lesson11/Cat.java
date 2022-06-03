package homework.lesson11;


public class Cat {

    String name;
    int age;
    int weight;
    String breed;

    public Cat() {
        System.out.println("Cat has been created");
    }

    public Cat(String name, int age, int weight, String breed) {

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;

    }

    public Cat(String name, int age) {

        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                '}';
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;

            return this.weight == cat.weight && this.age == cat.age;

        }

        return false;
    }


}
