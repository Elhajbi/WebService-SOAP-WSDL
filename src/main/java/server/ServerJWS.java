package server;

import WS.BanqueService;
import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String url ="http://localhost:5566/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web Service déployé sur "+url);
    }
}
