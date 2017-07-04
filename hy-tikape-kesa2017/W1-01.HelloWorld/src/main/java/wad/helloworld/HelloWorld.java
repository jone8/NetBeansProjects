package wad.helloworld;

import static spark.Spark.*;

public class HelloWorld {

    public static void main(String[] args) throws Exception {
   get("*", (req, res)-> "Hello World");
    
    } 
}
