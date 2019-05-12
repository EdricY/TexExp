import com.sun.net.httpserver.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.util.*;

public class Server implements HttpHandler {
    public static void main(String[] args) throws IOException {
        int port = 8500;
        if (args.length > 1) port = Integer.parseInt(args[0]);
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        HttpContext context = server.createContext("/", new Server());
        server.start();
        System.out.println("Starting server on port " + port);
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {

        if (exchange.getRequestMethod().equalsIgnoreCase("POST")) {
            try {
                // REQUEST Headers
                Headers requestHeaders = exchange.getRequestHeaders();
                Set<Map.Entry<String, List<String>>> entries = requestHeaders.entrySet();

                /*
                // print headers
                for (Map.Entry<String, List<String>> map : entries) {
                    System.out.println(map);
                }
                */

                int contentLength = Integer.parseInt(requestHeaders.getFirst("Content-length"));

                // REQUEST Body
                InputStream is = exchange.getRequestBody();

                byte[] data = new byte[contentLength];
                int length = is.read(data);

                String text = new String(data);
                System.out.println(text);
                text = TexExpTranslator.translate(text);
                byte[] textBytes = text.getBytes();

                // RESPONSE Headers
                Headers responseHeaders = exchange.getResponseHeaders();

                // Send RESPONSE Headers
                exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, textBytes.length);

                // RESPONSE Body
                OutputStream os = exchange.getResponseBody();

                os.write(textBytes);
                exchange.close();
            } catch (Exception e) {
                byte[] data = "error".getBytes();
                exchange.sendResponseHeaders(500, data.length);
                OutputStream os = exchange.getResponseBody();
                os.write(data);
                exchange.close();
                e.printStackTrace();
            }
        } else {
            String response = "Hello! Please send me a post request...";
            exchange.sendResponseHeaders(200, response.getBytes().length);//response code and length
            System.out.println(response);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}
