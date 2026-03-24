package com.nit.sbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class CloudStorageService implements StorageService {

	@Override
	public void store(FileData file) {
		System.out.println("Uploading file to cloud: "+file.getFileName());
	}

}
