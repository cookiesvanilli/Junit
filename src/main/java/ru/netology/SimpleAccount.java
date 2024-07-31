package ru.netology;


public class SimpleAccount extends Account {
    public SimpleAccount(long balance) {
        super(balance);
    }
    //SimpleAccount — обычный счёт, с которого можно платить,
    //пока на нём есть деньги, и пополнять сколько угодно раз.

    @Override
    public boolean pay(long amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

}
