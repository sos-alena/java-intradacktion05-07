package homework.lesson13;

public class Human {
    public static int COUNT = 1;
    private final String name;
    private Human mather;
    private Human father;
    public Human(String name) {
        this.name = name;
    }
    public Human(String name, Human mather, Human father) {
        this.name = name;
        this.mather = mather;
        this.father = father;}
    @Override
    public String toString() {
     String matherInfo = this.mather != null ? " her/his mather is - " + mather : "";
        String fatherInfo = this.father != null ? " her/his father is - " + father : "";

        return "Human №" + (COUNT++) + " {" +
                "name " + this.name + "}" + ";"
                + matherInfo +
                fatherInfo;
    }
}
