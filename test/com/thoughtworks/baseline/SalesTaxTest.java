package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalesTaxTest {

    @Test
    public void shouldHaveBasicSalesTaxZeroIfTheItemIsAFood() {
        Item item = new Item("chocolate",0.85);

        assertEquals(0.0,item.basicSalesTax(),0.0);
    }
}
