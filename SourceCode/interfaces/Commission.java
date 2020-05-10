package SourceCode.interfaces;

import SourceCode.models.Receipt;

public interface Commission {
    public void submitReceipt(Receipt receipt);
    public void getCommission();
}