package exceptions12; // : exceptions12/MainException.java

import java.io.*;

public class MainException {
    // Pass all exceptions12 to the console:
    public static void main(String[] args) throws Exception {
        // Open the file:
        FileInputStream file = new FileInputStream("MainException.java");
        // Use the file ...
        // Close the file:
        file.close();
    }
} /// :~
