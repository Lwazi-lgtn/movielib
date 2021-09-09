/**
 * MovieCategoryService.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.service.library;

import za.ac.cput.entity.library.MovieCategory;
import za.ac.cput.repository.library.MovieCategoryRepository;

import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IService.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in IMovieCategoryService.java before attempting the tasks below.
 *  > Note that no Update operation is needed here.
 *
 * Tasks:
 *  > Implement service using singleton with a link to your repository.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the create method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the read method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the delete method.
 *  > Write an implementation of the getall method you declared in the interface.
 *  > Write an implementation of the method you declared in the interface that returns all
 *      moviecategory entities given movieid.
 *  > Write an implementation of the method you declared in the interface that returns all
 *      moviecategory entities given categoryid.
 *
 */
public class MovieCategoryService implements IMovieCategoryService {
    private MovieCategoryRepository repository;
    private static MovieCategoryService service = null;

    private static MovieCategoryService getService() {
        if (service == null) service = new MovieCategoryService();
        return service;
   /*     @Override
        public MovieCategory create(MovieCategory movie) {
            return this.repository.create(movie);
        }

        @Override
        public MovieCategory read(String movieId, String categoryId) {
            return this.repository.read(movieId, categotyId);
        }

        @Override
        public void delete(String movieId, String categoryId) {
            this.repository.delete(movieId, categoryId);
        }

        @Override
        public Set<MovieCategory> getall() { return this.repository.getall(); }

        @Override
        public Set<MovieCategory> movieCategory(String movieId) {
            return this.repository.movieCategory(movieId);
        }

        @Override
        public Set<MovieCategory> movieCategory(String categoryId) {
            return this.repository.movieCategory(categorymovieId);
        }

        @Override
        public void delete(String movieId) {
            this.repository.deleteForBook(movieId);
        }*/
    }

    @Override
    public MovieCategory create(MovieCategory movieCategory) {
        return null;
    }

    @Override
    public MovieCategory read(String movieId, String categoryId) {
        return null;
    }

    @Override
    public boolean delete(String movieId, String categoryId) {
        return false;
    }

    @Override
    public Set<MovieCategory> getAll() {
        return null;
    }

    @Override
    public Set<MovieCategory> movieCategory(String movieId) {
        return null;
    }

    @Override
    public Set<MovieCategory> gmoviecategory(String categoryId) {
        return null;
    }

    @Override
    public boolean delete(String movieId) {
        return false;
    }
}
