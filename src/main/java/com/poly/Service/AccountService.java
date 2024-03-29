package com.poly.Service;

import com.poly.Entity.Account;
import com.poly.Repository.AccountRepository;

public class AccountService {

	private AccountRepository accountRepository = new AccountRepository();
	
	public Account register(Account account) throws Exception {
		
		if(accountRepository.findAccountByEmail(account.getEmail()) != null) {
			throw new Exception("Account already exists.");
		}
		accountRepository.addAccount(account);
        return account;
	}
	
	public Account login(String email, String password) throws Exception {
		Account account = accountRepository.findByEmailAndPassword(email, password);
        if(account == null) {
            throw new Exception("Invalid credentials.");
        }
        return account;
	}

	
}
