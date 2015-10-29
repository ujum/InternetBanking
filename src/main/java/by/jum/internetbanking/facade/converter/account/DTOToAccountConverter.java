package by.jum.internetbanking.facade.converter.account;

import by.jum.internetbanking.dto.BankAccountDTO;
import by.jum.internetbanking.entity.BankAccount;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

//@Component("dtoToAccountConverter")
@Component
public class DTOToAccountConverter implements Converter<BankAccountDTO, BankAccount> {
    @Override
    public BankAccount convert(BankAccountDTO accountDTO) {
        BankAccount account = new BankAccount();
        account.setAmountOfMoney(accountDTO.getAmountOfMoney());
        account.setAccountNumber(accountDTO.getAccountNumber());
        return account;
    }
}