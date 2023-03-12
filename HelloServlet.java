package com.example.laba6;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import com.example.laba6.TrigFunction;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            String angleString = request.getParameter("angle");
            String isRadianString = request.getParameter("isRadian");
            String function = request.getParameter("function");

            double angle = Double.parseDouble(angleString);
            boolean isRadian = Boolean.parseBoolean(isRadianString);
            double result = 0;

            switch (function) {
                case "sin":
                    result = TrigFunction.sin(angle, isRadian);
                    break;
                case "cos":
                    result = TrigFunction.cos(angle, isRadian);
                    break;
                case "tan":
                    result = TrigFunction.tan(angle, isRadian);
                    break;
                default:
                    out.println("<html><head><title>Error</title></head><body>");
                    out.println("<h1>Invalid function.</h1>");
                    out.println("</body></html>");
                    return;
            }

            out.println("<html><head><title>Result</title></head><body>");
            out.println("<h1>Result: " + result + "</h1>");
            out.println("</body></html>");

        } finally {
            out.close();
        }
    }
}
