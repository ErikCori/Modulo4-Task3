package com.codeoftheweb.salvo.Controller;


import com.codeoftheweb.salvo.Model.GamePlayer;
import com.codeoftheweb.salvo.Repository.GamePlayerRepository;
import com.codeoftheweb.salvo.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class SalvoController {
    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GamePlayerRepository gamePlayerRepository;

    @RequestMapping("/games")
    public List<Object> getAllGames() {
        return gameRepository.findAll().stream().map(game -> game.makeGameDto()).collect(Collectors.toList());
    }

    @RequestMapping("/game_view/{gamePlayerId}")
    public Map<String, Object> gameViewDto(@PathVariable Long gamePlayerId){
        GamePlayer gamePlayer = gamePlayerRepository.getOne(gamePlayerId);
        Map<String, Object> dto = new LinkedHashMap<>();
        dto.put("id", gamePlayer.getGame().getId());
        dto.put("created", gamePlayer.getGame().getCreationDate());
        dto.put("gamePlayers", gamePlayer.getGame().getGamePlayers().stream().map(g ->g.makeGamePlayerDto()));
        dto.put("ships", gamePlayer.getShips().stream().map(s -> s.makeShipDto()) );
        return dto;
    }



}
