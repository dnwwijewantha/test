package net.javaguides.springboot.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CoffeeShopUser extends JpaRepository<CoffeeShopUser,Long> {
	
	List<CoffeeShopUser> findByShopLocationStartsWith(String location);

	List<CoffeeShopUser> findByStartDateBeforeAndEndDateAfter(Date checkIn,Date checkOut);
	
	List<CoffeeShopUser> findByStartDateBeforeAndEndDateAfterAndShopLocationStartsWith(Date checkIn,Date checkOut,String location);
	
	List<CoffeeShopUser> findByHotelShopNameStartsWith(String shopName);

}
