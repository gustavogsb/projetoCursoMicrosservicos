package br.com.gustavo.userapi.repository;

import org.springframework.stereotype.Repository;

import br.com.gustavo.userapi.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
