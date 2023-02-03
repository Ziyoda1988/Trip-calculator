package File;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ziyod\\IdeaProjects\\untitled\\src\\File\\myFile");


// relative path is - path that  is relative to the current folder where the file is

        File path = new File("src/File/myFile");

        File path1 = new File("src/File/myFile");

        //To get a relative path to any file -> right clic -> copy path -> path from content root

        System.out.println(path.exists());

    }}