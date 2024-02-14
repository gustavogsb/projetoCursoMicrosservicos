package br.com.gustavo.userapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.gustavo.userapi.domain.User;
import br.com.gustavo.userapi.repository.UserRepository;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.saveAll(List.of(
			new User(null, "Valdir teste", "valdir@teste.com.br", "123", 12.0),
			new User(null, "Carlos teste também", "carlos@testetambem.com.br", "321", 20.0)
		));
		
	}

}
