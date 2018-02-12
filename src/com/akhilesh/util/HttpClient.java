package com.akhilesh.util;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Akhilesh
 */
public class HttpClient {

    public static void downloadMediaFile(String link, String fileName) {
        try {
            URL url = new URL(link);
            URLConnection conn = url.openConnection();
            InputStream is = conn.getInputStream();
            byte[] data = new byte[1024 * 5];
            FileOutputStream os = new FileOutputStream(fileName);

            int ch = 0;
            while ((ch = is.read(data)) != -1) {
                os.write(data, 0, ch);
            }
            is.close();
            os.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String downloadWebPage(String link) {
        StringBuilder content = new StringBuilder();
        try {
            URL url = new URL(link);
            URLConnection conn = url.openConnection();
            InputStream is = conn.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String string = "";

            while ((string = br.readLine()) != null) {
                content.append(string).append(System.lineSeparator());
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return content.toString();
    }
}
