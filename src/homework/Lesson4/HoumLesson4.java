package homework.Lesson4;

public class HoumLesson4 {


    public static void main(String[] args) {

        String t1 = "Jet";
        String t2 = "Airliner";
        String m1 = "F-22 Raptor";
        String m2 = "Aerobus 737";
        String m3 = "Boeing 777";
        int ne1 = 120;
        int ne2 = 180;
        int nb = 28;


        System.out.println();
        printAirplaneInfo(t1, m1);

        System.out.println();
        printAirplaneInfo(t2, m2, ne1);

        System.out.println();
        printAirplaneInfo(t2, m3, ne2, nb);

    }

    public static void printAirplaneInfo(String type, String model) {
        System.out.println("Type Air: " + type + "," + " Model Air: " + model + ";");

    }

    public static void printAirplaneInfo(String type, String model, int numbEc) {
        System.out.println("Type Air: " + type + "," + " Model Air: " + model + "," + " number of economy class seats: " + numbEc + ";");
    }

    public static void printAirplaneInfo(String type, String model, int numbEc, int numderBus) {
        System.out.println("Type Air: " + type + "," + " Model Air: " + model + "," + " number of economy class seats: " + numbEc + "," + " number of business class seats: " + numderBus + ";");

    }

}