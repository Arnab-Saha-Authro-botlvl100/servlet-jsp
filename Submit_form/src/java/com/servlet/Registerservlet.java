
package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class Registerservlet extends HttpServlet{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        String name = req.getParameter("uname");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>"+name+"</h2>");
    }
}

