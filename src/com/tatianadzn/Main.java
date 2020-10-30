package com.tatianadzn;

import com.tatianadzn.wishlist.WishList;

public class Main {

    public static void main(String[] args) {
        WishList wl = new WishList();
        wl.addWish("Silver dress",
                "https://www.2moodstore.com/product/" +
                        "kombinatsiya-midi-rozovogo-tsveta?gclid=" +
                        "CjwKCAjw8-78BRA0EiwAFUw8LN89iTIaZ8yL3oMHSgmhd" +
                        "4Kluzp6F2ZSTds9-BdW2PCtCm24EyG4pBoC0GwQAvD_BwE");
        wl.addWish("Pink dress with blablablabla",
                    "https://www.bonprix.ru/produkty/" +
                            "plate-vintazhnyj-rozovyj-971495/?" +
                            "size=217129223&promo=%20Abendkleider&" +
                            "typ=PLA&anbieter=GoogleShoppingc&" +
                            "aktion=Shopping_GSE&version=&" +
                            "matchkey=80601460511_97149595%2332&" +
                            "gclid=CjwKCAjw8-78BRA0EiwAFUw8LBuEc6U9" +
                            "0iWgUtlJCJhFfluCxsyqgEzPPyD3BsbgfTP1Ui-HCNh" +
                            "rjBoCeFIQAvD_BwE");
        System.out.println(wl);
    }
}
