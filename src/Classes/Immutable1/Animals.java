package Classes.Immutable1;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public final class Animals {
    private final ArrayList<String> favouritesFoods;

    public Animals(ArrayList<String> favouritesFoods) {
        if (favouritesFoods == null || favouritesFoods.size() == 0)
            throw new RuntimeException("favouriteFood is empty");
       // this.favouritesFoods = favouritesFoods;    //mutable
        this.favouritesFoods= new ArrayList<String>(favouritesFoods);
    }

    public int getFavourtieFoodsCount() {
        return favouritesFoods.size();
    }

    public String getFavouriteFoodsItem(int index) {
        return favouritesFoods.get(index);
    }
}
class MoreAnimals{
    public static void main(String[] args) {
        var favourites = new ArrayList<String>();
        favourites.add("Apples");

        var zebra = new Animals(favourites);
        System.out.println(zebra.getFavouriteFoodsItem(0));

        favourites.clear();
        favourites.add("cholocate cookikes");
        System.out.println(zebra.getFavouriteFoodsItem(0));
    }
}


