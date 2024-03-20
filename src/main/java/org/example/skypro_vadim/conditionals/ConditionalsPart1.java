package org.example.skypro_vadim.conditionals;

public class ConditionalsPart1 {
    public static void main(String[] args) {
        //taskExample();
        //taskExample2();
        //taskExample3();
        //taskExample4();
        //taskExample5();
        //task();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        task7();

    }

    public static void taskExample() {
        System.out.println("Example from skypro");
        int age = 17;
        if (age >= 18) {
            System.out.println("You can drive the car");
        } else {
            System.out.println("You cant drive");
        }
    }

    public static void taskExample2() {
        System.out.println("====================");
        System.out.println("Example from skypro");
        int age = 19;
        if (age >= 18 && age <= 21) {
            System.out.println("You can drive, but you cant drink alcohol");
        }
    }

    public static void taskExample3() {
        System.out.println("====================");
        System.out.println("Example from skypro");
        int age = 19;
        if (age <= 7 || age >= 18) {
            System.out.println("I think, you dont go to school");
        }
    }

    public static void taskExample4() {
        System.out.println("====================");
        System.out.println("Example from skypro");
        boolean skyIsClear = true;
        if (skyIsClear) {
            System.out.println("Sky is clear");
        }
    }

    public static void taskExample5() {
        System.out.println("====================");
        System.out.println("Example from skypro");
        int age = 18;
        boolean canGoToSchool = age <= 7 || age > 18;
        if (canGoToSchool) {
            System.out.println("I think, you dont go to school");
        } else {
            System.out.println("you must go to school");
        }
    }

    public static void task() {
        System.out.println("====================");
        System.out.println("Task 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Человек совершелетний, так как ему больше 18");
        } else {
            System.out.println("возраст совершеннолетия еще не наступил, нужно немного подождать");
        }

        System.out.println("====================");
    }

    public static void task2() {
        System.out.println("====================");
        System.out.println("Task 2");
        int temperature = 7;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }

        System.out.println("====================");
    }

    public static void task3() {
        System.out.println("====================");
        System.out.println("Task 3");
        int speed = 80;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        }

        System.out.println("====================");
    }

    public static void task4() {
        System.out.println("====================");
        System.out.println("Task 4");
        int age = 25;
        if (age > 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад.");
        } else if (age > 7 && age < 17) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу. ");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университете.");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу.");
        }

        System.out.println("====================");
    }


    public static void task5() {
        System.out.println("====================");
        System.out.println("Task 5");
        int childrenAge = 15;
        if (childrenAge < 5) {
            System.out.println("Если возраст ребенка равен " + childrenAge + " , то ему нельзя кататься на аттракционе");
        } else if (childrenAge > 5 && childrenAge < 14) {
            System.out.println("Если возраст ребенка равен " + childrenAge + " , можно кататься на аттракционе " +
                    "в сопровождении");
        } else {
            System.out.println("Если возраст ребенка равен " + childrenAge + " , можно кататься на аттракционе " +
                    "без сопровождении");
        }

        System.out.println("====================");
    }

    public static void task6() {
        System.out.println("====================");
        System.out.println("Task 6");
        int totalPlaces = 120;
        int placeInTrain = 123;
        boolean placesFrom1To60 = 1 <= placeInTrain && placeInTrain <= 60;
        boolean placesFrom61To120 = 61 <= placeInTrain && placeInTrain <= 120;
        if (placesFrom1To60) {
            System.out.println("У вас сидячее место = " + placeInTrain);
        } else if (placesFrom61To120) {
            System.out.println("У вас стоячее место = " + placeInTrain);
        } else {
            System.out.println("Вагон полностью забит так как, есть всего " + totalPlaces + " мест.");
        }

        System.out.println("====================");
    }

    public static void task7() {
        System.out.println("====================");
        System.out.println("Task 7");
        int one = 200;
        int two = 300;
        int three = 400;
        if (one < two && two < three) {
            System.out.println("Самое большое число: " + three);
        } else if (one > two && one > three) {
            System.out.println("Самое большое число: " + one);
        } else if (one < two && two > three) {
            System.out.println("Самое большое число: " + two);
        } else {
            System.out.println("Все три числа равны");
        }
        System.out.println("====================");
    }

}
