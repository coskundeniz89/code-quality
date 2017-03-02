import com.deniz.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Coşkun on 2.3.2017.
 */
public class UserTest {

    User user = new User();

    @Before
    public void before() {
        user.setName("Coşkun");
    }

    @Test
    public void getName() {
        assertEquals("Coşkun", user.getName());
    }
}
