package latihan.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Meal
{
    private List<Item> items = new ArrayList<Item>();

    public void addList(Item item)
    {
        items.add(item);
    }
    
    public float getBiaya()
    {
        float biaya = 0.0f;

        for (Item item : items)
            {
               biaya += item.harga(); 
            }

            return biaya;
    }

    public void showItems()
    {
        for(Item item : items)
        {
           System.out.print("Item : " + item.nama());
           System.out.print(", Packing : " + item.bungkus().pack());
           System.out.println(", Price : " + item.harga());
        }
    }
}