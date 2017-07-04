package wad.postredirectget;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class PostRedirectGet {

    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();


        get("/", (req, res) -> {
            HashMap<String, Object> data = new HashMap<>();
            data.put("list", list);
            return new ModelAndView(data, "index");
        }, new ThymeleafTemplateEngine());
    }
}
