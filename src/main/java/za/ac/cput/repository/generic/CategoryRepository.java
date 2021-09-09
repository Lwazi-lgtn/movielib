/**
 * CategoryRepository.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.repository.generic;

import za.ac.cput.entity.generic.Category;

import java.util.HashSet;
import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IRepository.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in ICategoryRepository.java before attempting the tasks below.
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
public class CategoryRepository implements ICategoryRepository {

    private static CategoryRepository categoryRepository = null;
    private Set<Category> categoryDB = null;

    private CategoryRepository(){
        categoryDB = new HashSet<Category>();
    }

    public static CategoryRepository getCategoryRepository(){
        if(categoryRepository == null){
            categoryRepository = new CategoryRepository();
        }
        return categoryRepository;
    }

    @Override
    public Category create(Category category) {
        boolean success = categoryDB.add(category);
        if(!success)
            return null;
        return category;
    }

    @Override
    public Category read(String genre) {

        //lamba expression
        Category category= categoryDB.stream()
                .filter(r -> r.getGenre().equals(genre))
                .findAny()
                .orElse(null);
        return category;
    }

    @Override
    public Category update(Category category ) {
        Category category1 = read(category.getGenre());
        if (category1 != null){
            categoryDB.remove(category1);
            categoryDB.add(category);
            return category;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Category categoryToDelete = read(id);
        if (categoryToDelete == null) {
            return false;
        }
        categoryDB.remove(categoryToDelete);
        return true;
    }
    @Override
    public Set<Category> getAll() { return categoryDB;}


    // missing method(s)
}