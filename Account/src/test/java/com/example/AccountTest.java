package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account();
    }

    @Test
    void testInitialBalance() {
        assertEquals(0.0, account.getBalance());
    }

    @Test
    void testDeposit() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());

        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    void testDepositNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-50.0));
    }

    @Test
    void testWithrawal() {
        account.deposit(200.0);
        account.withdraw(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    void testWithdrawExactBalance() {
        account.deposit(100.0);
        account.withdraw(100.0);
        assertEquals(0.0, account.getBalance(), 0.01);
    }

    @Test
    void testWithdrawMoreThanBalance() {
        account.deposit(100.0);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(150.0));
    }

    @Test
    void testWithdrawNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-50.0));
    }

    @Test
    void testGetBalance() {
        account.deposit(300.0);
        assertEquals(300.0, account.getBalance(), 0.01);
    }
}