package com.waka.web.ecom.controller;

import com.waka.web.mvc.core.controller.Controller;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HomeController extends Controller {
    public void index(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("Hello from Home Controller");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}