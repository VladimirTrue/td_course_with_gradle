import com.example.first_task.first_task.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestValidator {

    @Test
    public void testIsClosedQuotes(){
        Validator validator = new Validator();
        Assertions.assertEquals(false,validator.isClosedQuotes("}{"));
        Assertions.assertEquals(false,validator.isClosedQuotes("({))"));
        Assertions.assertEquals(true, validator.isClosedQuotes("()()"));
        Assertions.assertEquals(true, validator.isClosedQuotes("()"));
        Assertions.assertEquals(false,validator.isClosedQuotes("(()"));
        Assertions.assertEquals(false,validator.isClosedQuotes("(({}([)]))"));
        Assertions.assertEquals(true, validator.isClosedQuotes("(({}[()]))"));
    }
}
