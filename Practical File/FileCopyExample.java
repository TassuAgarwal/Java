import java.io.*;

class FileCopyExample {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try {
            // Create FileReader and FileWriter objects
            FileReader fileReader = new FileReader(sourceFile);
            FileWriter fileWriter = new FileWriter(destinationFile);

            // Read from the source file and write to the destination file
            int character;
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }

            // Close the FileReader and FileWriter objects
            fileReader.close();
            fileWriter.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
