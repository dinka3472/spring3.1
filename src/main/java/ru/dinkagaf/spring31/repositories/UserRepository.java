package ru.dinkagaf.spring31.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dinkagaf.spring31.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
