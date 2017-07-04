package wad.readinglist;

import java.util.TreeMap;
import spark.ModelAndView;
import static spark.Spark.get;
import static spark.Spark.post;
import spark.template.thymeleaf.ThymeleafTemplateEngine;
import wad.readinglist.dao.Database;

public class ReadingList {

    public static void main(String[] args) throws Exception {
        Database database = new Database("jdbc:h2:./database");

        get("/", (req, res) -> {
            TreeMap<String, Object> data = new TreeMap<>();
            return new ModelAndView(data, "index");
        }, new ThymeleafTemplateEngine());


    }

}
