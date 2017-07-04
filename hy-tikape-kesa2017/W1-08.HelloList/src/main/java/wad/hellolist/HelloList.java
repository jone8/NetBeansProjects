package wad.hellolist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class HelloList {

    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        list.add("Hello world!");

        get("/", (req, res) -> {
            HashMap<String, Object> data = new HashMap<>();

            if (req.queryParams().contains("content")) {
                list.add(req.queryParams("content"));
            }

            data.put("list", list);
            return new ModelAndView(data, "index");
        }, new ThymeleafTemplateEngine());
    }
}
