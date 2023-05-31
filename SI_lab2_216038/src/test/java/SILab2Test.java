import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void branchTest() {

        // Test 1
        User user = new User(null, "petar", "petarpetargmail.com");
        User user1 = new User("user", "user000", "user1@gmail.com");
        User user2 = new User("user2@gmail.com", "user2", "user2@gmail.com");
        List<User> userList_test1 = new ArrayList<>(List.of(user1, user2));
        assertFalse(SILab2.function(user, userList_test1));

        // Test 2
         user = new User(null, "petar999@@", "petarmalinovski@gmail.com");
         user1 = new User("user", "user000", "user1@gmail.com");
         user2 = new User("petarmalinovski@gmail.com", "petar999@@", "petarmalinovski@gmail.com");
         userList_test1 = new ArrayList<>(List.of(user1, user2));
         assertFalse(SILab2.function(user, userList_test1));

         //Test 3
         user = new User(null, "pe tar999@@", "petarmalinovski@gmail.com");
         user1 = new User("user", "user000", "useruser@gmail.com");
         user2 = new User("petarmalinovski@gmail.com", "petar999@@", "petarmalinovski@gmail.com");
         userList_test1 = new ArrayList<>(List.of(user1, user2));
         assertFalse(SILab2.function(user, userList_test1));

         //Test 4
         user = new User("petarr", "petar99999", "petarmalinovski@gmail.com");
         user1 = new User("user", "user000", "useruser@gmail.com");
         user2 = new User("petarr@gmail.com", "petar999@@", "petar@gmail.com");
         userList_test1 = new ArrayList<>(List.of(user1, user2));
         assertFalse(SILab2.function(user, userList_test1));

        //Test 5
         RuntimeException exception = assertThrows(RuntimeException.class, () -> SILab2.function(null, new ArrayList<>()));
         assertTrue(exception.getMessage().contains("Mandatory information missing"));
    }

    @Test
    public void multipleConditionTest() {

        // T X X
        User user1 = null;
        RuntimeException exception = assertThrows(RuntimeException.class, () -> SILab2.function(user1, new ArrayList<>()));
        assertTrue(exception.getMessage().contains("Mandatory information missing"));

        // F T X
        User user2 = new User("username", null, "username@gmail.com");
        exception = assertThrows(RuntimeException.class, () -> SILab2.function(user2, new ArrayList<>()));
        assertTrue(exception.getMessage().contains("Mandatory information missing"));

        // F F T
        User user3 = new User("username", "password123", null);
        exception = assertThrows(RuntimeException.class, () -> SILab2.function(user3, new ArrayList<>()));
        assertTrue(exception.getMessage().contains("Mandatory information missing"));

        // F F F
        User user4 = new User("username", "password123", "username@gmail.com");
        assertFalse(SILab2.function(user4, new ArrayList<>()));
    }
}
