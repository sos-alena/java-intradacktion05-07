package homework.lesson13;

public class HumanController {


    public static void main(String[] args) {

        System.out.println("List of women");
        Human human = new Human("Marina");
        Human human1 = new Human("Ira");
        Human human2 = new Human("Olya");
        Human human3 = new Human("Natasha");

        System.out.println();

        System.out.println("List of men");
        Human human4 = new Human("Ivan");
        Human human5 = new Human("Sasha");
        Human human6 = new Human("Evgen");
        Human human7 = new Human("Anton");

        System.out.println();

        Human.createParents(human, human1, human4);
        Human.createParents(human2, human1, human4);
        Human.createParents(human6, human3, human5);
        Human.createParents(human7, human3, human5);

    }
}
