package kz.bitlab.spring.springbootdemo.db;

import kz.bitlab.spring.springbootdemo.model.Items;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
    public static ArrayList<Items> items = new ArrayList<>();

    static {
        items.add(new Items(1L,"Mac Book Pro","8GB Ram 255 GB SDD",1199));
        items.add(new Items(2L,"Mac Book Pro","16GB Ram 500 GB SDD",1499));
        items.add(new Items(3L,"Mac Book Pro","16GB Ram 1 TB SDD",1799));
    }


    public static List<Items> getAllItems(){
        return items;
    }

    public static void AddItems(Items item){
        items.add(item);
    }
}
