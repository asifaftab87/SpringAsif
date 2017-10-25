package org.asif.data.impl;

import java.util.List;

import org.asif.data.ReaderRepository;
import org.asif.dto.Reader;
import org.asif.util.MethodUtil;
import org.springframework.stereotype.Component;

@Component
public class ReaderRepositoryImpl implements ReaderRepository{

	@Override
	public List<Reader> findReader(long max, int count){
		
		List<Reader> readerList = MethodUtil.getFullReaderList();
		
		/*if(readerList!=null){
			
			for(int i=0 ; i<count ; i++){
				for(Reader reader : readerList){
					long id = reader.getId();
					if(id<=max)
						readerList.add(reader);
				}
			}
		}*/
		
		return readerList;
	}
}
