package com.example.springadv.AppReview.API.repository;

import com.example.springadv.repository.TextDataRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class RepositoryTest {

@Autowired
    private TextDataRepo textDataRepo;

@Test
    public TextDataRepo getTextDataRepo() {
        return textDataRepo;
    }
}
