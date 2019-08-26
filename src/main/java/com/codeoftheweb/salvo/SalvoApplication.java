package com.codeoftheweb.salvo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


@SpringBootApplication
public class SalvoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SalvoApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(PlayerRepository playerRepository, GameRepository gameRepository, GamePlayerRepository gamePlayerRepository, ShipRepository shipRepository){
		return (args) -> {
			//save  a couple of players
			Player player1 = new Player("j.bauer@ctu.gov");
			Player player2 = new Player("c.obrian@ctu.gov");
			Player player3 = new Player("kim_bauer@gmail.com");
			Player player4 = new Player("t.almeida@ctu.gov");
			Player player5 = new Player("null");

			playerRepository.save(player1);
			playerRepository.save(player2);
			playerRepository.save(player3);
			playerRepository.save(player4);
			playerRepository.save(player5);

			//save a couple of games

			Date date1 = new Date();
			Date date2 = Date.from(date1.toInstant().plusSeconds(3600));
			Date date3 = Date.from(date1.toInstant().plusSeconds(7200));
			Date date4 = Date.from(date2.toInstant().plusSeconds(3600));
			Date date5 = Date.from(date2.toInstant().plusSeconds(7200));
			Date date6 = Date.from(date3.toInstant().plusSeconds(3600));
			Date date7 = Date.from(date3.toInstant().plusSeconds(7200));
			Date date8 = Date.from(date4.toInstant().plusSeconds(3600));

			Game game1 = new Game(date1);
			Game game2 = new Game(date2);
			Game game3 = new Game(date3);
			Game game4 = new Game(date4);
			Game game5 = new Game(date5);
			Game game6 = new Game(date6);
			Game game7 = new Game(date7);
			Game game8 = new Game(date8);

			gameRepository.save(game1);
			gameRepository.save(game2);
			gameRepository.save(game3);
			gameRepository.save(game4);
			gameRepository.save(game5);
			gameRepository.save(game6);
			gameRepository.save(game7);
			gameRepository.save(game8);

			//save a couple of PlayerGames

			GamePlayer gamePlayer1 = new GamePlayer(date1, game1, player1);
			GamePlayer gamePlayer2 = new GamePlayer(date1, game1, player2);
			GamePlayer gamePlayer3 = new GamePlayer(date2, game2, player1);
			GamePlayer gamePlayer4 = new GamePlayer(date2, game2, player2);
			GamePlayer gamePlayer5 = new GamePlayer(date3, game3, player4);
			GamePlayer gamePlayer6 = new GamePlayer(date3, game3, player2);
			GamePlayer gamePlayer7 = new GamePlayer(date4, game4, player2);
			GamePlayer gamePlayer8 = new GamePlayer(date4, game4, player1);
			GamePlayer gamePlayer9 = new GamePlayer(date5, game5, player4);
			GamePlayer gamePlayer10 = new GamePlayer(date5, game5, player1);
			GamePlayer gamePlayer11 = new GamePlayer(date6, game6, player3);
			GamePlayer gamePlayer12 = new GamePlayer(date6, game6, player5);
			GamePlayer gamePlayer13 = new GamePlayer(date7, game7, player4);
			GamePlayer gamePlayer14 = new GamePlayer(date7, game7, player5);
			GamePlayer gamePlayer15 = new GamePlayer(date8, game8, player3);
			GamePlayer gamePlayer16 = new GamePlayer(date8, game8, player4);


			gamePlayerRepository.save(gamePlayer1);
			gamePlayerRepository.save(gamePlayer2);
			gamePlayerRepository.save(gamePlayer3);
			gamePlayerRepository.save(gamePlayer4);
			gamePlayerRepository.save(gamePlayer5);
			gamePlayerRepository.save(gamePlayer6);
			gamePlayerRepository.save(gamePlayer7);
			gamePlayerRepository.save(gamePlayer8);
			gamePlayerRepository.save(gamePlayer9);
			gamePlayerRepository.save(gamePlayer10);
			gamePlayerRepository.save(gamePlayer11);
			gamePlayerRepository.save(gamePlayer12);
			gamePlayerRepository.save(gamePlayer13);
			gamePlayerRepository.save(gamePlayer14);
			gamePlayerRepository.save(gamePlayer15);
			gamePlayerRepository.save(gamePlayer16);

			//Save a couple of ships
			String carrier = "Carrier";
			String battleship = "Battleship";
			String submarine = "Submarine";
			String destroyer = "Destroyer";
			String patrolBoat = "Patrol Boat";

			Ship ship1 = new Ship(gamePlayer1, destroyer, Arrays.asList("H2", "H3", "H4"));
			Ship ship2 = new Ship(gamePlayer1, submarine, Arrays.asList("E1", "F1", "G1"));
			Ship ship3 = new Ship(gamePlayer1, patrolBoat, Arrays.asList("B4", "B5"));
			Ship ship4 = new Ship(gamePlayer2, destroyer, Arrays.asList("B5", "C5", "D5"));
			Ship ship5 = new Ship(gamePlayer2, patrolBoat, Arrays.asList("F1", "F2"));
			Ship ship6 = new Ship(gamePlayer3, destroyer, Arrays.asList("B5", "C5", "D5"));
			Ship ship7 = new Ship(gamePlayer3, patrolBoat, Arrays.asList("C6", "C7"));
			Ship ship8 = new Ship(gamePlayer4, submarine, Arrays.asList("A2", "A3", "A4"));
			Ship ship9 = new Ship(gamePlayer4, patrolBoat, Arrays.asList("G6", "H6"));

			shipRepository.save(ship1);
			shipRepository.save(ship2);
			shipRepository.save(ship3);
			shipRepository.save(ship4);
			shipRepository.save(ship5);
			shipRepository.save(ship6);
			shipRepository.save(ship7);
			shipRepository.save(ship8);
			shipRepository.save(ship9);
		};
	}

}
