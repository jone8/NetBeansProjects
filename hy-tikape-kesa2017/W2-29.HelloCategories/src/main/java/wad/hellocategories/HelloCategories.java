package wad.hellocategories;

import java.util.List;
import java.util.TreeMap;
import spark.ModelAndView;
import static spark.Spark.get;
import static spark.Spark.post;
import spark.template.thymeleaf.ThymeleafTemplateEngine;
import wad.hellocategories.dao.Database;
import wad.hellocategories.domain.Category;
import wad.hellocategories.domain.Item;

public class HelloCategories {

    public static void main(String[] args) throws Exception {
        // NOTE! DO NOT CHANGE THE WAY HOW THE DATABASE IS INITIATED
        Database database = new Database("jdbc:h2:./database");

        get("/", (req, res) -> {
            res.redirect("/category");
            return "";
        });

    }

}
