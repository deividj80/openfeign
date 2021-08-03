package com.deivid.openfeign.resource;

import com.deivid.openfeign.dto.UserResponseDTO;
import com.deivid.openfeign.dto.mapper.UserMapper;
import com.deivid.openfeign.entity.User;
import com.deivid.openfeign.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserResource {

    private UserService userService;

    @GetMapping
    public List<UserResponseDTO> getUsersWithConvidInfo() {
        return this.userService.findAllWithCovidInfo();
    }

    @GetMapping("/{id}/covid")
    public UserResponseDTO getUserWithConvidInfo(@PathVariable String id) {
        return this.userService.findByIdWithCovidInfo(id);
    }

    @PostMapping
    public UserResponseDTO create(@RequestBody User user){
        return UserMapper.toDTO(this.userService.create(user));
    }
}
