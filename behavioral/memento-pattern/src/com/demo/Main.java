package com.demo;

public class Main {
    public static void main(String[] args) {
        Article article=new Article(1,"My Article");
        article.setContent("ABC");
       // System.out.println(article);



        ArticleMemento articleMemento1=article.createMemento(); //first commit:

        article.setContent("123");
        //System.out.println(article);



        article.setContent("BBC");
        article.restore(articleMemento1);
        System.out.println(article);
    }
}
