/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directoryfilereader;

/**
 *
 * @author hp
 */
import java.io.*;

public class DirectoryFileReader {
    public static void main(String[] args) {
        String directoryPath = "path_to_directory"; // Replace with the actual directory path

        // Create a FileWriter to write the combined data into a single file
        FileWriter combinedFileWriter;
        try {
            combinedFileWriter = new FileWriter("combined_data.txt"); // Replace with the desired output file name
        } catch (IOException e) {
            System.out.println("Failed to create the output file.");
            return;
        }

        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            combinedFileWriter.write(line + "\n");
                        }
                    } catch (IOException e) {
                        System.out.println("Failed to read file: " + file.getName());
                    }
                }
            }
        }

        try {
            combinedFileWriter.close();
            System.out.println("Combined data written to the output file.");
        } catch (IOException e) {
            System.out.println("Failed to close the output file.");
        }
    }
}
