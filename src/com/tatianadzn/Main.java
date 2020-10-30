package com.tatianadzn;

import com.tatianadzn.wishlist.LinkShortenerByAPI;

public class Main {

    public static void main(String[] args) {
        String longUrl = "https://github.com/tatianadzn" +
                "/currencyConverter/blob/master/src/com" +
                "/tatianadzn/CurrencyConverter/CurrencyAPIHandler.java";
        String shortUrl = LinkShortenerByAPI.Shorten(longUrl);
        System.out.println(shortUrl);
    }
}
