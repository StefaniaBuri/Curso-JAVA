package com.cdsb.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSystem1 {

    //Leer lista ficheros y carpetas
    static void listFiles(String pathName) {
        File file = new File(pathName);
        String [] list = file.list();

        for (String element : list) {
            char type = getType(pathName + "/" + element);
            System.out.println(type + " " + element);
        }
        System.out.println("=".repeat(30));
    }

    static void listFiles2(String pathName) {
        /* El objeto File representa un archivo o directorio en el sistema de archivos.
         * Independientemente de si existe o no.
        */
        File file = new File(pathName);

        /* Debemos comprobar si el directorio existe y es un directorio */
        if(!file.exists()) {
            System.out.println("Directory %s does not exist".formatted(pathName));
            return;
        }

        if(!file.isDirectory()) {
            System.out.println("%s is not a directory".formatted(pathName));
            return;
        }

        //Podemos obtener la lista de ficheros y directorios o de sus nombres
        File [] filesList = file.listFiles();

        //Comprobamos si es nulo o cero
        if(filesList == null || filesList.length == 0) {
            System.out.println("No files found in the directory: " + pathName);
            return;
        }

        //Imprimimos los nombres de los ficheros
        for (File fileItem : filesList) {
            char type = fileItem.isDirectory() ? 'D' : 'F';
            System.out.println("[%s] - %s".formatted(type, fileItem.getName()));
        }
        System.out.println("=".repeat(30));
    }

    static char getType(String pathName) {
        File file = new File(pathName);
        return file.isDirectory() ? 'D' : 'F';
    }

    //Crear nuevas carpetas
    static void createFolder(String pathName) {
        File file = new File(pathName);

        //Debemos comprobar si el fichero existe
        if(file.exists() && file.isDirectory()) {
            System.out.println("Directory %s  exist".formatted(pathName));
            return;
        }

        if(file.exists() && !file.isDirectory()) {
            System.out.println("File %s  exist".formatted(pathName));
            return;
        }

        /* Crear un directorio, debemos llamar al método mkdir()
         * mkdir() crea un único directorio, mientras que mkdir() crea todos los directorios necesarios en la ruta especificada.
         * Devuelven true o false dependiendo de si la operación fue exitosa o no.
         */
        if(!file.mkdir()) {
            System.out.println("Failed to create directory: " + pathName);
            return;
        }
        System.out.println("Directory: " + pathName +  " created");
    }

    //Crear ficheros
    static void createFile(String pathName) {
        File file = new File(pathName);

        //Debemos comprobar si el fichero existe
        if(file.exists() && file.isDirectory()) {
            System.out.println("Directory %s  exist".formatted(pathName));
            return;
        }

        if(file.exists() && !file.isDirectory()) {
            System.out.println("File %s  exist".formatted(pathName));
            return;
        }

        try {
            if(!file.createNewFile()) {
                System.out.println("Failed to create file " + pathName);
                return;
            }
        } catch (IOException e) {
            System.err.println("Error creating file: " + pathName);
            return;
        }
        System.out.println("File: " + pathName + " created.");
    }

    //Borrar carpetas/ ficheros
    static void deleteFolder(String pathName) {
        File file = new File(pathName);
        if(!file.exists()) {
            System.out.println("Directory %s does not exist".formatted(pathName));
            return;
        }

        char type = file.isDirectory() ? 'D' : 'F';
        if (!file.delete()) {
            System.out.println("Failed to delete " + type + ": " + pathName);
            return;
        }
        System.out.println("Archivo borrado");

    }

    //Escribir en ficheros
    public static void writeFile(String pathName, String content) { //donde queremos escribir y que queremos escribir

        if(content == null || content.isEmpty()) {
            System.out.println("Content is empty, nothing to write to file: " + pathName);
            return;
        }

        try(FileWriter writer = new FileWriter(pathName)) { //esto sirve para cerrar el writer
            writer.write(content);
            //writer.close();
        } catch (IOException e) {
            System.err.println("Error writing file. " + pathName);
        }
        System.out.println("Writing to file " + pathName + ": " + content);
        System.out.println("------------------------");
    }


    //Leer de un fichero
    public static void readFile(String pathName) {
        File file = new File(pathName);
        if(!file.exists()) {
            System.out.println("File does not exist: " + pathName);
            return;
        }

        List<String> lines = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        try(Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                //System.out.println(line);
                lines.add(line);
                sb.append(line);
                sb.append("\n");
            }
            System.out.println("Reading file: " + pathName);
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + pathName);
            return;
        }
        System.out.println(lines);
        System.out.println(sb.toString());
    }


    public static void readFile2(String pathName) {
        try (BufferedReader br = new BufferedReader(new FileReader(pathName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        // Creamos constante
        //String pathName =  "demos-persistence/samples";
        //String pathName =  "demos-persistence/resources";
        //String pathName =  "demos-persistence/pom.xml";


        //listFiles(pathName);
        //getType(pathName);
        //listFiles2(pathName);

        String pathName =  "demos-persistence/samples";
        //createFolder(pathName);
        //deleteFolder(pathName);


        //crear fichero
        pathName =  "demos-persistence/resources/sample.txt";
        //createFile(pathName);
        //deleteFolder(pathName);


        //Escribimos en el fichero
        writeFile(pathName, "Hola Mundo \nAdios amigos");

        //Leemos el fichero
        //readFile(pathName);
        readFile2(pathName);


        // Crear un objeto File que representa un archivo
        //File file = new File("documento.txt");

        // Verificar si el archivo existe
        /* if (file.exists()) {
            System.out.println("El archivo existe.");
        } else {
            System.out.println("El archivo no existe.");
            // Crear el archivo si no existe
            try {
                if (file.createNewFile()) {
                    System.out.println("Archivo creado.");
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            } catch (IOException e) {
                System.err.println("Error al crear el archivo: " + e.getMessage());
            }
        } */

        // Obtener el nombre del archivo
        //System.out.println("Nombre del archivo: " + file.getName());

        // Eliminar el archivo
        /* if (file.delete()) {
            System.out.println("Archivo eliminado.");
        } else {
            System.out.println("No se pudo eliminar el archivo.");
        } */
    }

}
