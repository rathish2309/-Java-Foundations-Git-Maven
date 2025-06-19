package NativeJavaAPI_Testing;

import java.io.IOException;
import java.net.*;
import java.util.Arrays;
import java.util.List;

public class HttpURLConnection_Example {
    public static void main(String[] args) throws IOException, URISyntaxException {
//

        List<String> apiUrls = Arrays.asList(
//                "https://api.github.com",
//                "https://api.openweathermap.org/data/2.5/weather?q=London&appid=YOUR_API_KEY",
//                "https://jsonplaceholder.typicode.com/posts/1",
//                "https://reqres.in/api/users/2",
//                "https://api.agify.io/?name=michael",
//                "https://api.genderize.io/?name=lucy",
//                "https://api.nationalize.io/?name=matteo",
//                "https://www.boredapi.com/api/activity",
//                "https://catfact.ninja/fact",
                "https://api.adviceslip.com/advice",
                "https://dog.ceo/api/breeds/image/random"
        );


        for (String urls : apiUrls) {
            //create object for url connection
            URL url = URI.create(urls).toURL();

            //open the connection and store it in HTTP Connection which is the child class of URLConnection
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            //set the request type
            httpURLConnection.setRequestMethod("GET");

            // connect
            httpURLConnection.connect();

            //print the status code
            int responseCode = httpURLConnection.getResponseCode();

            //print the status message
            String requestMethod = httpURLConnection.getRequestMethod();
            System.out.println(responseCode+"-"+requestMethod);

            // store the values in inputstream - use bufferread to print the values

        }


    }

}
