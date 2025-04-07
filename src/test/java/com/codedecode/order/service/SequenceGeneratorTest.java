package com.codedecode.order.service;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.mongodb.core.MongoOperations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.*;

import com.codedecode.order.entity.Sequence;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.core.FindAndModifyOptions;

public class SequenceGeneratorTest {

	@InjectMocks
	SequenceGenerator sequenceGenerator; 
	
	@Mock
	MongoOperations mongoOperations;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	void generateNextOrderId() {
		//when(mongoOperations.findAndModify)
		
		// Arrange
        Sequence mockSequence = new Sequence();
        mockSequence.setSequence(1001); // assume it's the next value

        when(mongoOperations.findAndModify(
                any(Query.class),
                any(Update.class),
                any(FindAndModifyOptions.class),
                eq(Sequence.class))
        ).thenReturn(mockSequence);

        // Act
        int result = sequenceGenerator.generateNextOrderId();

        // Assert
        assertEquals(1001, result);
	}
}
