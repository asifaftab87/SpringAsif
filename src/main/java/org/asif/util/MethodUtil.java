package org.asif.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.asif.dto.Reader;

public class MethodUtil {

	
	private static List<Reader> readerList = null;
	
	public static List<Reader> createReaderList(int count){
		
		readerList = new ArrayList<Reader>();
		
		for(long i = 0 ; i < count ; i++){
			readerList.add(new Reader(i, ("Reader "+i), new Date()));
		}
		
		return readerList;
	}
	
	
	public static List<Reader> getFullReaderList(){
		if(readerList!=null)
			return readerList;
		else
			return null;
	}
	
	
}