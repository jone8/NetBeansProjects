package wad.helloauth;

import java.util.TreeMap;
import spark.ModelAndView;
import static spark.Spark.before;
import static spark.Spark.get;
import static spark.Spark.halt;
import static spark.Spark.post;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

public class HelloAuth {

    public static void main(String[] args) throws Exception {


        get("/", (req, res) -> {
            return new ModelAndView(new TreeMap<>(), "index");
        }, new ThymeleafTemplateEngine());

    }
}
