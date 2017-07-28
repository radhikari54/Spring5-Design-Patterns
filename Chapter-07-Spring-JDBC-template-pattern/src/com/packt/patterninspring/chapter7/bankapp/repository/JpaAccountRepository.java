package com.packt.patterninspring.chapter7.bankapp.repository;

import java.io.Writer;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.patterninspring.chapter7.bankapp.model.Account;

@Repository
//@Primary
//@Order(2)
public class JpaAccountRepository implements AccountRepository {

	@Override
	public Account findAccountById(Long id) {
		return new Account(id);
	}

	@Override
	public void generateReport(Writer out, String city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Account> extractAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

}
