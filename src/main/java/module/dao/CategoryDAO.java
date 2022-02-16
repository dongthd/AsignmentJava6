package module.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import module.domain.Category;

@Repository
public interface CategoryDAO extends JpaRepository<Category, Integer> {

}
