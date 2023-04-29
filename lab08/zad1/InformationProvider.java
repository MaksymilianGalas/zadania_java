package zad1;

import java.io.File;

public class InformationProvider {
    public void displayInformation(File file) {
        System.out.println("Nazwa: " + file.getName());
        System.out.println("Ścieżka: " + file.getAbsolutePath());
        System.out.println("Czy jest plikiem: " + file.isFile());
        System.out.println("Czy jest katalogiem: " + file.isDirectory());
        System.out.println("Czy plik istnieje: " + file.exists());
        System.out.println();
    }

    public static void main(String[] args) {
        File exerciseDirectory = new File("exercise");
        if (!exerciseDirectory.exists()) {
            exerciseDirectory.mkdir();
        }

        File file1 = new File(exerciseDirectory, "file1.txt");
        File file2 = new File(exerciseDirectory, "file2.txt");
        File file3 = new File(exerciseDirectory, "file3.txt");
        if (!file1.exists()) {
            try {
                file1.createNewFile();
                file2.createNewFile();
                file3.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        File directory1 = new File(exerciseDirectory, "directory1");
        File directory2 = new File(exerciseDirectory, "directory2");
        if (!directory1.exists()) {
            directory1.mkdir();
            directory2.mkdir();
        }

        InformationProvider informationProvider = new InformationProvider();
        informationProvider.displayInformation(file1);
        informationProvider.displayInformation(file2);
        informationProvider.displayInformation(file3);
        informationProvider.displayInformation(directory1);
        informationProvider.displayInformation(directory2);
    }
}
