package by.jum.internetbanking.facade.impl;

import by.jum.internetbanking.entity.BankAccount;
import by.jum.internetbanking.entity.Corporation;
import by.jum.internetbanking.facade.CorporationFacade;
import by.jum.internetbanking.form.money.PaymentForServicesForm;
import by.jum.internetbanking.service.BankAccountService;
import by.jum.internetbanking.service.CorporationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Locale;

@Component
public class CorporationFacadeImpl implements CorporationFacade {

    private static final Logger LOGGER = Logger.getLogger(CorporationFacadeImpl.class);

    @Autowired
    private BankAccountService accountService;

    @Autowired
    private CorporationService corporationService;

    @Autowired
    private MessageSource messageSource;

    @Override
    public Corporation getByName(String name) {
        return corporationService.getByName(name);
    }

    @Override
    public void transferMoney(PaymentForServicesForm servicesForm) {
        String numberAccountFrom = servicesForm.getAccountNumberFrom();
        String name = servicesForm.getNameCorp();
        String amountOfTransferredMoney = servicesForm.getAmountOfMoney();

        BigDecimal transferredMoney = new BigDecimal(amountOfTransferredMoney);
        BankAccount accountFrom = accountService.getAccountByNumber(numberAccountFrom);
        Corporation corporation = corporationService.getByName(name);

        LOGGER.info(messageSource.getMessage("print.services.transfer", new Object[]{amountOfTransferredMoney,
                numberAccountFrom, corporation}, Locale.ENGLISH));
        corporationService.transferMoney(accountFrom, corporation, transferredMoney);
    }
}
