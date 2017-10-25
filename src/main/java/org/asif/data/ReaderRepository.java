package org.asif.data;

import java.util.List;

import org.asif.dto.Reader;

public interface ReaderRepository {

	List<Reader> findReader(long max, int count);
}
