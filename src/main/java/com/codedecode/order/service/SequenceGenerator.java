package com.codedecode.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Query.query;

import com.codedecode.order.entity.Sequence;

@Service
public class SequenceGenerator {

	@Autowired
	MongoOperations mongoOperations;
	
	public int generateNextOrderId() {
		
		Sequence counter = mongoOperations.findAndModify(
				query( where("_id").is("sequence")),
				new Update().inc("sequence", 1),
				options().returnNew(true).upsert(true),
				Sequence.class
		);
		System.out.println("counter.getSequence(): "+counter.getSequence());
		return counter.getSequence();
		
	}
}
