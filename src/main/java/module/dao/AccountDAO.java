package module.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import module.domain.Account;

@Repository
public interface AccountDAO extends JpaRepository<Account, String> {

}
