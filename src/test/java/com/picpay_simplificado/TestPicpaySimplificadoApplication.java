package com.picpay_simplificado;

import org.springframework.boot.SpringApplication;

public class TestPicpaySimplificadoApplication {

	public static void main(String[] args) {
		SpringApplication.from(PicpaySimplificadoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
