package com.hope.sdktomcat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;

/**
 * @description: MainLaunch
 * *
 * @author: hope
 * *
 * @create: 2019-03-11 22:08
 */
public class MainLaunch extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        System.out.println("test MainLaunch aaaaaa");

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Sample Application Servlet Page</title>");
        writer.println("</head>");
        writer.println("<body bgcolor=white>");

        writer.println("<table border=\"0\" cellpadding=\"10\">");
        writer.println("<tr>");
        writer.println("<td>");
        writer.println("<img src=\"images/Pivotal_Logo.png\">");
        writer.println("</td>");
        writer.println("<td>");
        writer.println("<h1>Sample Application Servlet</h1>");
        writer.println("</td>");
        writer.println("</tr>");
        writer.println("</table>");

        writer.println("hope test");
        writer.println("the Hello, World application.");

        writer.println("</body>");
        writer.println("</html>");
    }
}
