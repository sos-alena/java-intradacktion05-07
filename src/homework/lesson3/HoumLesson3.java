package homework.lesson3;
public class HoumLesson3 {
        public static void main(String[] args) {

            float R1 = 1.0f;
            System.out.println("Радиус шара снеговика (первый) R1 - " + R1 + " м");

            float R2 = 0.5f;
            System.out.println("Радиус шара снеговика (второй) R2 - " + R2 + " м");

            float R3 = 0.2f;
            System.out.println("Радиус шара снеговика (третий) R3 - " + R3 + " м");

            float p = 0.7f;
            System.out.println("Kоэффициент плотности снежных шаров = " + p + " кг/м3");

            System.out.println();
            System.out.println("Найти: сколько весит весь снеговик?");
            System.out.println();
            System.out.println("РЕШЕНИЕ:");

            System.out.println("Формула массы тела: m = pV, где m - масса тела, " +
                    "p - плотность вещества, V - его объем."
                    + " V = 4/3πR^3.");

            System.out.println("Найдем объем (V) каждого шара по формуле:");
            System.out.println();

            double V1 = (4.0 / 3 * Math.PI * Math.pow(R1, 3));
            System.out.println("Объем первого шара V1 - " + V1 + " м3;");

            double V2 = (4.0 / 3 * Math.PI * Math.pow(R2, 3));
            System.out.println("Объем первого шара V1 - " + V2 + " м3;");

            double V3 = (4.0 / 3 * Math.PI * Math.pow(R3, 3));
            System.out.println("Объем первого шара V1 - " + V3 + " м3;");

            System.out.println();
            System.out.println("Найдем массу (m) каждого шара по формуле m = pV:");
            System.out.println();

            double m1 = (p * V1);
            System.out.println("Масса первого шара m1 - " + m1 + " кг;");

            double m2 = (p * V2);
            System.out.println("Масса первого шара m2 - " + m2 + " кг;");

            double m3 = (p * V3);
            System.out.println("Масса первого шара m3 - " + m3 + " кг;");

            System.out.println();
            System.out.println("Найдем вес всего снеговика: m1 + m2 + m3");
            System.out.println();
            double M = (m1 + m2 + m3);
            System.out.println("Вес всего снеговика - " + M + " кг.");


        }
    }
