package africa.semicolon.classexercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void testThatAccountCanDepositOnce() {
        //given
        Account blessingAccount = new Account();
        //when
        blessingAccount.deposit(450.00);
        //confirm
        assertEquals(450.00, blessingAccount.getAccountBalance());

    }
    @Test
    public void testThatAccountCanDepositTwice(){
        //given
        Account ehisAccount = new Account();
        //when
        ehisAccount.deposit(200);
         ehisAccount.deposit(1000);
        //confirm
        assertEquals(1200, ehisAccount.getAccountBalance());
    }

    @Test
    public void testThatAccountCanWithdraw() {
        //given
        Account umarAccount = new Account();
        //when
        umarAccount.deposit(1200);
        umarAccount.withdraw(200);
        //confirm
        assertEquals(1000, umarAccount.getAccountBalance());
    }

    @Test
    public void testThatAccountCanWithdrawTwice(){
        //given
        Account blessingAccount = new Account();
        //when
        blessingAccount.deposit(1500);
        blessingAccount.withdraw(500);
        //confirm
        assertEquals(1000, blessingAccount.getAccountBalance());
    }
    @Test
    public void testDepositNegativeValue(){
        //given
        Account accountBlessing = new Account();
        //when
        accountBlessing.deposit(-1000);
        //confirm
        assertEquals(0, accountBlessing.getAccountBalance());


    }
    @Test
    public void testWithdrawNegativeValue(){
        //given
        Account blessingBae = new Account();
        //when
        blessingBae.withdraw(-300);
        //confirm
        assertEquals(0, blessingBae.getAccountBalance());
    }
    @Test
    public void testWithdrawMoreThanAccount() {
        //given
        Account semiColon = new Account();
        //when
        semiColon.deposit(5000);
        semiColon.withdraw(5500);
        //confirm
        assertEquals(5000, semiColon.getAccountBalance());

    }
   @Test
    public void testAddVariablePin(){
        //given
        Account lovePartner = new Account();
        //when
        lovePartner.addPin(3456);
        //confirm
        assertEquals(3456,lovePartner.setPin());



    }

    }