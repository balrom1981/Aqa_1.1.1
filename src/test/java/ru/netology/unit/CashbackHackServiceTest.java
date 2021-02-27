package ru.netology.unit;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldCalculateSumLessThan1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldCalculateSumEqual1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldCalculateMoreThan1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;
        int expected = 900;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);

    }

}