import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.Account;
import ru.netology.CreditAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Start Test!");
    }

    @AfterEach
    void tearDown() {
        System.out.println("END Test!");
    }

    @DisplayName("Account test successful")
    @Test
    void transferTest() {
        CreditAccount creditAccount = new CreditAccount(1000, 500);
        Account account = new Account(4000) {
            @Override
            public boolean pay(long amount) {
                return false;
            }
        };
        boolean result = account.transfer(creditAccount, 200);
        System.out.println(result);
        assertEquals(false, result);
    }
}
