package ru.netology;



public class CreditAccount extends Account {

    private final long creditLimit;

    public CreditAccount(long balance, long creditLimit) {
        super(balance);
        this.creditLimit = -creditLimit;
    }

    //CreditAccount — кредитный счёт, который может уходить в минус до кредитного лимита,
    // указанного в конструкторе, но не может уходить в плюс.

    @Override
    public boolean add(long amount) {
        if (balance + amount <= 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount >= creditLimit) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }


}
