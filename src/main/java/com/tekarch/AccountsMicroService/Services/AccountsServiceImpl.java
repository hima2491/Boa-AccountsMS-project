package com.tekarch.AccountsMicroService.Services;

import com.tekarch.AccountsMicroService.Repository.AccountsRepository;
import com.tekarch.AccountsMicroService.Services.Interface.AccountServiceInterface;
import com.tekarch.AccountsMicroService.models.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsServiceImpl implements AccountServiceInterface {

    @Autowired
    private AccountsRepository accountsRepository;

    @Override
    public List<Accounts> getAllAccounts() {
        return accountsRepository.findAll();
    }

    @Override
    public Accounts getAccountById(Long accountId) {
        return accountsRepository.findById(accountId).orElse(null);
    }

    @Override
    public Accounts addAccount(Accounts accounts) {
        return accountsRepository.save(accounts);
    }

    @Override
    public void deleteAccount(Long accountId) {
        accountsRepository.deleteById(accountId);
    }

    @Override
    public Accounts updateAccount(Accounts accounts) {
        return accountsRepository.save(accounts);
    }
}
