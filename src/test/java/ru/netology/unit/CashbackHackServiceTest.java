package ru.netology.unit;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldCalculateSumLessThan1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldCalculateSumEqual1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldCalculateMoreThan1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;
        int expected = 900;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);

    }

}