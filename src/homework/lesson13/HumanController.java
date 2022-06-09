package homework.lesson13;

public class HumanController {


    public static void main(String[] args) {

        Human mather = new Human("Ira");
        Human father = new Human("Oleg");

        Human human = new Human("Marina", mather, father);

        System.out.println(human);

    }
}
