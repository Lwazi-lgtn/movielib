/**
 * MovieFactory.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.factory.library;

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;
import za.ac.cput.entity.library.Movie;
import za.ac.cput.helper.GenericHelper;

import java.text.ParseException;

public class MovieFactory {
    /**
     * Instructions:
     *  > Do NOT modify the method signature.
     *  > generate a unique key for the id of the movie
     *  > year parameter must be 4 digits.
     *  > year parameter must not be older than 1900 and/or in the future.
     *  > title parameter must not be empty, null or "null".
     *
     * Tasks:
     *  > Replace the throw exception (line 28) with your attempt of the factory method.
     *
     * @param title
     * @param year
     * @return
     */
    public static Movie createMovie(String title, int year) { // DO NOT MODIFY THIS LINE.
        throw new UnsupportedOperationException();
    }{
        String year = null;
        String title = null;
        if (GenericHelper.isNullorEmpty(title) || GenericHelper.isNullorEmpty(year));
        /*    return new Builder().build();
        String id = GenericHelper.generateId();
        try {
            return new Builder().title(title).year(year).id(id).build();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // i dont understand the errors that i came across
         */
    }

    public static Movie createMovie(String rango) {
        return null;
    }

    private Movie.Builder Builder() {

        return null;
    }

    public class Builder {
        public ExsltDatetime title(String title) {
            return null;
        }
    }
}
