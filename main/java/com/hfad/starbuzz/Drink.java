package com.hfad.starbuzz;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;
    public static final Drink[] drinks = {
            new Drink("Латте", "Пара порций эспрессо смешаных с горячим молоком", R.drawable.latte),
            new Drink("Капучино", "Эспрессо, горячее молоко и молочная пенка", R.drawable.cappuccino),
            new Drink("Фильтр-кофе", "Обжаренные и свежесваренные кофейные зерна высшего сорта", R.drawable.filter)
    };
    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public String toString() {
        return this.name;
    }
}
