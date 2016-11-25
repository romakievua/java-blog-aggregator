package ua.romakievua.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.romakievua.jba.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
