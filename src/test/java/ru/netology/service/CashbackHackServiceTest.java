package ru.netology.service;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldCashbackHackMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int expected = 500;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);


    }

    @org.testng.annotations.Test
    public void shouldCashbackHackLessBoundary(){
        CashbackHackService service = new CashbackHackService();
        int amount = 600;

        int expected = 400;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldCashbackHackOneBoundary(){
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldCashbackHackTwoBoundary(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldCashbackHackEqualsBoundary(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);

    }
}