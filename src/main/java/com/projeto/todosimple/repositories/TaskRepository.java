package com.projeto.todosimple.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projeto.todosimple.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

    List<Task> findByUserId(Long id);

    /*@Query(value = "select t from Task t where t.user.id = :id")
    List<Task> findByUserId(@Param("id") Long id);*/

    /*@Query(value = "select * from task t where t.user_id = :id", nativeQuery = true)
    List<Task> findByUserId(@Param("id") Long id);*/

}