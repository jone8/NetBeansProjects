package wad.hellopathvariables;

import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class HelloPathVariables {

    public static void main(String[] args) throws Exception {
        Map<String, Item> items = new HashMap<>();
        items.put("default", new Item("Hat", "default"));
        items.put("ascot", new Item("Ascot cap", "hat"));
        items.put("balaclava", new Item("Balaclava", "hat"));
        items.put("bicorne", new Item("Bicorne", "hat"));
        items.put("busby", new Item("Busby", "hat"));
        items.put("capotain", new Item("Capotain", "hat"));
        items.put("homburg", new Item("Homburg", "hat"));
        items.put("montera", new Item("Montera", "hat"));


        get("/", (req, res) -> {
            HashMap<String, Object> data = new HashMap<>();
            data.put("item", items.get("default"));
            return new ModelAndView(data, "index");
        }, new ThymeleafTemplateEngine());
    }
}
