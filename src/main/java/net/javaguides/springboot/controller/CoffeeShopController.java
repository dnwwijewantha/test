package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/api/shops")

@Autowired


//Shop list
@GetMapping()
public List<CoppyShopWorkers>getAllShops(){
	return this.CoffeeShopRepository.findAll();
}

//update shop by id
@PutMapping("/{id}")
public ResponseEntity<Shop> updateShop(@PathVariable(value = "id") Long hotelId,
     @RequestBody Shop shopDetails) throws ResourceNotFoundException {
    Shop shop = shopRepository.findById(hotelId)
    .orElseThrow(() -> new ResourceNotFoundException("Shop not found for this id :: " + shopId));

    shop.setHotelName(shopDetails.getShopName());
    shop.setEmail(shopDetails.getEmail());
    shop.setLocation(shopDetails.getLocation());
    shop.setTel(shopDetails.getTel());
    final shop updatedShop = shopRepository.save(shop);
    return ResponseEntity.ok(updatedShop);
}

//get shop by id
@GetMapping("/{id}")
public ResponseEntity<Shop> getShopById(@PathVariable(value = "id") Long shopId)
        throws ResourceNotFoundException {
        Shop shop = shopRepository.findById(shopId)
          .orElseThrow(() -> new ResourceNotFoundException("Shop not found for this id :: " + shopId));
        return ResponseEntity.ok().body(shop);
}

//search by shop name
@GetMapping("/search/ByShopName")
public List<Shop> getShopsByShopName(@RequestParam String shopName){
	return shopRepository.findByShopNameStartsWith(shopName);
}
}
