package File;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteRead {
    public static void main(String[] args) throws FileNotFoundException {

         //Absolute path - full path from the root.
        //file IO classes can be text IO and Binary IO classes.
        //.txt .esv .log
        // .mp4 .jpeg .docx .xlsx .pdf

        PrintWriter pw = new PrintWriter (new File("src/File/myFile"));
        pw.write("Salom dunyo");
        pw.close();

    }
}
