package org.example.skypro_vadim.conditionals;

public class ConditionalsPart2 {
    public static void main(String[] args) {
        //exampleTask1();
        //exampleTask2();
        //exampleTask3();
        //exampleTask4();
        //task1();
        task2();

    }

    public static void exampleTask1() {
        System.out.println("Task 1");
        int age = 21;
        if (age > 18) {
            System.out.println("Ты должен праздновать");
            if (age < 21) {
                System.out.println("Выпей сливочного пива");
            } else {
                System.out.println("Иди куда хочешь и пей что хочешь");
            }
        }
        System.out.println("====================================================================");
    }

    public static void exampleTask2() {
        System.out.println("Task 2");
        int age = -1;
        if (age > 18) {
            System.out.println("Ты должен праздновать");
            if (age < 21) {
                System.out.println("Выпей сливочного пива");
            } else {
                System.out.println("Иди куда хочешь и пей что хочешь");
            }
        } else if (age < 7) {
            System.out.println("Ты должен идти в школу");
        } else {
            System.out.println("Надо идти в детский сад");
        }
        System.out.println("====================================================================");
    }

    public static void exampleTask3() {
        System.out.println("Task 3");
        char color = 'g';
        if (color == 'r') {
            System.out.println("Красный! Ехать нельзя!");
        } else if (color == 'y') {
            System.out.println("Желтый! Внимание!");
        } else {
            System.out.println("Зеленый! Ехать можно!");
        }

        System.out.println("====================================================================");
    }

    public static void exampleTask4() {
        System.out.println("Task 4");
        char color = 'm';
        switch (color) {
            case 'r':
                System.out.println("Красный! Ехать нельзя!");
                break;
            case 'y':
                System.out.println("Желтый! Внимание!");
                break;
            case 'g':
                System.out.println("Зеленый! Ехать можно!");
                break;
            case 'l':
                System.out.println("Поворот налево");
                break;
            default:
                System.out.println("Сфетафор сломался");

        }
        System.out.println("====================================================================");
    }

    public static void task1(){
        System.out.println("Task 1");
        char client = '0';
        switch (client){
            case '0':
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case '1':
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Такой операционной системой не пользуемся");
        }
        System.out.println("=====================================================================");
    }
    public static void task2(){
        System.out.println("Task 2");

        System.out.println("=====================================================================");
    }
}

