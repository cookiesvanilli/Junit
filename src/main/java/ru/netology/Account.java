package ru.netology;


public abstract class Account {
    protected long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    public boolean add(long amount) { //пополнение счёта на amount, возвращает true, если пополнение успешно, и false, если иначе;
        balance += amount;
        return true;
    }

    public abstract boolean pay(long amount); //покупка со счёта на amount, возвращает true, если покупка успешна, и false, если иначе;

    public boolean transfer(Account accountTo, long amount) {
        //перевод денег со счёта, у которого был вызван метод, на счёт из параметра на сумму в размере amount,
        // возвращает true, если пополнение успешно, и false, если иначе;
        boolean isPayed = pay(amount);
        if(isPayed) {
            boolean isTransferred = accountTo.add(amount);
            if (isTransferred) {
                return true;
            } else {
                add(amount);
                return false;
            }
        } else {
            return false;
        }
    }

    public long getBalance() { //метод возвращает текущий баланс на счёте.
        return this.balance;
    }
}
