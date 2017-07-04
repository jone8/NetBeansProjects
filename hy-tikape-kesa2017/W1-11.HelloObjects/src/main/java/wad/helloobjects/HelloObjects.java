package wad.helloobjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class HelloObjects {

    public static void main(String[] args) throws Exception {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Wizard hat", "pointy"));


        get("/", (req, res) -> {
            HashMap<String, Object> data = new HashMap<>();
            data.put("items", items);
            return new ModelAndView(data, "index");
        }, new ThymeleafTemplateEngine());
    }
}
