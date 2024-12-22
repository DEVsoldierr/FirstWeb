package org.example;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
 protected void doGet(HttpServletRequest req , HttpServletResponse res) {

        try {
            res.getWriter().println("HELLO BABES");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}