package wad.helloindividualpages;

import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class HelloIndividualPages {

    public static void main(String[] args) throws Exception {
        Map<String, Item> items = new HashMap<>();
        Item item = new Item("Wizard hat", "pointy");
        items.put(item.getIdentifier(), item);


        post("/", (req, res) -> {
            String name = req.queryParams("name").trim();
            String type = req.queryParams("type").trim();

            if (!name.isEmpty() && !type.isEmpty()) {
                Item i = new Item(name, type);
                items.put(i.getIdentifier(), i);
            }

            res.redirect("/");
            return "";
        });

        get("/", (req, res) -> {
            HashMap<String, Object> data = new HashMap<>();
            data.put("items", items.values());
            return new ModelAndView(data, "index");
        }, new ThymeleafTemplateEngine());
    }
}
