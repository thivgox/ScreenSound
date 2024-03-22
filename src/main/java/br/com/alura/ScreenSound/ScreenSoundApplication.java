package br.com.alura.ScreenSound;

import br.com.alura.ScreenSound.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenSoundApplication implements CommandLineRunner {

	;

	public static void main(String[] args) {
		SpringApplication.run(ScreenSoundApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
