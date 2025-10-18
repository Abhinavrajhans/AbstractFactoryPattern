package good.services;

import good.models.ATM;

public interface CashDispenserService {
    void dispenseCash(ATM atm , int amount);
}
