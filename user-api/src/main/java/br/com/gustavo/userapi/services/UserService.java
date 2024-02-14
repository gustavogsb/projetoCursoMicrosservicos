package br.com.gustavo.userapi.services;

import java.util.List;

import br.com.gustavo.userapi.domain.User;

public interface UserService {
    User findById(Long id);
    List<User> findAll();

}
