package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class FileStorageRunner implements CommandLineRunner{
	@Autowired
	StorageService storageService;	
	@Override
	public void run(String... args) throws Exception {
		FileData fileData = new FileData("image.png", 55);
		storageService.store(fileData);
		
	}

}
