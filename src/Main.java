//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задание 1");
        int client0s = 0;
        System.out.println("Операционная система 0 — iOS, 1 — Android");
        if (client0s == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (client0s == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 2");
        int clientDeviceYear = 2016;
        System.out.println("Год создания телефона " + clientDeviceYear + " год");
        if (client0s == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (client0s == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            if (client0s == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

            System.out.println("Задание 3");
            int year = 2012;
            if (year > 1584) {
                System.out.println(year + " год больше 1584");
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println(year + " год является високосным");
                } else {
                    System.out.println(year + " год не является високосным");
                }


                System.out.println("Задание 4");
                int deliveryDistance = 95;
                int deliveryDays = 0;
                if (deliveryDistance <= 20) {
                    deliveryDays += 1;
                    System.out.println("Потребуется дней: " + deliveryDays);
                } else if (deliveryDistance <= 60) {
                    deliveryDays += 2;
                    System.out.println("Потребуется дней: " + deliveryDays);
                } else if (deliveryDistance <= 100) {
                    deliveryDays += 3;
                    System.out.println("Потребуется дней: " + deliveryDays);
                } else {
                    System.out.println("Доставка на расстояние более 100 км невозможна.");
                }

                System.out.println("Задание 5");
                int monthNumber = 6;
                if (monthNumber < 1 || monthNumber > 12) {
                    System.out.println("Ошибка, выберите номер месяца от 1 до 12");
                } else {
                    switch (monthNumber) {
                        case 12:
                        case 1:
                        case 2:
                            System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону Зима");;
                            break;
                        case 3:
                        case 4:
                        case 5:
                            System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону Весна");;
                            break;
                        case 6:
                        case 7:
                        case 8:
                            System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону Лето");;
                            break;
                        case 9:
                        case 10:
                        case 11:
                            System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону Осень");;
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }
}
