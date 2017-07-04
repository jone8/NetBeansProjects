package wad.epicshop;

import wad.epicshop.dao.Database;

public class EpicShop {

    public static void main(String[] args) throws Exception {
        Database database = new Database("jdbc:h2:./database");

    }
}
