package mb.equipme_item_service.services;

import mb.equipme_item_service.domain.Category;
import mb.equipme_item_service.repositories.CategoryRepository;
import javax.transaction.Transactional;
import java.util.*;

public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> findAll() {
        List<Category> categories = new ArrayList<>();
        categoryRepository.findAll().forEach(categories::add);
        return categories;
    }

    @Override
    public Category findById(UUID categoryUUID) {
        return categoryRepository.findById(categoryUUID).orElse(null);
    }

    @Transactional
    @Override
    public Category save(Category newCategory) {
        return categoryRepository.save(newCategory);
    }

    @Transactional
    @Override
    public void delete(Category toDeleteCategory) {
        categoryRepository.delete(toDeleteCategory);
    }

    @Transactional
    @Override
    public void deleteById(UUID categoryUUID) {
        categoryRepository.deleteById(categoryUUID);
    }
}
