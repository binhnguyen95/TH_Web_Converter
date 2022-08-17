package com.example.th_web_2;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ConverterServlet", value = "/convert")
public class ConverterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float rate = Float.parseFloat(req.getParameter("rate"));
        float usd = Float.parseFloat(req.getParameter("usd"));

        float vnd = rate * usd;

        PrintWriter write = resp.getWriter();
        write.println("<html>");
        write.println("<h1>Rate: " + rate + "<h1>");
        write.println("<h1>USD: " + usd + "</h1>");
        write.println("<h1>VND: " + vnd + "</h1>");
        write.println("<html>");
    }
}