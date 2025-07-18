package com.cdsb.serial;

import java.time.LocalDate;

public class JacksonCyclist2 {

    Cyclist cyclist;
    String pathCyclistJson = "demos-persistence/resources/cyclist.json";
    String pathBikesJson = "demos-persistence/resources/bikes.json";
    //JsonTools jsonTools;

    public JacksonCyclist2() {
        //this.jsonTools = jsonTools;
        cyclist = new Cyclist("Pepe", LocalDate.of(2000, 10, 23));
        addBikes();
        System.out.println(cyclist);
    }

    private void addBikes() {
        Bicycle[] bikes;
        bikes = Jsons.fromJsonFile(pathBikesJson, Bicycle[].class);
        for (int i = 0; i < bikes.length; i++) {
            cyclist.addBike(bikes[i]);
        }
    };

    public void saveCyclist() {
        System.out.println("Saving cyclist...");
        Jsons.toJsonFile(cyclist, pathCyclistJson);
        Cyclist savedCyclist = Jsons.fromJsonFile(pathCyclistJson, Cyclist.class);
        System.out.println("Saved Cyclist: " + savedCyclist);
    }

    public static void main(String[] args) {
        JacksonCyclist2 jCyclist = new JacksonCyclist2();
        jCyclist.saveCyclist();
    }
}
