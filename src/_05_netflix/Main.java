package _05_netflix;

public class Main {
public static void main(String[] args) {
	
	Movie movie = new Movie("Frozen", 5);
	Movie movie2 = new Movie("Black Panther", 9);
	Movie movie3 = new Movie("Jumanji", 10);
	Movie movie4 = new Movie("Captain Marvel", 13);
	Movie movie5 = new Movie("Avengers Endgame", 15);
	movie.getTicketPrice();
	NetflixQueue netflixqueue = new NetflixQueue();
	
	netflixqueue.addMovie(movie);
	netflixqueue.addMovie(movie2);
	netflixqueue.addMovie(movie3);
	netflixqueue.addMovie(movie4);
	netflixqueue.addMovie(movie5);
	
	System.out.println(movie);
	System.out.println(movie2);
	System.out.println(movie3);
	System.out.println(movie4);
	System.out.println(movie5);
	
	netflixqueue.sortMoviesByRating();
	System.out.println(netflixqueue.getMovie(1));	
	
	

	
	
	
	
}
}
