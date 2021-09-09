/**
 * MovieCategoryRepository.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.repository.library;

import za.ac.cput.entity.library.MovieCategory;
import za.ac.cput.repository.library.MovieCategoryRepository;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Instructions
 *  > Make sure you have read the instructions on IRepository.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in IMovieCategoryRepository.java before attempting the tasks below.
 *  > Note that no Update operation is needed here.
 *
 * Tasks:
 *  > Implement repository using singleton and your chosen Java data structure.
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

public class MovieCategoryRepository implements IMovieCategoryRepository {

    private Set<MovieCategory> movieCategories;
    private static MovieCategoryRepository repository = null;

    private MovieCategoryRepository() { this.movieCategories = new HashSet<>(); }

    public static MovieCategoryRepository getRepository() {
        if (repository ==null) repository = new MovieCategoryRepository();
        return repository;
    }


    @Override
    public MovieCategory create(MovieCategory movieCategory ) {
        this.movieCategories.add(movieCategory);
        return movieCategory;
    }

    @Override
    public MovieCategory read(String movieId, String categoryId) {
        return this.movieCategories.stream()
                .filter(movieCategory -> movieCategory.getCategoryId().trim().equalsIgnoreCase(categoryId.trim()))
                .filter(movieCategory -> movieCategory.getMovieId().trim().equalsIgnoreCase(movieId.trim()))
                .findAny().orElse(null);
    }

    @Override
    public boolean delete(String movieId, String categoryId) {
        MovieCategory movieCategory = read(movieId, categoryId);
        if (movieCategory != null) this.movieCategories.remove(movieCategory);
        return false;
    }

    @Override
    public Set<MovieCategory> getall() { return this.movieCategories; }

   /* @Override
    public Set<MovieCategory> getAllMovieCategory(String movieId) {
        return this.movieCategories.stream()
                .filter(movieCategory -> movieCategory.getMovieId().trim().equalsIgnoreCase(movieId.trim()))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<MovieCategory> getAllMovieCategory(String categoryId) {
        return this.movieCategories.stream()
                .filter(movieCategory -> movieCategory.getCategoryId().trim().equalsIgnoreCase(categoryId.trim()))
                .collect(Collectors.toSet());
    }
*/
    @Override
    public boolean deleteForMovie(String movieId) {
        Set<MovieCategory> movieCategories = getall();
        if (!movieCategories.isEmpty()) this.movieCategories.removeAll(movieCategories);
        return false;
    }
}