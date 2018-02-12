/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.apps;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Akhilesh
 */
public class CreateNewFile {

    public static void main(String[] args) {
        File file = new File("file/ab.txt");
        try {
            if (file.isFile()) {
                file.delete();
                System.out.println("Deleted");
            } else {
                file.createNewFile();
                System.out.println("File created successfully");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
