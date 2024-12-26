package com.waka.web.ecom.route;

import com.waka.web.ecom.controller.HomeController;
import com.waka.web.ecom.controller.ProfileController;
import com.waka.web.mvc.core.interfaces.BaseRouter;
import com.waka.web.mvc.core.route.RouterMap;

public class Web implements BaseRouter {
    @Override
    public void registerRouter() {
        // Register your routes here
        RouterMap.get("/",new HomeController(), "index");
        RouterMap.get("/profile",new ProfileController(), "index");
    }
}
