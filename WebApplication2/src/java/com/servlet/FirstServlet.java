/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
public class FirstServlet implements Servlet{
    
    ServletConfig conf;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.conf = config;
        System.out.println("Creating Servlet");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.conf;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html"); 
        PrintWriter out = res.getWriter();
        out.println("<h1>output from servelet</h1>");
        System.out.println("Servicing");
    }

    @Override
    public String getServletInfo() {
        return "This servlet created by Arnab";
    }

    @Override
    public void destroy() {
        System.out.println("Destroy");
    }
   
}
