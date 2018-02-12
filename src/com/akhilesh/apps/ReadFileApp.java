/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.apps;

import com.akhilesh.util.FileHelper;
import java.io.File;

/**
 *
 * @author Akhilesh
 */
public class ReadFileApp {

    public static void main(String[] args) {

        File file1 = new File("./file/akhilesh.txt");
        File file2 = new File("../../");
        
        System.out.println(file2.getAbsoluteFile());
        for (String s : file2.list()) {
            System.out.println(s);
        }
        System.out.println("===================================");

        System.out.println(FileHelper.readFile(file1));
        System.out.println("===========================");
        
        File f = new File(".");
        System.out.println("Absolute Path: "+f.getAbsolutePath());
        
        System.out.println("==========================");
        File fileName = new File("file/akhilesh2.txt");
        System.out.println(FileHelper.readFile(fileName));
    }
}
