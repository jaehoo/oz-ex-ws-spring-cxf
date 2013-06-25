package com.oz.ws;

import com.oz.model.Player;

import javax.jws.WebService;
import java.util.List;


@WebService
public interface ITeamService 
{	
	List<Player> getTeam();
	
	List<Player> getPlayers(int... numbers);
	
	boolean updatePlayerByNumber(int number, Player player);
	
	boolean deletePlayer(int number);

}
