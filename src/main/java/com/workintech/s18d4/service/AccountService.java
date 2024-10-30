package com.workintech.s18d4.service;

import com.workintech.s18d4.entity.Account;

import java.util.List;

public interface AccountService {
    Account save(Account account);
    Account find(Long id);
    List<Account> findAll();
    Account delete(Long id);
}
