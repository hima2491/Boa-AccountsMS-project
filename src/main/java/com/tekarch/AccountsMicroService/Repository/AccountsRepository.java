package com.tekarch.AccountsMicroService.Repository;

import com.tekarch.AccountsMicroService.models.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

}
