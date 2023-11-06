import org.apache.click.ClickServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class SampleApp {
    public static void main(String[] args) throws Exception {

        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
        context.setContextPath("/");

        ServletHolder holder = new ServletHolder(new ClickServlet());
        context.addServlet(holder, "/*");

        server.setHandler(context);

        try {
            server.start();
            server.join();
        } finally {
            server.destroy();
        }
    }
}

