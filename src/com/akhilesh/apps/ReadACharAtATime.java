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
public class ReadACharAtATime {
    public static void main(String[] args) {
        String file = "file/akhilesh2.txt";
        System.out.println(FileHelper.readACharAtATime(file));
    }
}
