package com.cdsb.serial;

import java.time.LocalDate;

public class JacksonCyclistDI {

    Cyclist cyclist;
    String pathCyclistJson = "demos-persistence/resources/cyclist.json";
    String pathBikesJson = "demos-persistence/resources/bikes.json";
    JsonTools jsonTools;

    public JacksonCyclistDI(JsonTools jsonTools) {
        this.jsonTools = jsonTools;
        cyclist = new Cyclist("Pepe", LocalDate.of(2000, 10, 23));
        addBikes();
        System.out.println(cyclist);
    }

    private void addBikes() {
        Bicycle[] bikes;
        bikes = jsonTools.fromJsonFile(pathBikesJson, Bicycle[].class);
        for (int i = 0; i < bikes.length; i++) {
            cyclist.addBike(bikes[i]);
        }
    };

    public void saveCyclist() {
        System.out.println("Saving cyclist...");
        jsonTools.toJsonFile(cyclist, pathCyclistJson);
        Cyclist savedCyclist = jsonTools.fromJsonFile(pathCyclistJson, Cyclist.class);
        System.out.println("Saved Cyclist: " + savedCyclist);
    }

    public static void main(String[] args) {
        JacksonCyclistDI jCyclist = new JacksonCyclistDI(new JsonTools());
        jCyclist.saveCyclist();
    }
}
