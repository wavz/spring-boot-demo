package client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import student.Student;
import student.StudentDTO;

public class ClientConnection {

    public static void sendPostRequest(){
        try {
            URL url = new URL ("http://localhost:8080/saveUser");
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);
            String data = new JSONObject().put("firstName", "ido")
                    .put("lastName", "goldman")
                    .put("email", "itaym178@gmail.com").toString();

            try(OutputStream os = con.getOutputStream()) {
                byte[] input = data.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        String payload ="""
                {
                    "firstName": "admin",
                    "lastName": "System",
                    "email": "itaym178@gmail.com"
                }
                """;
        StringEntity entity = new StringEntity(payload,
                ContentType.APPLICATION_JSON);

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost request = new HttpPost("http://localhost:8080/saveUser");
        request.setEntity(entity);

        HttpResponse response = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            response = httpClient.execute(request);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        StudentDTO studentDTO = objectMapper.readValue(response.getEntity().getContent().readAllBytes(), StudentDTO.class);
        System.out.println(studentDTO);

    }
}
