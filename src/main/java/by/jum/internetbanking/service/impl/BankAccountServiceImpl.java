package by.jum.internetbanking.service.impl;

import by.jum.internetbanking.dao.BankAccountDAO;
import by.jum.internetbanking.entity.BankAccount;
import by.jum.internetbanking.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("accountService")
public class BankAccountServiceImpl implements BankAccountService {
    @Autowired
    private BankAccountDAO accountDAO;

    @Override
    @Transactional
    public void createAccount(BankAccount account) {
        accountDAO.save(account);
    }

    @Override
    @Transactional
    public void deleteAccount(BankAccount account) {
        accountDAO.delete(account);
    }

    @Override
    @Transactional(readOnly = true)
    public List<BankAccount> getAccountList() {
        return accountDAO.getList();
    }

    @Override
    @Transactional(readOnly = true)
    public BankAccount getAccountByID(long accountID) {
        return accountDAO.getByID(accountID);
    }


    @Override
    @Transactional
    public void deleteById(long id) {
        accountDAO.deleteByID(id);
    }

    @Override
    @Transactional
    public BankAccount getAccountByNumber(String number) {
        return accountDAO.getByNumber(number);
    }
}