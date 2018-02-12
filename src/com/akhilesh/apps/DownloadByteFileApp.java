/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.apps;

import com.akhilesh.util.HttpClient;

/**
 *
 * @author Akhilesh
 */
public class DownloadByteFileApp {

    public static void main(String[] args) {
        HttpClient.downloadMediaFile("https://www.youtube.com/watch?v=Z1cSgFY6_cI", "file/song.mp4");
    }
}
