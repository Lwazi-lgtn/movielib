/**
 * MovieServiceTest.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.service.library;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.library.Movie;
import za.ac.cput.factory.library.MovieFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Instructions:
 *  > Make sure you have completed the task(s) in MovieService.java before attempting tasks below.
 *  > Use JUNIT testing framework ONLY.
 *  > Use appropriate assert method(s).
 *
 * Tasks:
 *  > Replace the throw exception with test case for the create method.
 *  > Replace the throw exception with test case for the read method.
 *  > Replace the throw exception with test case for the update method.
 *  > Replace the throw exception with test case for the delete method.
 *  > Write a test case for the getall method.
 *  > Ensure your tests run in a right order (Hint: method name ascending).
 *
 */
class MovieServiceTest {
    private static MovieService service = MovieService.getMovieService();
    private static final Movie movie = MovieFactory.createMovie("Rango");

    @Test
    void a_create() {
        Movie created = service.create(movie);
        // assertNotNull(created);
        assertEquals(created.getId(),movie.getId());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        Movie creted = service.create(movie);
        assertEquals(creted.getId(),movie.getId());
        System.out.println("Create: " + creted);
    }

    @Test
    void update() {
        Movie updated = new Movie.Builder().copy(movie).setTitle("Rango").build();
        assertNotNull(service.update(updated));
        System.out.println("Update: " + updated);
    }

    @Test
    void delete() {
        boolean success = service.delete((String) movie.getId());
        assertTrue(success);
        System.out.println("Delete: "+ success);
    }

    @Test
    void getAll() {
        System.out.println("Show All: ");
        System.out.println(service.getAll());
    }
    // missing test(s)
}