
package com.mycompany.practical1_10;

import static com.mycompany.practical1_10.FileUtils.getUserInput;
import static com.mycompany.practical1_10.FileUtils.searchFilesByExtension;






public class Practical1_10 {

    public static void main(String[] args) {
        System.out.println("Practical 1.10 Saulin Ivan RIBO-01-22 Variant 4");
        String directoryPath = getUserInput("Введите путь к каталогу для поиска файлов: ");
        searchFilesByExtension(directoryPath, ".docx");
    }
}
