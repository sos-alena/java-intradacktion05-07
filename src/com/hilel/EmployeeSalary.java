package com.hilel;

public class EmployeeSalary {

    public static void main(String[] args) {


        float W1 = 15000f;
        float W2 = 25000f;
        float W3 = 30000f;
        System.out.println("Employee Salary per mounth:");
        System.out.println();

        System.out.println("Ivanov A - " + W1);
        System.out.println("Sidorov B - " + W2);
        System.out.println("Petrov G - " + W3);
        System.out.println();
        System.out.println("Salary for 10 years:");
        System.out.println();

        float W10 = (W1 * 12 * 10);
        float W20 = (W2 * 12 * 10);
        float W30 = (W3 * 12 * 10);

        System.out.println("Ivanov A - " + W10);
        System.out.println("Sidorov B - " + W20);
        System.out.println("Petrov G - " + W30);

        System.out.println();
        System.out.println("Tax 5% for 10 years:");
        System.out.println();

        float T1 = (W10 * 5 / 100);
        float T2 = (W20 * 5 / 100);
        float T3 = (W30 * 5 / 100);


        System.out.println("Ivanov A - " + T1);
        System.out.println("Sidorov B - " + T2);
        System.out.println("Petrov G - " + T3);

        System.out.println();
        System.out.println("Salary without taxes for 10 years:");
        System.out.println();

        float N1 = (W10 - T1);
        float N2 = (W20 - T2);
        float N3 = (W30 - T3);


        System.out.println("Ivanov A - " + N1);
        System.out.println("Sidorov B - " + N2);
        System.out.println("Petrov G - " + N3);
    }
}
