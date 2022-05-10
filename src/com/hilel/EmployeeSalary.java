package com.hilel;

public class EmployeeSalary {

    public static void main(String[] args) {


        float W1 = 3000f;
        float W2 = 4500f;
        float W3 = 5800f;
        System.out.println("Employee Salary per mounth:");
        System.out.println();

        System.out.println("Ivanov A - " + W1 + " usd");
        System.out.println("Sidorov B - " + W2 + " usd");
        System.out.println("Petrov G - " + W3 + " usd");
        System.out.println();
        System.out.println("Salary for 10 years:");
        System.out.println();

        float W10 = (W1 * 12 * 10);
        float W20 = (W2 * 12 * 10);
        float W30 = (W3 * 12 * 10);

        System.out.println("Ivanov A - " + W10 + " usd");
        System.out.println("Sidorov B - " + W20 + " usd");
        System.out.println("Petrov G - " + W30 + " usd");

        System.out.println();
        System.out.println("Tax 5% for 10 years:");
        System.out.println();

        float T1 = (W10 * 5 / 100);
        float T2 = (W20 * 5 / 100);
        float T3 = (W30 * 5 / 100);


        System.out.println("Ivanov A - " + T1 + " usd");
        System.out.println("Sidorov B - " + T2 + " usd");
        System.out.println("Petrov G - " + T3 + " usd");

        System.out.println();
        System.out.println("Salary without taxes for 10 years:");
        System.out.println();

        float N1 = (W10 - T1);
        float N2 = (W20 - T2);
        float N3 = (W30 - T3);


        System.out.println("Ivanov A - " + N1 + " usd");
        System.out.println("Sidorov B - " + N2 + " usd");
        System.out.println("Petrov G - " + N3 + " usd");

        System.out.println();
        System.out.println("Average salary of all employees for 10 years:");

        System.out.println((N1+N2+N3) / 3);
    }
}
