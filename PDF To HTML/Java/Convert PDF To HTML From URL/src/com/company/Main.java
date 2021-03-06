//****************************************************************************//
//                                                                            //
// Download evaluation version: https://bytescout.com/download/web-installer  //
//                                                                            //
// Signup Cloud API free trial: https://secure.bytescout.com/users/sign_up    //
//                                                                            //
// Copyright © 2017 ByteScout Inc. All rights reserved.                       //
// http://www.bytescout.com                                                   //
//                                                                            //
//****************************************************************************//


package com.company;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import okhttp3.*;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main
{
    // (!) If you are getting '(403) Forbidden' error please ensure you have set the correct API_KEY

    // The authentication key (API Key).
    // Get your own by registering at https://secure.bytescout.com/users/sign_up
    final static String API_KEY = "***********************************";

    // Direct URL of source PDF file.
    final static String SourceFileUrl = "https://s3-us-west-2.amazonaws.com/bytescout-com/files/demo-files/cloud-api/pdf-to-html/sample.pdf";
    // Comma-separated list of page indices (or ranges) to process. Leave empty for all pages. Example: '0,2-5,7-'.
    final static String Pages = "";
    // PDF document password. Leave empty for unprotected documents.
    final static String Password = "";
    // Destination HTML file name
    final static Path DestinationFile = Paths.get(".\\result.html");
    // Set to `true` to get simplified HTML without CSS. Default is the rich HTML keeping the document design.
    final static boolean PlainHtml = false;
    // Set to `true` if your document has the column layout like a newspaper.
    final static boolean ColumnLayout = false;


    public static void main(String[] args) throws IOException
    {
        // Create HTTP client instance
        OkHttpClient webClient = new OkHttpClient();

        // Prepare URL for `PDF To HTML` API call
        String query = String.format(
                "https://bytescout.io/v1/pdf/convert/to/html?name=%s&password=%s&pages=%s&simple=%s&columns=%s&url=%s",
                DestinationFile.getFileName(),
                Password,
                Pages,
                PlainHtml,
                ColumnLayout,
                SourceFileUrl);

        // Prepare request
        Request request = new Request.Builder()
                .url(query)
                .addHeader("x-api-key", API_KEY) // (!) Set API Key
                .build();
        // Execute request
        Response response = webClient.newCall(request).execute();

        if (response.code() == 200)
        {
            // Parse JSON response
            JsonObject json = new JsonParser().parse(response.body().string()).getAsJsonObject();

            boolean error = json.get("error").getAsBoolean();
            if (!error)
            {
                // Get URL of generated HTML file
                String resultFileUrl = json.get("url").getAsString();

                // Download HTML file
                downloadFile(webClient, resultFileUrl, DestinationFile.toFile());

                System.out.printf("Generated HTML file saved as \"%s\" file.", DestinationFile.toString());
            }
            else
            {
                // Display service reported error
                System.out.println(json.get("message").getAsString());
            }
        }
        else
        {
            // Display request error
            System.out.println(response.code() + " " + response.message());
        }
    }

    public static void downloadFile(OkHttpClient webClient, String url, File destinationFile) throws IOException
    {
        // Prepare request
        Request request = new Request.Builder()
                .url(url)
                .build();
        // Execute request
        Response response = webClient.newCall(request).execute();

        byte[] fileBytes = response.body().bytes();

        // Save downloaded bytes to file
        OutputStream output = new FileOutputStream(destinationFile);
        output.write(fileBytes);
        output.flush();
        output.close();

        response.close();
    }
}
