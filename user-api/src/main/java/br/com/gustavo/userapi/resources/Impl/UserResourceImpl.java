package br.com.gustavo.userapi.resources.Impl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gustavo.userapi.domain.User;
import br.com.gustavo.userapi.resources.UserResource;
import br.com.gustavo.userapi.services.UserService;
import lombok.RequiredArgsConstructor;
 
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/users")
public class UserResourceImpl implements UserResource{

    private final UserService service;

    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @Override
    public ResponseEntity<User> findById(Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }


    
}
