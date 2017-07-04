package wad.hellocss;

import java.util.HashMap;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class HelloCSS {

    public static void main(String[] args) throws Exception {
        get("/", (req, res) -> {
            HashMap<String, Object> data = new HashMap<>();
            return new ModelAndView(data, "index");
        }, new ThymeleafTemplateEngine());
    }
}
