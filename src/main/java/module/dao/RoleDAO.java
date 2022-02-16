package module.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import module.domain.Role;

@Repository
public interface RoleDAO extends JpaRepository<Role, String> {

}
