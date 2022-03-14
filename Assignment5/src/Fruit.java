import java.util.*;

import java.util.stream.*;  
class Fruit{
    String name;
    int calories;
    int price;
    String color;
    Fruit(String name,int calories,int price,String color){
        this.name=name;
        this.calories=calories;
        this.price=price;
        this.color=color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
        return this.getName()+" "+this.getCalories()+" "+this.getPrice()+" "+this.getColor();
    }
}

class News{
    int newsid;
    String postedByUser;
    String commentByUser;
    String comment;
    News(int newsid,String postedByUser,String commentByUser,String comment){
        this.newsid=newsid;
        this.postedByUser=postedByUser;
        this.commentByUser=commentByUser;
        this.comment=comment;
    }
    public int getNewsid() {
        return newsid;
    }
    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }
    public String getPostedByUser() {
        return postedByUser;
    }
    public void setPostedByUser(String postedByUser) {
        this.postedByUser = postedByUser;
    }
    public String getCommentByUser() {
        return commentByUser;
    }
    public void setCommentByUser(String commentByUser) {
        this.commentByUser = commentByUser;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    
}

class Trader{
    String name,city;
    Trader(String name,String city){
        this.name=name;
        this.city=city;
    }
    

    @Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }
}

class Transaction{
    int year,value;
    Trader trader;
    Transaction(Trader trader,int year,int value){
        // super();
        this.trader = trader;
        this.year=year;
        this.value=value;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public Trader getTrader() {
        return trader;
    }
    public void setTrader(Trader trader) {
        this.trader = trader;
    }
    @Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}

}

