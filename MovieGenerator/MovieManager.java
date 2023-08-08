package com.techlabs.MovieGenerator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import com.techlabs.MovieGenerator.Movie;

public class MovieManager {
				private List<Movie> movies;
				
				private final static String filepath="A:\\Monocept notes/names.txt";
				
				public MovieManager() throws IOException, ClassNotFoundException {
					movies=new ArrayList<Movie>();
					loadMovies();
				}
				
				public void addMovies(Movie movie) throws IOException {
					  movies.add(movie);
					  saveMovie();
				}
				
				
				public void loadMovies() throws IOException, ClassNotFoundException {
					FileInputStream fileIn=new FileInputStream(filepath);
					
					ObjectInputStream objectInputStream=new ObjectInputStream(fileIn);
					
					movies=(List<Movie>) objectInputStream.readObject();
					fileIn.close();
					objectInputStream.close();
					
				}
				public void ClearMovies() throws FileNotFoundException {
					movies.clear();
					saveMovie();
					System.out.println("Movies deleted");
				}
				
				
				public List<Movie> getMovie() {
					return movies;
				}
				
				public void saveMovie() {
					try {
						FileOutputStream fout=new FileOutputStream(filepath);    
						  ObjectOutputStream out=new ObjectOutputStream(fout);    
						  for(Movie movie:movies) {
							  out.writeObject(movie);
						  }
					} catch (Exception e) {
						System.out.println("Problem is occured");
					}
				}
}
