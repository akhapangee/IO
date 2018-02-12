package com.akhilesh.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Akhilesh
 */
public class FileHelper {

    /**
     * @param fileName
     * @return
     */
    public static String readFile(File fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            FileReader reader = new FileReader(fileName);
            int ch = 0;
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return sb.toString();
    }

    /**
     *
     * @param fileName
     * @return
     */
    public static String readFileUsingBufferedReader(File fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String str = "";
            while ((str = reader.readLine()) != null) {
                sb.append(str).append("\r\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return sb.toString();
    }

    /**
     * @param filename
     * @param fileContent
     */
    public static void writeFile(File filename, String fileContent) {
        try {
            Writer writer = new FileWriter(filename);
            writer.write(fileContent);
            System.out.println("File write successful");
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param fileName
     * @param toFilePath
     * @return
     */
    public static boolean copyImageFile(String fileName, String toFilePath) {
        try {
            FileInputStream is = new FileInputStream(fileName);
            FileOutputStream os = new FileOutputStream(toFilePath);

            int i = 0;
            byte[] data = new byte[1024 * 5];
            while ((i = is.read(data)) != -1) {
                os.write(data, 0, i);
            }
            is.close();
            os.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public static String readACharAtATime(String file) {
        String fileContent = "";
        try {
            Reader reader = new FileReader(file);
            int ch = 0;
            while ((ch = reader.read()) != -1) {
                fileContent += (char) ch;
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return fileContent;
    }
}
