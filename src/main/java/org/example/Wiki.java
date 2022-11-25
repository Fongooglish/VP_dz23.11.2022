package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wiki {
    public static void wikiParser() {
        try {
            Document document = Jsoup.connect("https://ru.wikipedia.org/").get();
            Elements elements = document.select("div");
            String str = elements.toString().replaceAll("[^а-я||А-Я,^\\s]", " ").trim().replaceAll(" +", " ");
            str = str.replaceAll("(?m)^\\\\s*\\\\r?\\\\n|\\\\r?\\\\n\\\\s*(?!.*\\\\r?\\\\n)","");
            System.out.println(str);
        } catch (
                IOException e) {
            e.getMessage();
        }
    }
}
