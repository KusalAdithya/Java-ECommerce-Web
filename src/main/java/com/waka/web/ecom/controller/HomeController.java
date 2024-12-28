package com.waka.web.ecom.controller;

import com.waka.web.ecom.entity.Users;
import com.waka.web.ecom.util.JPAUtil;
import com.waka.web.mvc.core.controller.Controller;
import jakarta.persistence.EntityManager;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HomeController extends Controller {

    public void index(HttpServletRequest request, HttpServletResponse response) {
        view("index", request, response);
    }
}
