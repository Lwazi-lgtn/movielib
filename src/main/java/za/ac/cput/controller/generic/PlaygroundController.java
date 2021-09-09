/**
 * PlaygroundController.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

/**
 * Instructions:
 *  > Make sure you have completed all tasks in the service package.
 *  > Do not modify class signature.
 *  > Complete the code in this class to expose your functionality below using a REST api
 *  > Add the annotations as required in your program
 */
package za.ac.cput.controller.generic;

import java.util.HashSet;
import java.util.Set;

public class PlaygroundController {
    /**
     * Tasks:
     *  > Replace the throw exception with an implementation that returns titles of all movies
     *      for a particular genre.
     *
     * @param genre
     * @return
     */

    public Set<PlaygroundController> getMovieTitlesByGenre(String genre) {
        Set<PlaygroundController> allMovies = new HashSet<PlaygroundController>();    //grant access to it in RaceController
        Set<PlaygroundController>  play = getAll();
        for (PlaygroundController playgroundController  : play){
            if(play.add((PlaygroundController) getMovieTitlesByGenre(genre)));{
                allMovies.add(playgroundController);
            }
        }
        return allMovies;
    }

    private Set<PlaygroundController> getAll() {
        return null;
    }

    /**
     * Tasks:
     *  > Replace the throw exception with an implementation that returns the title of all movies
     *      of a given category in a given year.
     *
     * @param categoryId
     * @param year
     * @return
     */
    public Set<String> getMovieTitlesByCategoryforYear(String categoryId, int year) {
        throw new UnsupportedOperationException();
    }
}
