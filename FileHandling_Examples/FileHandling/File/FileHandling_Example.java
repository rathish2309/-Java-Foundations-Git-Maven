package FileHandling_Examples.FileHandling.File;

import java.io.*;

public class FileHandling_Example {

    //Create File
    static void createFile(String path) throws IOException {
        File newFile = new File(path);
        if (!newFile.exists()) {
            newFile.createNewFile();
            System.out.println("New File Created : "+path);
        } else {
            System.out.println("File already exists");
        }
    }

    static void writeFile(String path) throws IOException {
        File file = new File(path);
        if (file.exists()) {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("This is a test document");
            System.out.println("Write Operation is completed");
            bufferedWriter.close();
        }
    }


    static void readFile(String path) throws IOException {
        File file = new File(path);
        if (file.exists()) {
            FileReader fileReader = new FileReader(path);

            //to read a data from a file use Scanner Class -> FileWriter Class
//            Scanner scanner = new Scanner(fileReader);
//            while (scanner.hasNext()){
//                //next() -> prints the statement in different lines
//                //nextLine() -> prints all the statements in a single line
//                System.out.println(scanner.nextLine());
//            }

            //BufferedReader Class
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String line = bufferedReader.readLine();
                System.out.println("Read File " + line);
            }
        }
    }

    //Delete File
    static void deleteFail(String path) {
        File file = new File(path);
        if(file.exists()){
            file.delete();
            System.out.println("File is Deleted");
        }
    }

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Raphael R Rathish\\Downloads\\Test_Document.txt";
        createFile(path);
        writeFile(path);
        readFile(path);
        deleteFail(path);
    }

}
