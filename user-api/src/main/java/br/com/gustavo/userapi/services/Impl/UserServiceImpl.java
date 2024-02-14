package br.com.gustavo.userapi.services.Impl;

import java.util.List;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import br.com.gustavo.userapi.domain.User;
import br.com.gustavo.userapi.repository.UserRepository;
import br.com.gustavo.userapi.services.UserService;
import br.com.gustavo.userapi.services.exceptions.ObjectNotFoundExcepetion;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private final UserRepository repository; // tirei o @Autowired pq o lombok injeta automaticamnte através do construtor @RequiredArgsConstructor
    private final Environment env;

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findById(Long id) {
        //return repository.findById(id).orElse(null); // Retorna um optional
        log.info("USER_SERVICE ::: Get Request on "+ env.getProperty("local.server.port") + "  port");
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundExcepetion("Object Not Found")); 
    }
    
}
