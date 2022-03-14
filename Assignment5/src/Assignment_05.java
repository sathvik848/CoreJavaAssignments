import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * assignment5
 */
public class Assignment_05 {
    public static void main(String[] args) {
        System.out.println("*********Question1********");
        List<Fruit> fruitlist = new ArrayList<>();
        fruitlist.add(new Fruit("Apple", 150, 100, "Red"));
        fruitlist.add(new Fruit("Orange", 50, 50, "Orange"));
        fruitlist.add(new Fruit("Banana", 120, 20, "Yellow"));
        fruitlist.add(new Fruit("Grapes", 20, 100, "green"));
        fruitlist.stream()
                    .filter(c ->c.calories<100)
                    .map(c-> c.calories)
                    .sorted(Comparator.reverseOrder())
                    .forEach(System.out::println);
        
        System.out.println("*********Question2********");
        Map<Object, List<Fruit>> colorFruit = fruitlist.stream()
                .sorted(Comparator.comparing(Fruit::getColor))
                .collect(Collectors.groupingBy(Fruit::getColor));
        System.out.println(colorFruit);

        System.out.println("*********Question3********");
        fruitlist.stream().filter(c->c.color.equals("Red")).map(c->c.toString()).forEach(System.out::println);

        System.out.println("*********Question4********");
        List<News> newslist = new ArrayList<>();
        newslist.add(new News(101, "a", "a", "aa"));
        newslist.add(new News(101,"a","a","aa"));
        newslist.add(new News(102,"b","b","bb"));
        newslist.add(new News(103,"c","c","cc"));
        newslist.add(new News(104,"d","d","dd"));

        System.out.println(newslist.stream().collect(Collectors.groupingBy((News n)->n.getNewsid(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());

        System.out.println("*********Question5********");
        System.out.println(newslist.stream().filter((News n)->n.getComment().contains("budgets")).count());;

        System.out.println("*********Question6********");
        Integer newsId = newslist.stream().collect(Collectors.groupingBy((News n)->n.getNewsid(),Collectors.counting()))
                                          .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey(); 
        System.out.println(newsId);

        System.out.println("*********Question7********");
        Map<String,Long> commentbyuser = newslist.stream().collect(Collectors.groupingBy((News n)-> n.getCommentByUser(),Collectors.counting()));
        System.out.println(commentbyuser);

        System.out.println("*********Question8********");
        List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(new Transaction(new Trader("a", "a"), 2011, 10000));
		transactions.add(new Transaction(new Trader("b", "Delhi"), 2012, 50000));
		transactions.add(new Transaction(new Trader("Kunal", "Delhi"), 2013, 25000));
		transactions.add(new Transaction(new Trader("d", "Pune"), 2014, 5000));
		transactions.add(new Transaction(new Trader("c", "Pune"), 2015, 75000));
		transactions.add(new Transaction(new Trader("f", "Indore"), 2016, 100000));

        transactions.stream().filter((Transaction t)->t.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("*********Question9********");
        System.out.println(transactions.stream().map((Transaction t)->t.getTrader()).map((Trader T)->T.city).distinct().collect(Collectors.toList()));

        System.out.println("*********Question10********");
        System.out.println(transactions.stream().filter((Transaction t)->t.trader.city.equals("Pune"))
                                                    .map((Transaction t)->t.getTrader()).sorted(Comparator.comparing(Trader::getName))
                                                    .collect(Collectors.toList()));

        System.out.println("*********Question11********");
        System.out.println(transactions.stream().map((Transaction t)->t.getTrader())
                                                .map((Trader T)->T.name)
                                                .collect(Collectors.toList()));

        System.out.println("*********Question12********");
        System.out.println(transactions.stream().filter((Transaction t)->t.getTrader().getCity().equals("Indore")).findAny());

        System.out.println("*********Question13********");
        System.out.println(transactions.stream().filter((Transaction t)->t.getTrader().getCity().equals("Delhi"))
                                                .collect(Collectors.toList()));

                    
        System.out.println("*********Question14********");
        System.out.println(transactions.stream().collect(Collectors.groupingBy(value->value.getValue(),Collectors.counting()))
                                                .entrySet()
                                                .stream()
                                                .min(Map.Entry.comparingByKey()).get().getKey());

        
    }
}