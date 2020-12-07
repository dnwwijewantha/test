package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CoffeeShopRepository extends JpaRepository<CoffeeShopRepository,Long> {
	CoffeeShopRepository findByShopNameAndLocation(String name,String location);
	List<CoffeeShopRepository> findByShopNameStartsWith(String shopName);
	
}
