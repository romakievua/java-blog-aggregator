package ua.romakievua.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.romakievua.jba.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
