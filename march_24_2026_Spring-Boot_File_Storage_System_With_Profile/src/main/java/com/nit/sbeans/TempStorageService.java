package com.nit.sbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class TempStorageService implements StorageService {

	@Override
	public void store(FileData file) {
		System.out.println("Storing file in temp storage: "+file.getFileName());
	}

}
