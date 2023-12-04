package com.example.dataCloudProject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Controller {}
/*
@RestController
@RequestMapping("/data-cloud")
@CrossOrigin(origins = "*", maxAge = 3600)
public class Controller {
    @GetMapping("/pipeline/{username}/{pipeline}")
    public ResponseEntity<?> dataCloudInvocation(@PathVariable("username") String username, @PathVariable("pipeline") String pipeline)  {
        try {
            String yamlContent = tmp(username, pipeline);
            saveYamlToFile(username  + ".yaml", yamlContent);//+ "_" + pipeline

            System.out.println("YAML content retrieved and saved successfully.");
            return ResponseEntity.ok(yamlContent);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return ResponseEntity.ok("Failed");
    }

    private String tmp (String username, String pipeline) throws IOException {
        URL url = new URL("http://crowdserv.sys.kth.se:8082/api/repo/exportyaml/" + username + "/" + pipeline);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

        httpURLConnection.setRequestMethod("GET");
        System.out.println(url.toString());
        int responseCode = httpURLConnection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString();
        } else {
            throw new IOException("Failed to retrieve YAML. HTTP Error Code: " + responseCode);
        }
    }

    private static void saveYamlToFile(String fileName, String yamlContent) throws IOException {
        Path filePath = Paths.get(fileName);
        Files.write(filePath, yamlContent.getBytes());
        System.out.println(filePath.toFile().getAbsolutePath());
    }
}
*/