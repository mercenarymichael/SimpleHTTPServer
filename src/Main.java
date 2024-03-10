import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Main {
    public static void main(String[] args) throws IOException {
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080 ....");
        while (true) {
            final Socket client = server.accept();
        }
    }
}