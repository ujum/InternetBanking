package by.jum.internetbanking.form.money;

public class PaymentForServicesForm {
    private String amountOfMoney;
    private String nameCorp;
    private String accountNumberFrom;
    private long userID;

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(String amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public String getNameCorp() {
        return nameCorp;
    }

    public void setNameCorp(String nameCorp) {
        this.nameCorp = nameCorp;
    }

    public String getAccountNumberFrom() {
        return accountNumberFrom;
    }

    public void setAccountNumberFrom(String accountNumberFrom) {
        this.accountNumberFrom = accountNumberFrom;
    }
}