package com.tatianadzn.wishlist;

import java.util.Vector;

public class WishList {
    private Vector<WishNode> wishList = new Vector<>();

    public void addWish(String description, String link){
        wishList.add(new WishNode(description, link));
    }

    private static class WishNode{
        private String description;
        private String link;

        private WishNode(String description, String longLink){
            this.description = description;
            this.link = LinkShortenerByAPI.Shorten(longLink);
        }
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("My Wish List: \n\n");
        for (WishNode wn : wishList){
            result.append(wn.description)
                    .append("\n")
                    .append(wn.link)
                    .append("\n\n\n");
        }
        return result.toString();
    }
}
