package homework.lesson11;

public class CatTest {

    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.name = "Mura";
        cat.age = 5;
        cat.weight = 8;
        cat.breed = "Siamse";

        System.out.println("cat: " + cat.toString());

        System.out.println("----------------------------------------------");

        Cat cat2 = new Cat("Matilda", 5, 8, "Maine Coon");
        System.out.println("cat2: " + cat2.toString());

        System.out.println("------------------------------------------------");

        Cat cat3 = new Cat("Kisa", 8);
        System.out.println("cat3: " + cat3.toString());

        System.out.println("------------------------------------------------");
        System.out.println(cat);
        System.out.println(cat2);
        System.out.println(cat3);

        Cat cat4 = cat2;

        System.out.println(cat.equals(cat2));
        System.out.println(cat.equals(cat3));
        System.out.println(cat3.equals(cat2));
        System.out.println(cat4.equals(cat2));
    }

}
