package vending_Machine_project;

public interface Calculator {

    int calculateTotal(CoinBundle enteredCoins);
    CoinBundle calculateChange(int enteredByUserMoney);

}
