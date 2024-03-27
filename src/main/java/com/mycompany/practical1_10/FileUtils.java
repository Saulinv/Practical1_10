
package com.mycompany.practical1_10;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 

public class FileUtils {
    public static void searchFilesByExtension(String directoryPath, String extension) {
        File directory = new File(directoryPath);
        if (!directory.isDirectory()) {
            System.out.println("Указанный путь не является каталогом.");
            return;
        }
        List<File> foundFiles = new ArrayList<>();
        searchFiles(directory, extension, foundFiles);
        Collections.sort(foundFiles);
        System.out.println("Finding " + extension + " in " + directoryPath);
        for (File file : foundFiles) {
            System.out.println(file.getPath() + " " + file.length() + " bytes");
        }
    }
    public static void searchFiles(File directory, String extension, List<File> foundFiles) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    searchFiles(file, extension, foundFiles);
                } else if (file.getName().toLowerCase().endsWith(extension)) {
                    foundFiles.add(file);
                }
            }
        }
    }
    public static String getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
}
