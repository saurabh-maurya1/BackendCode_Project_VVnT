package com.project.vvnt.site.services;

import com.project.vvnt.site.dtos.PageableResponse;
import com.project.vvnt.site.dtos.UserDto;
import com.project.vvnt.site.entities.User;

import java.util.Optional;

public interface UserService {

    //create
    UserDto createUser(UserDto userDto);


    //update
    UserDto updateUser(UserDto userDto, String userId);

    //delete
    void deleteUser(String userId);


    //get all users
    PageableResponse<UserDto> getAllUser(int pageNumber, int pageSize, String sortBy, String sortDir);



    //get single user by id
    UserDto getUserById(String userId);

    //get  single user by email
    UserDto getUserByEmail(String email);

    //search user
    PageableResponse<UserDto> searchUser(String keyword,int pageNumber,int pageSize, String sortBy,String sortDir);

    //other user specific features

    Optional<User> findUserByEmailOptional(String email);

}
