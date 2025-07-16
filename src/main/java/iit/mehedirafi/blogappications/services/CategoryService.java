package iit.mehedirafi.blogappications.services;


import iit.mehedirafi.blogappications.payloads.CategoryDto;

import java.util.List;

public interface CategoryService {

    CategoryDto createCategory(CategoryDto categoryDto);

    CategoryDto updateCategory(CategoryDto categoryDto, Long categoryId);

    void deleteCategory(Long categoryId);

    CategoryDto getCategory(Long categoryId);

    List<CategoryDto> getAllCategories();
}
