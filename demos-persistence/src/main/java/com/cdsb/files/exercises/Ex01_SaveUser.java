package com.cdsb.files.exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex01_SaveUser {

    // Preguntar al usuario sus datos
    public static String askUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String name = scanner.nextLine();

        System.out.print("Introduce tu primer apellido: ");
        String surname = scanner.next();

        System.out.print("Introduce tu segundo apellido: ");
        String surname2 = scanner.next();

        scanner.close();
        return "Tu nombre es: " + name + " " + surname + " " + surname2;
    }

    // Creo fichero
    static void createFile(String pathName) {
        File file = new File(pathName);

        // Debemos comprobar si el fichero existe
        if (file.exists() && file.isDirectory()) {
            System.out.println("Directory %s  exist".formatted(pathName));
            return;
        }

        if (file.exists() && !file.isDirectory()) {
            System.out.println("File %s  exist".formatted(pathName));
            return;
        }

        try {
            if (!file.createNewFile()) {
                System.out.println("Failed to create file " + pathName);
                return;
            }
        } catch (IOException e) {
            System.err.println("Error creating file: " + pathName);
            return;
        }
        System.out.println("File: " + pathName + " created.");
    }

    // Guardar en un fichero user.txt
    public static void saveInfo(String pathName, String content) {
        if (content == null || content.isEmpty()) {
            System.out.println("Content is empty, nothing to write to file: " + pathName);
            return;
        }

        try (FileWriter writer = new FileWriter(pathName)) { // esto sirve para cerrar el writer
            writer.write(content);
            // writer.close();
        } catch (IOException e) {
            System.err.println("Error writing file. " + pathName);
        }
        System.out.println("Writing to file " + pathName + ": " + content);
    }

    public static void readFile(String pathName) {
        try (FileReader file = new FileReader(pathName)) {
            BufferedReader br = new BufferedReader(file);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Reading file: " + line);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Pregunto al usuario
        // askUser();

        // creo fichero
        String pathName = "demos-persistence/resources/user.txt";
        createFile(pathName);
        saveInfo(pathName, askUser());
        System.out.println("=".repeat(30));

        // Leemos el archivo
        readFile(pathName);

    }
}
