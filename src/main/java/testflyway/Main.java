package testflyway;

import org.flywaydb.core.Flyway;

import javax.servlet.*;
import java.io.IOException;

public class Main implements Servlet {

  public void init(ServletConfig servletConfig) throws ServletException {
    // Create the Flyway instance
    Flyway flyway = new Flyway();

    // Point it to the database
    flyway.setDataSource("jdbc:h2:~/Desktop/test", null, null);

    // Start the migration
    System.out.println("Starting migration...");
    flyway.migrate();
    System.out.println("Done.");
  }

  public ServletConfig getServletConfig() {
    return null;
  }

  public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

  }

  public String getServletInfo() {
    return null;
  }

  public void destroy() {

  }
}