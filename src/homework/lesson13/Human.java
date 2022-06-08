package homework.lesson13;

public class Human {

    public static int COUNT = 1;
    private final String name;
    public Human(String name) {
        this.name = name;
        System.out.println(toString());
    }
    public static String createParents(Object obj, Object obj2, Object obj3) {
        if (obj instanceof Human human && obj2 instanceof Human human2 && obj3 instanceof Human human3) {
            String parents = "Person " +
                      human.name + ". " +
                    " Mather - " +
                    human2.name + ";" +
                    " Father - " +
                    human3.name + ".";
            System.out.println(parents);
            return parents;
        }

        return null;
    }

    @Override
    public String toString() {
        return "Human № " + (COUNT++) + "{" +
                "name='" + name + '\'' +
                '}';
    }
}
