package module.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import module.domain.AccountRoles;

@Repository
public interface AccountRoleDAO extends JpaRepository<AccountRoles, Integer> {

	@Query(value = "select * from account_roles where username = ?", nativeQuery = true)
	List<AccountRoles> findByAccount(String username);

}
