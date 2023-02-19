import java.util.*;
import java.util.Scanner;
// 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.
// 2. Создать множество ноутбуков.
// 3. Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
// Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
// 4. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.




public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop(1, 2, 128, "Windows 10", "Белый");
        Laptop l2 = new Laptop(2, 4, 256, "Windows 11", "Красный");
        Laptop l3 = new Laptop(3, 32, 512, "Windows 10", "Серый");
        Laptop l4 = new Laptop(4, 16, 256, "Linux 11", "Черный");
        System.out.println(l1.toString());

        System.out.println("Выберите функцию:");
        System.out.println("1 - сортировка по ОЗУ");
        System.out.println("2 - сортировка по SSD");
        System.out.println("3 - сортировка по OS");
        System.out.println("4 - сортировка по color");
        Scanner sc = new Scanner(System.in,"ibm866");
        Integer choice = sc.nextInt();
        if(choice == 1){

            System.out.println("Введите название ОЗУ");
            Scanner sc1 = new Scanner(System.in);
            String ozu = sc1.nextLine();
            if (ozu.equals("2")) {
                System.out.printf(l1.toString());
            } else if (ozu.equals("4")) {
                System.out.printf(l2.toString());
            } else if (ozu.equals("16")) {
                System.out.printf(l4.toString());
            } else if (ozu.equals("32")) {
                System.out.printf(l3.toString());
            } else System.out.println("Таких ноутбуков нет!");

            //System.out.printf("Введите значение ОЗУ: ");
           // Integer ram = sc.nextInt();
           // if(ram >=32){
           //     System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
           // }else if(ram < 32){
           //     System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString());
           // }else if(ram < 16){
          //      System.out.printf(l1.toString() + "\n" + l2.toString());
           // }else if(ram <= 4){
            //    System.out.printf(l1.toString());
           // }else System.out.println("Таких ноутбуков нет!");

        }else if(choice == 2){

            System.out.println("Введите название SSD");
            Scanner sc2 = new Scanner(System.in);
            String ssd = sc2.nextLine();
            if (ssd.equals("128")) {
                System.out.printf(l1.toString());
            } else if (ssd.equals("256")) {
                System.out.printf(l2.toString()+"\n" + l4.toString());
            } else if (ssd.equals("512")) {
                System.out.printf(l3.toString());
            } else System.out.println("Таких ноутбуков нет!");

           // System.out.printf("Введите значение SSD: ");
           // Integer ssd = sc.nextInt();
          //  if(ssd >=512){
          //      System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
          //  }else if(ssd < 512){
          //      System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString());
          //  }else if(ssd < 256){
          //      System.out.printf(l1.toString() + "\n" + l2.toString());
         //   }else if(ssd < 128){
         //       System.out.printf(l1.toString());
         //   }else System.out.println("Таких ноутбуков нет!");

        }else if(choice == 3) {

            System.out.println("Введите название OS");
            Scanner sc3 = new Scanner(System.in);
            String os = sc3.nextLine();
            if (os.equals("Windows")) {
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n");
            } else if (os.equals("Windows 10")) {
                System.out.printf(l1.toString() + "\n" + l3.toString());
            } else if (os.equals("Windows 11")) {
                System.out.printf(l2.toString());
            } else if (os.equals("Linux")) {
                System.out.printf(l4.toString());
            } else System.out.println("Таких ноутбуков нет!");


        }else if(choice == 4){

            System.out.println("Введите color");
            Scanner sc4 = new Scanner(System.in);
            String enterColor = sc4.nextLine();
            if(enterColor.equals("white")){
                System.out.printf(l1.toString());
            }else if(enterColor.equals("red")){
                System.out.printf(l2.toString());
            }else if(enterColor.equals("grey")){
                System.out.printf(l3.toString());
            }else if(enterColor.equals("black")) {
                System.out.printf( l4.toString());
            } else System.out.println("Таких ноутбуков нет!");
            //enterColor.scan();
        }

        sc.close();
    }

}
