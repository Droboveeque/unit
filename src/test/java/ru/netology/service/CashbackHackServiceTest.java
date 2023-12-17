package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateCashbackWhenAmountIs0() {

        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashback() {

        CashbackHackService service = new CashbackHackService();

        int expected = 236;
        int actual = service.remain(1764);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashbackWhenAmountIs1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }
}