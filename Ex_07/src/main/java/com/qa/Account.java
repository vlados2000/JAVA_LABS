package com.qa;

import java.util.Arrays;
import java.util.Objects;

// Task 1
public class Account implements Comparable<Account> {
    private String cardTypes[];
    private String sortCode;
    private String accountNumber;
    private String password;

    public Account(String[] cardTypes, String sortCode, String accountNumber, String password) {
        super();
        this.cardTypes = cardTypes;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.password = password;
    }

    public String[] getCardTypes() {
        return cardTypes;
    }

    public void setCardTypes(String[] cardTypes) {
        this.cardTypes = cardTypes;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "cardTypes=" + Arrays.toString(cardTypes) +
                ", sortCode='" + sortCode + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public int compareTo(Account o) {
        for (String cardType : cardTypes) {
            if (Objects.equals(cardType, o.cardTypes[0])) {
                if (Objects.equals(this.getAccountNumber(), o.getAccountNumber()) && Objects.equals(this.getPassword(), o.getPassword())
                        && Objects.equals(this.getSortCode(), o.getSortCode()))
                    return 0;
            }
        }

        if (Objects.equals(this.getAccountNumber(), o.getAccountNumber()) && Objects.equals(this.getPassword(), o.getPassword())
                && Objects.equals(this.getSortCode(), o.getSortCode()))
            return -1;

        return -1;

    }
}
