package com.projeto.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.todosimple.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
