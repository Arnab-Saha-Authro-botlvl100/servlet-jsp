
package com.servlet;

import javax.servlet.http.*;
public class Servlet extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("Doget method ");
    }
}
