package org.example.skypro_vadim.variables;


public class variablesPartTwo {
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

    public static void task1() {
        System.out.println("Задача 1");
        byte a = 10;
        short b = 100;
        int c = 1000;
        long d = 10000L;
        float e = 100000.0F;
        double f = 10000000.000;
        System.out.println("Значение переменной 'a ' с типом byte равно " + a);
        System.out.println("Значение переменной 'b ' с типом short равно " + b);
        System.out.println("Значение переменной 'c ' с типом int равно " + c);
        System.out.println("Значение переменной 'd ' с типом long равно " + d);
        System.out.println("Значение переменной 'e ' с типом float равно " + e);
        System.out.println("Значение переменной 'f ' с типом double равно " + f);
        System.out.println("----------------");
    }

    public static void task2() {
        System.out.println("----------------");
        System.out.println("Задача 2");
        double a = 27.12;
        long b = 987_678_965_549L;
        float c = 2.786F;
        short d = 569;
        int e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println("----------------");
    }

    public static void task3() {
        System.out.println("----------------");
        System.out.println("Задача 3");
        int classLudmila = 23;
        int classAnna = 27;
        int classEkaterina = 30;
        int paperForAllClasses = 480;
        int paperForOneStudent = paperForAllClasses / (classLudmila + classAnna + classEkaterina);
        System.out.println("На каждого ученика рассчитано " + paperForOneStudent + " листов бумаги");
        System.out.println("----------------");
    }

    public static void task4() {
        System.out.println("----------------");
        System.out.println("Задача 4");
        int bottleMakingMachineInOneMin = 16 / 2;
        int bottleMakingMachineInTwentyMin = bottleMakingMachineInOneMin * 20;
        int bottleMakingMachineInOneDay = bottleMakingMachineInOneMin * (24 * 60);
        int bottleMakingMachineInThreeDays = bottleMakingMachineInOneDay * 3;
        int bottleMakingMachineInOneMonth = bottleMakingMachineInOneDay * 30;
        System.out.println("За 20 мин машина произвела " + bottleMakingMachineInTwentyMin + " штук бутылок");
        System.out.println("За 1 день машина произвела " + bottleMakingMachineInOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleMakingMachineInThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottleMakingMachineInOneMonth + " штук бутылок");

        System.out.println("----------------");
    }

    public static void task5() {
        System.out.println("----------------");
        System.out.println("Задача 5");
        /*
        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        На один класс уходит 2 банки белой и 4 банки коричневой краски.
        Сколько банок каждой краски было куплено?
         */
        int totalPaints = 120;
        int whitePaintOneClass = 2;
        int brownPaintOneClass = 4;
        int classesInSchool = totalPaints / (whitePaintOneClass + brownPaintOneClass);
        int allWhitePaint = classesInSchool * whitePaintOneClass;
        int allBrownPaint = classesInSchool * brownPaintOneClass;
        System.out.println("В школе, где " + classesInSchool
                + " классов, нужно " + allWhitePaint + " банок белой краски и "
                + allBrownPaint + " банок коричневой краски");
        System.out.println("----------------");
    }

    public static void task6() {
        System.out.println("----------------");
        System.out.println("Задача 6");
        /*
        Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        Бананы — 5 штук (1 банан — 80 грамм).
        Молоко — 200 мл (100 мл = 105 грамм).
        Мороженое-пломбир — 2 брикета по 100 грамм.
        Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
         */
        int fiveBananasInGram = 80 * 5;
        int twoMilkInGram = 105 * 2;
        int twoIceCreamInGram = 100 * 2;
        int fourEggsInGram = 70 * 4;
        double totalCocktailUnGram = fiveBananasInGram + twoIceCreamInGram + twoMilkInGram + fourEggsInGram;
        double totalCocktailInKg = totalCocktailUnGram / 1000;
        System.out.println("Вес коктейла = " + totalCocktailUnGram + " в гр ");
        System.out.println("Вес коктейла = " + totalCocktailInKg + " в кг ");
        System.out.println("----------------");
    }

    public static void task7() {
        System.out.println("----------------");
        System.out.println("Задача 7");
        int sevenKgInGr = 7000;
        int gr250PerDay = sevenKgInGr / 250;
        int gr500PerDay = sevenKgInGr / 500;
        int daysOnAverage = sevenKgInGr / (500 + 250);
        System.out.println("столько " + gr250PerDay + " дней уйдет на похудение, " +
                "если спортсмен будет терять каждый день по 250 грамм.");
        System.out.println("столько " + gr500PerDay + " дней уйдет на похудение, " +
                "если спортсмен будет терять каждый день по 500 грамм.");
        System.out.println("столько " + daysOnAverage + " дней уйдет в среднем.");
        System.out.println("----------------");
    }

    public static void task8() {
        System.out.println("----------------");
        System.out.println("Задача 8");
        int salaryOfMaria = 67760;
        int salaryOfDenis = 83690;
        int salaryOfKristina = 76230;
        double bonusForMaria = salaryOfMaria * 0.10;
        double bonusForDenis = salaryOfDenis * 0.10;
        double bonusForKristina = salaryOfKristina * 0.10;
        double salaryAfterBonusMaria = salaryOfMaria + bonusForMaria;
        double salaryAfterBonusDenis = salaryOfDenis + bonusForDenis;
        double salaryAfterBonusKristina = salaryOfKristina + bonusForKristina;
        double salaryPerYearBeforeBonusMaria = salaryOfMaria * 12;
        double salaryPerYearBeforeBonusDenis = salaryOfDenis * 12;
        double salaryPerYearBeforeBonusKristina = salaryOfKristina * 12;
        double salaryPerYearAfterBonusMaria = salaryAfterBonusMaria * 12;
        double salaryPerYearAfterBonusDenis = salaryAfterBonusDenis * 12;
        double salaryPerYearAfterBonusKristina = salaryAfterBonusKristina * 12;
        double differenceBeforeAndAfterBonusMaria = salaryPerYearAfterBonusMaria - salaryPerYearBeforeBonusMaria;
        double differenceBeforeAndAfterBonusDenis = salaryPerYearAfterBonusDenis - salaryPerYearBeforeBonusDenis;
        double differenceBeforeAndAfterBonusKristina = salaryPerYearAfterBonusKristina - salaryPerYearBeforeBonusKristina;
        System.out.println("Маша теперь получает " + salaryAfterBonusMaria + " рублей." +
                " Годовой доход вырос на " + differenceBeforeAndAfterBonusMaria + " рублей");
        System.out.println("Денис теперь получает " + salaryAfterBonusDenis + " рублей." +
                " Годовой доход вырос на " + differenceBeforeAndAfterBonusDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryAfterBonusKristina + " рублей." +
                " Годовой доход вырос на " + differenceBeforeAndAfterBonusKristina + " рублей");
        System.out.println("----------------");
    }
}
