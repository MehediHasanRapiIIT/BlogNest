package iit.mehedirafi.blogappications.controllers;


import iit.mehedirafi.blogappications.payloads.ApiResponse;
import iit.mehedirafi.blogappications.payloads.CategoryDto;
import iit.mehedirafi.blogappications.services.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    //create
    @PostMapping("/")
    public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CategoryDto categoryDto) {

        CategoryDto createdCategory = this.categoryService.createCategory(categoryDto);
        return new ResponseEntity<>(createdCategory, HttpStatus.CREATED);
    }

    //update

    @PutMapping("/{id}")
    public ResponseEntity<CategoryDto> updateCategory(@Valid @RequestBody CategoryDto categoryDto, @PathVariable long id) {

        CategoryDto updatedCategory = this.categoryService.updateCategory(categoryDto,id);
        return new ResponseEntity<>(updatedCategory, HttpStatus.OK);
    }
    //delete

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deleteCategory(@PathVariable long id) {
        this.categoryService.deleteCategory(id);

        return new ResponseEntity<ApiResponse>(new ApiResponse("User Deleted successfully",true), HttpStatus.NO_CONTENT);
    }
    //getOne
    @GetMapping("/{id}")
    public ResponseEntity<CategoryDto> getCategoryById(@PathVariable long id) {
        CategoryDto catDto = this.categoryService.getCategory(id);

        return new ResponseEntity<CategoryDto>(catDto, HttpStatus.OK);
    }

    //getALL
    @GetMapping("/")
    public ResponseEntity<List<CategoryDto>> getAllCategories() {
        List<CategoryDto> catDtos = this.categoryService.getAllCategories();
        return new ResponseEntity<List<CategoryDto>>(catDtos, HttpStatus.OK);

    }
}
