package com.nit.sbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class LocalStorageService implements StorageService {

	@Override
	public void store(FileData file) {
		System.out.println("Storing file locally: "+file.getFileName());
	}

}
