package pl.emil;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Napisz program, który pobiera od użytkownika 6 liczb z puli 49.
        // Program ma wziąć pod  uwagę zestaw unikalnych sześciu liczb.
        // Następnie program dokonuje losowań do czasu gdy wylosuje wybrane przez użytkownika zestawienie liczb.
        // Program podaje po ilu latach i ilu dniach użytkownik wylosowałby liczby (np. potrzeba x lat i x dni).
        // Zakładamy że losowania odbywają się codziennie (jedno losowanie na jeden dzień).
        HashSet<Object> userNumbers = new HashSet<>();
        HashSet<Object> randomNumbers = new HashSet<>();
        int pom = 0;
        boolean prawda = true;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj 6 liczb z puli 49");
        int a;
        for(int i=0;i<6;i++) {
            userNumbers.add(a = scanner.nextInt());
            userNumbers.add(a);
        }
        do{
            for(int i=0;i<6;i++) {
                int los = random.nextInt(49);
                randomNumbers.add(los);
            }
            if(randomNumbers.equals(userNumbers)){
                prawda=false;
            } else {
                randomNumbers.clear();
            }

            pom++;
        }while(prawda==true);

        if(pom<365){
            System.out.println("losowanie zajeloby: "+ pom);
        }
        if (pom>365){
            int numberOfYears = pom/365;
            int numberOfDays =pom%365;
            System.out.println("Losowanie zajęłoby Ci: "+numberOfYears +" lat i "+numberOfDays+" dni");
        }

//        for (var element : randomNumbers) {
//            System.out.println(element);
//        }
//        for (var element : userNumbers) {
//            System.out.println(element);
//        }

        System.out.println("");
        System.out.println(pom);

    }
}
