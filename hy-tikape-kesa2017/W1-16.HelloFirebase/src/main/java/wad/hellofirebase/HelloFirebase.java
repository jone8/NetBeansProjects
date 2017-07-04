package wad.hellofirebase;

import java.util.HashMap;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class HelloFirebase {

    public static void main(String[] args) throws Exception {
        FirebaseService firebaseService = new FirebaseService("https://blinding-torch-827.firebaseio.com/items/");

        get("/", (req, res) -> {
            HashMap<String, Object> data = new HashMap<>();
            data.put("items", firebaseService.list());
            return new ModelAndView(data, "index");
        }, new ThymeleafTemplateEngine());

        post("/", (req, res) -> {
            firebaseService.add(new FirebaseItem(req.queryParams("name")));
            res.redirect("/");
            return "";
        });
    }
}
