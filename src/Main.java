public class Main {
    public static void main(String[] args) {
        //Задание 3.1
        System.out.println("Задание 3.1");
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задание 3.2
        System.out.println("Задание 3.2");
        int clientOs1 = 1;
        int clientDeviceOs = 2020;
        if (clientOs1 == 0) {
            if (clientDeviceOs < 2015){
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        } else if (clientDeviceOs < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задание 3.3
        System.out.println("Задание 3.3");
        int year = 2021;
        if (year % 4 ==0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
        //Задание 3.4
        System.out.println("Задание 3.4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays ++;
        }
        if (deliveryDistance > 60) {
            deliveryDays ++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
        //Задание 3.5
        System.out.println("Задание 3.5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Несуществующий месяц " + monthNumber);
        }


    }
}