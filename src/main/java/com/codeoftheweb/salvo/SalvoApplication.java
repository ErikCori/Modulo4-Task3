package com.codeoftheweb.salvo;

import com.codeoftheweb.salvo.Model.Game;
import com.codeoftheweb.salvo.Model.GamePlayer;
import com.codeoftheweb.salvo.Model.Player;
import com.codeoftheweb.salvo.Model.Ship;
import com.codeoftheweb.salvo.Repository.GamePlayerRepository;
import com.codeoftheweb.salvo.Repository.GameRepository;
import com.codeoftheweb.salvo.Repository.PlayerRepository;
import com.codeoftheweb.salvo.Repository.ShipRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;


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

			playerRepository.saveAll(Arrays.asList(player1, player2, player3, player4, player5));

			//save a couple of games

			Game game1 = new Game(1);
			Game game2 = new Game(2);
			Game game3 = new Game(3);
			Game game4 = new Game(4);
			Game game5 = new Game(5);
			Game game6 = new Game(6);
			Game game7 = new Game(7);
			Game game8 = new Game(8);

			gameRepository.saveAll(Arrays.asList(game1, game2, game3, game4, game5, game6, game7, game8));

			//save a couple of PlayerGames

			GamePlayer gamePlayer1 = new GamePlayer(game1, player1);
			GamePlayer gamePlayer2 = new GamePlayer(game1, player2);
			GamePlayer gamePlayer3 = new GamePlayer(game2, player1);
			GamePlayer gamePlayer4 = new GamePlayer(game2, player2);
			GamePlayer gamePlayer5 = new GamePlayer(game3, player4);
			GamePlayer gamePlayer6 = new GamePlayer(game3, player2);
			GamePlayer gamePlayer7 = new GamePlayer(game4, player2);
			GamePlayer gamePlayer8 = new GamePlayer(game4, player1);
			GamePlayer gamePlayer9 = new GamePlayer(game5, player4);
			GamePlayer gamePlayer10 = new GamePlayer(game5, player1);
			GamePlayer gamePlayer11 = new GamePlayer(game6, player3);
			GamePlayer gamePlayer12 = new GamePlayer(game6, player5);
			GamePlayer gamePlayer13 = new GamePlayer(game7, player4);
			GamePlayer gamePlayer14 = new GamePlayer(game7, player5);
			GamePlayer gamePlayer15 = new GamePlayer(game8, player3);
			GamePlayer gamePlayer16 = new GamePlayer(game8, player4);

			gamePlayerRepository.saveAll(Arrays.asList(gamePlayer1, gamePlayer2, gamePlayer3, gamePlayer4, gamePlayer5, gamePlayer6, gamePlayer7,
														gamePlayer8, gamePlayer9, gamePlayer10, gamePlayer11, gamePlayer12, gamePlayer13,
														gamePlayer14, gamePlayer15, gamePlayer16));

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
			Ship ship10 = new Ship(gamePlayer6, destroyer, Arrays.asList("B%", "C%", "D%"));
			Ship ship11 = new Ship(gamePlayer6, patrolBoat, Arrays.asList("C6", "C7"));
			Ship ship12 = new Ship(gamePlayer5, submarine, Arrays.asList("A2", "A3", "A4"));
			Ship ship13 = new Ship(gamePlayer5, patrolBoat, Arrays.asList("G6", "H6"));
			Ship ship14 = new Ship(gamePlayer7, destroyer, Arrays.asList("B5", "C%", "D5"));
			Ship ship15 = new Ship(gamePlayer7, patrolBoat, Arrays.asList("C6", "C7"));
			Ship ship16 = new Ship(gamePlayer8, submarine, Arrays.asList("A2","A3", "A4"));
			Ship ship17 = new Ship(gamePlayer8, patrolBoat, Arrays.asList("G6", "H6"));
			Ship ship18 = new Ship(gamePlayer9, destroyer, Arrays.asList("B5", "C5", "D5"));
			Ship ship19 = new Ship(gamePlayer9, patrolBoat, Arrays.asList("C6", "C7"));
			Ship ship20 = new Ship(gamePlayer10, submarine, Arrays.asList("A2","A3", "A4"));
			Ship ship21 = new Ship(gamePlayer10, patrolBoat, Arrays.asList("G6", "H6"));
			Ship ship22 = new Ship(gamePlayer11, destroyer, Arrays.asList("B5", "C5", "D5"));
			Ship ship23 = new Ship(gamePlayer11, patrolBoat, Arrays.asList("C6", "C7"));
			Ship ship24 = new Ship(gamePlayer15, destroyer, Arrays.asList("B5", "C5", "D5"));
			Ship ship25 = new Ship(gamePlayer15, patrolBoat, Arrays.asList("C6", "C7"));
			Ship ship26 = new Ship(gamePlayer16, submarine, Arrays.asList("A2", "A3", "A4"));
			Ship ship27 = new Ship(gamePlayer16, patrolBoat, Arrays.asList("G6", "H6"));

			shipRepository.saveAll(Arrays.asList(ship1, ship2, ship3, ship4, ship5, ship6, ship7, ship8, ship9,
												ship10, ship11, ship12, ship13, ship14, ship15, ship16, ship17, ship18,
												ship19, ship20, ship21, ship22, ship23, ship24, ship25, ship26, ship27));

		};
	}

}
