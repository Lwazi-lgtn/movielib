/**
 * CategoryService.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.service.generic;

import za.ac.cput.entity.generic.Category;
import za.ac.cput.repository.generic.CategoryRepository;

import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IService.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in ICategoryService.java before attempting the tasks below.
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

public class CategoryService implements ICategoryService {
    private static CategoryService categoryServiceService = null;
    private CategoryRepository categoryRepository;

    private CategoryService(){
        this.categoryRepository= CategoryRepository.getCategoryRepository();
    }

    @Override
    public Category create(Category category) {
        return this.categoryRepository.create(category);
    }

    @Override
    public Category read(String id) {
        return this.categoryRepository.read(id);
    }

    @Override
    public Category update(Category category) {
        return this.categoryRepository.update(category);
    }

    @Override
    public boolean delete(String id) {
        return this.categoryRepository.delete(id);
    }


    @Override
    public Set<Category> getall() {
        return this.categoryRepository.getAll();
    }

    @Override
    public Set<Category> getAll() {
        return this.categoryRepository.getAll();
    }


    // missing method(s)
}