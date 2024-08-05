import org.junit.jupiter.api.*;
import ru.netology.CreditAccount;
import ru.netology.SimpleAccount;

import static org.junit.jupiter.api.Assertions.*;

public class CreditAccountTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Start Test!");

    }

    @AfterEach
    void tearDown() {
        System.out.println("END Test!");
    }

    @DisplayName("Single test successful")
    @Test
    void payTest() {
        CreditAccount creditAccount = new CreditAccount(2000, 1000);
        boolean result = creditAccount.pay(1000);
        assertEquals(true, result);
    }
    @Test
    void ckeckAcc() {
        SimpleAccount simpleAccount = new SimpleAccount(5000);
        CreditAccount creditAccount = new CreditAccount(2000, 2000);
        assertNotNull(creditAccount);
        assertEquals(true, creditAccount.transfer(simpleAccount, 2000));

    }
}

