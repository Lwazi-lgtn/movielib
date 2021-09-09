/**
 * MovieService.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.service.library;

import za.ac.cput.entity.library.Movie;
import za.ac.cput.repository.library.MovieRepository;

import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IService.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in IMovieService.java before attempting the tasks below.
 *
 * Tasks:
 *  > Implement service using singleton with a link to your repository.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the create method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the read method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the update method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the delete method.
 *  > Write an implementation of the getall method you declared in the interface.
 *
 */

//@Service -- remember to uncomment this when you are done with your Controllers
public class MovieService implements IMovieService {
    private MovieRepository repository;
    private static MovieService service = null;

    private static MovieService getService() {
        if (service == null) service = new MovieService();
        return service;
    /*    @Override
        public Movie create (Movie Movie movie;
        movie){
            return this.repository.create(movie);
        }

        @Override
        public Movie read (String id){
            return this.repository.read(id, title);
        }

        @Override
        public Movie update (Movie movie){
            return this.repository.update(movie)
        }

        @Override
        public boolean delete (String id){
            return this.repository.delete(idd)
        }
        @Override
        public Set<Movie> getAll() {
            return this.repository.getAll();
        }
*/
        // missing method(s)
    }

    public static MovieService getMovieService() {
        return null;
    }

    @Override
    public Movie create(Movie movie) {
        return null;
    }

    @Override
    public Movie read(String s) {
        return null;
    }

    @Override
    public Movie update(Movie movie) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public Set<Movie> getAll() {
        return null;
    }
}