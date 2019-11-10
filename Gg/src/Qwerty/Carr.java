package Qwerty;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Asdfg.Journal.JOURNAL_CAPACITY;

public class Carr {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(JOURNAL_CAPACITY);
        List<Carrr> cars = new ArrayList<>();
        List<Owner> owners = new ArrayList<>();
        String line;
        while (true){
            line = sc.nextLine();
            if(line.equals("1")){
                System.out.println("Номер");
                line = sc.nextLine();
                Carrr car = new Carrr(line);
                cars.add(car);
            }
            else if(line.equals("2")){
                System.out.println("Имя");
                line = sc.nextLine();
                System.out.println("Фамилия");
                String l = sc.nextLine();
                Owner owner = new Owner(line,l, new Date(System.currentTimeMillis()));
                owners.add(owner);
            }
            else if(line.equals("3")){
                System.out.println(" Номер");
                line = sc.nextLine();
                Carrr car = findCarrr(cars,line);
                if(car != null){
                    System.out.println(About.getCarrrInfo(car));
                }
                else{
                    System.out.println("В базе отсутствует такой номер");
                }
            }
        }
    }

    private static Carrr findCarrr(List<Carrr> cars, String line) {
        return null;
    }


}
