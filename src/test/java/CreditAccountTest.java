import org.junit.jupiter.api.*;
import ru.netology.CreditAccount;

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
    void shouldThrowException() {
        Throwable exception = assertThrows(UnsupportedOperationException.class, () -> {
            throw new UnsupportedOperationException("Not supported");
        });
        assertEquals("Not supported", exception.getMessage());
    }

    @Test
    void falseCheck() {
        long balance = 3000;
        assertFalse(balance < 2000);
        System.out.println("Too much");
    }
}

