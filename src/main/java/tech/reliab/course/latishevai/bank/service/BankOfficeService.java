package tech.reliab.course.latishevai.bank.service;

import tech.reliab.course.latishevai.bank.entity.Bank;
import tech.reliab.course.latishevai.bank.entity.BankOffice;
import tech.reliab.course.latishevai.bank.enums.StatusOffice;

public interface BankOfficeService {
    void create(Integer id, String name, String address,
                StatusOffice status, Boolean maySetATM, Integer countATM,
                Boolean mayApplyLoan, Boolean mayWithdrawMoney, Boolean mayDepositMoney,
                Double money, Double rentCost, Bank bank);
    void update(BankOffice bankOffice);
    void delete();
    BankOffice getBankOffice();
}
