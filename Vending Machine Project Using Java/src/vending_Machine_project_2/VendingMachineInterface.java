package vending_Machine_project_2;



public interface VendingMachineInterface {

    void displayProducts();

    void selectProduct(int product);

    void displayEnterCoinsMessage();

    void enterCoins(int... coins);

    void displayChangeMessage();
}
