package com.ironhack.opponentselectionservice.proxy;

import com.ironhack.opponentselectionservice.dto.RegisterUserDTO;
import com.ironhack.opponentselectionservice.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "user-model-service")
@RequestMapping("/api/v1/users")
public interface UserModelProxy {

    @GetMapping("/username/{username}")
    ResponseEntity<UserDTO> getUserByUsername(@PathVariable String username);

    @GetMapping("/partyLevel")
    List<String> getAllUsersUsernamesByPartyLevelBetween(
            @RequestParam(required = false) Integer min,
            @RequestParam(required = false) Integer max
    );

    @PostMapping("/register")
    UserDTO registerUser(@RequestBody RegisterUserDTO registerUserDTO);

    @PutMapping("/update/{username}")
    UserDTO updateUser(@PathVariable String username, @RequestBody UserDTO user);


}