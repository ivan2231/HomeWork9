import jdk.jshell.SourceCodeAnalysis;

import java.time.LocalDate;

public class Main {
    private static void printLeapYear( int year ) {
        String output;
        if (isLeapYear(year)) {

            output = year + "Год является високосным";
        } else {
            output = year + "Год не является високосным";
        }
        System.out.println(output);
    }
    private static boolean isLeapYear ( int year ) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    private static void printSuggestionForInstall(int client0S,int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        {
            String output;
            if (deviceYear < currentYear) {
                output = "Установите облегченную версию для";
            } else {
                output = "Установите версию приложения для";
            }
            if (client0S == 1) {

                output += "Android по ссылке";

            } else {

                output += "IOS по ссылке";
            }
            System.out.println(output);
        }
    }
    private static int calculateDeliveryDays(int deliveryDistance){
        int deliveryDays = 1;
        int interval=40;
        int startInterval=20;
        if (deliveryDistance >startInterval) {
            deliveryDays=deliveryDays+(int)Math.ceil((deliveryDistance-startInterval)/(double)interval);
        }
        return deliveryDays;
    }

    public static void main(String[] args) {
        //Задание1
        printLeapYear(2022);


        //Задание2
        int client0S = 1;
        int deviceYear = 2021;
        printSuggestionForInstall(client0S, deviceYear);


        //Задание3

        int deliveryDistance = 95;
        int deliveryDays=calculateDeliveryDays (deliveryDistance);
        System.out.println("Потребуется дней:"+ deliveryDays);


    }
}

