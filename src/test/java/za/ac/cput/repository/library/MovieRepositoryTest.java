/**
 * MovieRepositoryTest.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.repository.library;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.library.Movie;
import za.ac.cput.factory.library.MovieFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Instructions:
 *  > Make sure you have completed the task(s) in MovieRepository.java before attempting tasks below.
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
class MovieRepositoryTest {
        private static MovieRepository repository = MovieRepository.getMovieRepository();
        private static Movie movie = MovieFactory.createMovie("Rango");
    @Test
    void a_create() {
        Movie created = repository.create(movie);
        assertEquals(created.getId(), movie.getId());
        System.out.println("Create: "+ created);
    }

    @Test
    void b_read() {
        Movie read = repository.read((String) movie.getId());
        assertNotEquals(read);
        System.out.println("read: "+ read);

    }

    private void assertNotEquals(Movie read) {
    }

    @Test
    void c_update() {
        Movie updated = new Movie.Builder().copy(movie).setTitle("Rango").build();
        assertNotEquals(repository.update(updated));
        System.out.println("Update: "+ updated);
    }

    @Test
    void d_delete() {
        boolean success = repository.delete((String) movie.getId());
        assertTrue(success);
        System.out.println("delete: "+success);
    }

    @Test
    void e_getAll() {
        System.out.println("Show All");
        System.out.println(repository.getAll());
    }

    // missing test(s)
}