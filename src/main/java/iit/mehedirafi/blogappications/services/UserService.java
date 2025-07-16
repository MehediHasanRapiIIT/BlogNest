package iit.mehedirafi.blogappications.services;

import iit.mehedirafi.blogappications.payloads.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);
    UserDto updateUser(UserDto user, Long userId);

    UserDto getUserById(Long userId);
    List<UserDto> getAllUsers();

    void deleteUser(Long userId);
}
