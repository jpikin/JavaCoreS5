package program;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Backup {
    /**
     * Метод копирует все файлы из каталога Files в каталог Backup
     * Если каталог не создан, метод создает его.
     */
    public static void createBackup() {
        File sourceDirectory = new File("./src/main/java/Files/");
        File targetDirectory = new File("./src/main/java/Backup");

        try {
            FileUtils.copyDirectory(sourceDirectory, targetDirectory);
            System.out.println("Файлы успешно скопированы.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
