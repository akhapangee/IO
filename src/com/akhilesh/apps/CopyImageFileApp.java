/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.apps;

import com.akhilesh.util.FileHelper;

/**
 *
 * @author Akhilesh
 */
public class CopyImageFileApp {

    public static void main(String[] args) {
        boolean copied = FileHelper.copyImageFile("D:/Background pic/paddy-field-brown-wallpaper.jpg", "file/opied_filecopied_file.jpg");
        if (copied) {
            System.out.println("Fiie Copy successful");
        } else {
            System.out.println("Error in file copy");
        }
    }
}
