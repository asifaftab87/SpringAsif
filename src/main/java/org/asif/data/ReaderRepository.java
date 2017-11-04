package org.asif.data;

import java.util.List;

import org.asif.dto.Reader;

public interface ReaderRepository {

	List<Reader> findReader(long max, int count);
	
	Reader findOne(long id);
	
	Reader save(Reader reader);
	
	Reader findByName(String name);
}
