package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pharmacy catPharmacy = new CatPharmacy();

        Component pen = new Penicilium("5 мг");
        pen.setWeight("7 мг");

        catPharmacy.addComponent(new Azitronitum("12 мг"))
                .addComponent(new Water("10 мл"))
                .addComponent(pen);

        Pharmacy catPharmacy1 = new CatPharmacy();
        catPharmacy1.addComponent(new Azitronitum("15 мг"))
                .addComponent(pen);

        Pharmacy catPharmacy2 = new CatPharmacy();
        catPharmacy2.addComponent(new Azitronitum("15 мг"))
                .addComponent(new Water("12 мл"));

        Pharmacy catPharmacy3 = new CatPharmacy();
        catPharmacy3.addComponent(new Azitronitum("15 мг")).
                addComponent(new Azitronitum("15 мг"));

        Pharmacy catPharmacy4 = new CatPharmacy();
        catPharmacy4.addComponent(pen);

        Pharmacy catPharmacy5 = new CatPharmacy();
        catPharmacy5.addComponent(new Water("12 мл")).
                addComponent(new Water("12 мл"))
                .addComponent(new Water("12 мл"));

        Pharmacy catPharmacy6 = new CatPharmacy();
        catPharmacy6.addComponent(new Water("0 мл")).
                addComponent(new Azitronitum("0 мг"));

        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(catPharmacy6);
        pharmacyList.add(catPharmacy3);
        pharmacyList.add(catPharmacy1);
        pharmacyList.add(catPharmacy2);
        pharmacyList.add(catPharmacy4);
        pharmacyList.add(catPharmacy5);
        pharmacyList.add(catPharmacy);

//        System.out.println(pharmacyList);

        System.out.println("---------");

        for (Pharmacy pharmacy : pharmacyList) {
            System.out.printf("Лекарство - имеет силу: %d единиц и название: %s%n",
                    pharmacy.getFullPower(), pharmacy.getPharmacyName() );
        }
        System.out.println("---------");

        Collections.sort(pharmacyList);

        for (Pharmacy pharmacy : pharmacyList) {
            System.out.printf("Лекарство - имеет силу: %d единиц и название: %s%n",
                    pharmacy.getFullPower(), pharmacy.getPharmacyName() );
        }
        System.out.println("---------");

//        while (((Iterator<Component>) catPharmacy).hasNext()) {
//            System.out.println(((Iterator<Component>) catPharmacy).next());
//        }

        for (Component component : catPharmacy) {
            System.out.println(component);
        }

        Set<Pharmacy> result = new HashSet<>();
        for (Pharmacy p : pharmacyList) {
            result.add(p);
        }
        System.out.printf("Количество уникальных лекарств = %d%n", result.size());
        System.out.println("---------");

    }
}