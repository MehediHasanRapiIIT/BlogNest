package iit.mehedirafi.blogappications.services;

import iit.mehedirafi.blogappications.entities.Category;
import iit.mehedirafi.blogappications.entities.Post;
import iit.mehedirafi.blogappications.payloads.PostDto;
import iit.mehedirafi.blogappications.payloads.PostResponse;

import java.util.List;

public interface PostService {

    //create
    PostDto createPost(PostDto postDto, Long userId, Long categoryId);

    //update
    PostDto updatePost(PostDto postDto, Long id);
    void deletePost(Long id);

    PostResponse getAllPosts(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);

    PostDto getPostById(Long id);

    List<PostDto> getPostsByCategory(Long categoryId);

    List<PostDto> getPostsByUser(Long userId);

    List<PostDto> searchPosts(String keyword);
}
