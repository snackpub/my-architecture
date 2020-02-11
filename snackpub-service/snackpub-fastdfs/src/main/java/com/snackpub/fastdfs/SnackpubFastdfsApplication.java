package com.snackpub.fastdfs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.jmx.support.RegistrationPolicy;

@SpringBootApplication
public class SnackpubFastdfsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnackpubFastdfsApplication.class, args);
	}

}
