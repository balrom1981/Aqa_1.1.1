package ru.netology.unit;


import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldCalculateSumLessThan1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = cashbackHackService.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldCalculateSumEqual1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldCalculateMoreThan1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;
        int expected = 900;
        int actual = cashbackHackService.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateSumLessThan1000Jupiter() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = cashbackHackService.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateSumEqual1000Jupiter() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateMoreThan1000Jupiter() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;
        int expected = 900;
        int actual = cashbackHackService.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);

    }

}