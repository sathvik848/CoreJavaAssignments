public class Collection10 {

    public static void main(String[] args) {
        Movie_DetailsList movie = new Movie_DetailsList();
        movie.add_movie("b", "b", "b", "x");
        movie.add_movie("a", "a", "a", "y");
        // movie.size();
        movie.sort("genre");
    }
}
