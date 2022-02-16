package module.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import module.domain.CartItem;

@Repository
public interface CartItemDAO extends JpaRepository<CartItem, Integer> {

	@Query(value = "select * from cart_items where username = ?", nativeQuery = true)
	CartItem findByUsername(String username);

}
