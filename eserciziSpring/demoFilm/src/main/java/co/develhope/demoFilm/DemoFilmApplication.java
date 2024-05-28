package co.develhope.demoFilm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoFilmApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFilmApplication.class, args);
	}

}
//L'obiettivo di questo esercizio è sviluppare un'applicazione Spring Boot per la
//gestione di film e registi, seguendo l'architettura MVC.
//		1) Definire un’entità Regista con i seguenti attributi:
//		- ID: Identificativo unico del regista.
//		- Name: Nome del regista.
//- DateOfBirth: Anno di nascita.
//- Nationality: Nazionalità.
//2) Implementare un’applicazione che rispetti l’architettura MVC (con i layer
//		Controller, Service e Repository) per la gestione delle operazioni CRUD
//dell’entità Film:
//		- Create: ‘POST /directors
//- Read: ‘GET /directors’ e ‘GET /directors/{id}’
//		- Update: ‘PUT /directors/{id}’
//		- Delete ‘ DELETE /directors/{id}’
//		3) Bonus:
//a) Definire un’entità Film con i seguenti attributi:
//		- ID: Identificativo unico del film.
//		- Title: Titolo del film.
//- ReleaseYear: Anno di uscita.
//- Genre: Genere del film.
//		b) Aggiungere una relazione OneToMany tra Film e Regista
//c) Implementare la gestione della creazione di un nuovo Film
//specificando nella richiesta anche il Regista

