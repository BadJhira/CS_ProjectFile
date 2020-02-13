package CS_141.W9.InClass;

import java.io.*;
import java.util.*;
// 11/21/2019 Doug Gilchrist [File Processing]
public class FileProcessing {
    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner input = new Scanner(new File("Files/test_data.txt"));
        String text = input.next();
        System.out.println(text);
    }

    /*
    File objects require importing java.io.*
    canRead() returns whether file is able to be read
    exists() whether this file exists on disk
    delete() removes file from disk
    length() returns number of bytes in file
    getName() returns file's name
    renameTo() changes name of file
     */
}
