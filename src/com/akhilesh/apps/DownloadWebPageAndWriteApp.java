/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.apps;

import com.akhilesh.util.FileHelper;
import com.akhilesh.util.HttpClient;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Akhilesh
 */
public class DownloadWebPageAndWriteApp {

    public static void main(String[] args) throws IOException {
        File file = new File("file/rbb.html");
        String content = HttpClient.downloadWebPage("http://rbb.com.np/");
        FileHelper.writeFile(file, content);
//        System.out.println(content);
    }
}
