package abstractFactoryPattern.good.sugar.impl;

import abstractFactoryPattern.good.sugar.Sugar;

public class WhiteSugar implements Sugar {
    @Override
    public String getSugarName() {
        return "White Sugar";
    }
    
}
