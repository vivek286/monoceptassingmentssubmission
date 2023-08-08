package com.techlabs.MovieGenerator;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MovieController {
				MovieManager movieManager;

				public MovieController() {
					super();
					this.movieManager = movieManager;
				}
				
				public void start() throws IOException {
					displayMenuMethod();
				}
				
			private void displayMenuMethod() throws IOException {
					
					int choice;
					boolean flag=true;
				do {
					Scanner scanner=new Scanner(System.in);
					System.out.println("Movie Store Menu\n"
							+ "1. Add Movie\n"
							+ "2. Clear All movie\n"
							+ "3. Display Movie\n"
							+ "4. Exit");
					System.out.println("Enter your choice");
					choice=scanner.nextInt();
					
					switch (choice) {
					case 1:
						Movie movie=setMovie();
						movieManager.addMovies(movie);
						break;
					case 2:
						movieManager.ClearMovies();
						break;
					case 3:
						List<Movie> movies=movieManager.getMovie();
						if(movies.isEmpty()) System.out.println("No movies in list");
						if(!movies.isEmpty()) {
							for(Movie movie2:movies) {
								System.out.println(movie2);
							}
						}
						break;
					default:
						System.exit(0);
					}
					scanner.close();
				}
				while(flag);
			}
			
			private Movie setMovie() {
				Scanner scanner=new Scanner(System.in);
				
				System.out.println("Enter movie detail");
				System.out.println("Enter movie id");
				int id=scanner.nextInt();
				
				System.out.println("Enter movie name");
				String moviename=scanner.next();
				
				System.out.println("Enter year");
				int year=scanner.nextInt();
				
				System.out.println("Enter genere");
				String genere=scanner.next();
				scanner.close();
				Movie movie=new Movie(id, moviename, year, genere);
				return movie;
			}
			
			
			

}
