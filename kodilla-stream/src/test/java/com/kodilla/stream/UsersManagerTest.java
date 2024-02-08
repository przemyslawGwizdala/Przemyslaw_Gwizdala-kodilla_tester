package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UsersManagerTest {

    @Test
    void testFilterChemistGroupUsernames() {
        // given
        UsersManager usersmanager = new UsersManager();
        // when
        List<String> usernames = UsersManager.filterChemistGroupUsernames();
        // then
        assertEquals(2,usernames.size());
        assertEquals("Walter White", usernames.get(0));
        assertEquals("Gale Boetticher", usernames.get(1));
    }

}