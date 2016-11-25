package ua.romakievua.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.romakievua.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
