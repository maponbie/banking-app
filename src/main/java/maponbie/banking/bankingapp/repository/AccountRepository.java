package maponbie.banking.bankingapp.repository;

import maponbie.banking.bankingapp.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository <Account, Long> {


}
