package wad.shoppingspree;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import spark.ModelAndView;
import spark.Session;
import static spark.Spark.get;
import static spark.Spark.post;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class ShoppingSpree {

    public static void main(String[] args) throws Exception {
        // Do not change the items in the list
        List<String> items = Arrays.asList("Bongos", "Congas", "Darbukas", "Djembes");

        get("/", (req, res) -> {


            TreeMap<String, Object> data = new TreeMap<>();

            data.put("cart", new ShoppingCart());
            data.put("items", items);

            return new ModelAndView(data, "index");
        }, new ThymeleafTemplateEngine());

    }
}
