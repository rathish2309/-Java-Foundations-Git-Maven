package FileHandling_Examples.FileHandling.Folder;

import java.io.File;

public class Folder_FileHandling_Example {

//    //create folder
    static void createFolder(String path) {
        File newFolder = new File(path);
        if (!newFolder.exists()) {
            newFolder.mkdir();
            System.out.println("New Folder Created");
        } else {
            System.out.println("Folder already exists");
        }
    }

    //rename a created folder
    static void renameFolder(String oldPath, String newPath) {
        File oldFolder = new File(oldPath);
        File newFolder = new File(newPath);
        if (oldFolder.exists()) {
            oldFolder.renameTo(newFolder);
            System.out.println("Folder name renamed to " + newFolder);
        }
    }

    //    delete the created folder
    static void deleteFolder(String path) {
        File folder = new File(path);
        if (!folder.exists()) {
            folder.delete();
            System.out.println("Folder is deleted" + path);
        }
    }


    public static void main(String[] args) {
        createFolder("C:\\Users\\Raphael R Rathish\\Downloads\\New folder");
        renameFolder("C:\\Users\\Raphael R Rathish\\Downloads\\New folder",
                "C:\\Users\\Raphael R Rathish\\Downloads\\New Test Folder");
        deleteFolder("C:\\Users\\Raphael R Rathish\\Downloads\\New Test Folder");
    }
}
