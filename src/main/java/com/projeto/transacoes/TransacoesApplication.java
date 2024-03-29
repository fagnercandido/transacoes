package com.projeto.transacoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.projeto")
@SpringBootApplication
public class TransacoesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransacoesApplication.class, args);
	}

}
