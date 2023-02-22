public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1"); // Задача 1
        int red = 3;
        System.out.println(red);
        byte white = 2;
        System.out.println(white);
        short green = 9;
        System.out.println(green);
        long yelow = 5212;
        System.out.println(yelow);
        float grey = 2.75f;
        System.out.println(grey);
        double black = 45.3215;
        System.out.println(black);
    }

    public static void task2 () {
        System.out.println("Задача 2"); // Задача 2
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        int f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
    }
    public static void task3 () {
        System.out.println("Задача 3"); // Задача 3
       byte lPavlovna = 23;
        byte aSergeevna = 27;
        byte eAndreevna = 30;
        int allStudents = lPavlovna + aSergeevna + eAndreevna;
        int paperStudents = 480 / allStudents;
       System.out.println("На каждого ученика рассчитано " +paperStudents + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4"); // Задача 4
        byte productInMinute = 16 / 2;
        int product20Min = productInMinute * 20;
        System.out.println("За 20 минут машина произвела " + product20Min + " штук бутылок");
        int productInHour = productInMinute * 60;
        int productInDay = productInHour * 24;
        System.out.println("За сутки машина произвела " + productInDay + " штук бутылок");
        int productIn3Day = productInDay * 3;
        System.out.println("За три дня машина произвела " + productIn3Day + " штук бутылок");
        int productInMounth = productIn3Day * 10;
        System.out.println("За месяц машина произвела " + productInMounth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5"); // Задача 5
        byte brownPaint = 4;
        byte whitePaint = 2;
        byte paints = 120;
        int oneClass = brownPaint + whitePaint;
        int numberOfClasses = paints / oneClass;
        int numberOfWhitePaint = numberOfClasses * whitePaint;
        int numberOfBrownPaint = numberOfClasses * brownPaint;
        System.out.println("В школе где " + numberOfClasses + " классов, нужно " + numberOfWhitePaint + " банок белой краски и " + numberOfBrownPaint + " банок коричневой краски.");
    }
    public static void task6 () {
        System.out.println("Задача 6"); // Задача 6
        byte oneBanana = 80;
        byte oneMilk = 105;
        byte oneIceCream = 100;
        byte oneEgg = 70;
        int totalWeight = 5 * oneBanana + 2 * oneMilk + 2 * oneIceCream + 4 * oneEgg;
        System.out.println("Вес завтрака в граммах " + totalWeight + " грамм.");
        float totalWeightInKg = totalWeight / 1000f;
        System.out.println("Вес завтрака в килограммах " + totalWeightInKg + " килограмм.");
    }
    public static void task7 () {
        System.out.println("Задача 7"); // Задача 7
        short weight = 7000;
        int losingWeightMin = 250;
        int losingWeightMax = 500;
        int totalLosingMin = weight / losingWeightMin;
        System.out.println("При потери 250 грамм в день, спортсмен похудеет через " + totalLosingMin + " дней.");
        int totalLosingMax = weight / losingWeightMax;
        System.out.println("При потери 500 грамм в день, спортсмен похудеет через " + totalLosingMax + " дней.");
        int totalLosingWeightMiddle = (totalLosingMin + totalLosingMax) / 2;
        System.out.println("В среднем, чтобы спортсмены похудеть, потребуется " + totalLosingWeightMiddle + " день.");
    }
    public static void task8 () {
        System.out.println("Задача 8"); // Задача 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        double totalSalaryMasha = salaryMasha * 1.1f;
        double totalSalaryDenis = salaryDenis * 1.1f;
        double totalSalaryChristina = salaryChristina * 1.1f;
        int oldYearSalaryMasha = salaryMasha * 12;
        int oldYearSalaryDenis = salaryDenis * 12;
        int oldYearSalaryChristina = salaryChristina * 12;
        double newYearSalaryMasha = totalSalaryMasha * 12;
        double newYearSalaryDenis = totalSalaryDenis * 12;
        double newYearSalaryChristina = totalSalaryChristina * 12;
        double diffrentSalaryMasha = newYearSalaryMasha - oldYearSalaryMasha;
        System.out.println("Маша теперь получает " + totalSalaryMasha + " рублей. Годовой доход вырос на " + diffrentSalaryMasha + " рублей.");
        double diffrentSalaryDenis = newYearSalaryDenis - oldYearSalaryDenis;
        System.out.println("Денис теперь получает " + totalSalaryDenis + " рублей. Годовой доход вырос на " + diffrentSalaryDenis + " рублей.");
        double diffrentSalaryChristina = newYearSalaryChristina - oldYearSalaryChristina;
        System.out.println("Кристина теперь получает " + totalSalaryChristina + " рублей. Годовой доход вырос на " + diffrentSalaryChristina + " рублей.");

    }
}