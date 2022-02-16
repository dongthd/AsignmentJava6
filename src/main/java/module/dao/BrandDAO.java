package module.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import module.domain.Brand;

@Repository
public interface BrandDAO extends JpaRepository<Brand, Integer> {

}
