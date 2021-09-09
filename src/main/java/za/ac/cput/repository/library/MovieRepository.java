/**
 * MovieRepository.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.repository.library;

import za.ac.cput.entity.generic.Category;
import za.ac.cput.entity.library.Movie;
import za.ac.cput.repository.generic.CategoryRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IRepository.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in IMovieRepository.java before attempting the tasks below.
 *
 * Tasks:
 *  > Implement repository using singleton and your chosen Java data structure.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the create method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the read method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the update method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the delete method.
 *  > Write an implementation of the getall method you declared in the interface.
 *
 */
public class MovieRepository implements IMovieRepository {

    private static MovieRepository movieRepository = null;
    private Set<Movie> movieDB = null;

    private MovieRepository(){
        movieDB = new HashSet<Movie>();
    }

    public static MovieRepository getMovieRepository(){
        if(movieRepository == null){
            movieRepository = new MovieRepository();
        }
        return movieRepository;

    }
    @Override
    public Movie create(Movie movie) {
        boolean success = movieDB.add(movie);
        if(!success)
            return null;
        return movie;
    }

    @Override
    public Movie read(String id) {

        //sequential method
        for (Movie movie  : movieDB)
            if (movie.getId().equals(id)){
                return movie;
            }
        return null;
    }

    @Override
    public Movie update(Movie movie ) {
        Movie movie1 = read(movie.getId());
        if (movie1 != null){
            movieDB.remove(movie1);
            movieDB.add(movie);
            return movie;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Movie movieToDelete = read(id);
        if (movieToDelete == null) {
            return false;
        }
        movieDB.remove(movieToDelete);
        return true;
    }
    @Override
    public Set<Movie> getAll() { return movieDB;}

    // missing method(s)
}
