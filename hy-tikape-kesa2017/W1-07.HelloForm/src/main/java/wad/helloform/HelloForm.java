package wad.helloform;

import java.util.HashMap;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class HelloForm {

    public static void main(String[] args) throws Exception {
        get("/", (req, res) -> {
            HashMap<String, Object> data = new HashMap<>();

            String content = "Hello world!";
            if (req.queryParams().contains("content")) {
                content = req.queryParams("content");
            }

            data.put("content", content);

            return new ModelAndView(data, "index");
        }, new ThymeleafTemplateEngine());
    }
}
