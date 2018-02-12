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
public class WriteFileApp {

    public static void main(String[] args) {
        File file = new File("file/akhilesh2.txt");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            sb.append("hi Akhilesh").append("\r\n");
        }
        FileHelper.writeFile(file, sb.toString());
    }
}
