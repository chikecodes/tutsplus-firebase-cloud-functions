package com.chikeandroid.tutsplusalerts;

/**
 * Created by Chike on 3/30/2017.
 */

public class Article {

    public String title;
    public String author;

    public Article() {
        // Default constructor required for calls to DataSnapshot.getValue(Article.class)
    }

    public Article(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
