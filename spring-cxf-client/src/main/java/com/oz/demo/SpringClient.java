package com.oz.demo;

import com.oz.model.Player;
import com.oz.ws.ITeamService;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringClient
{
	public static final Logger logger = Logger.getLogger(SpringClient.class);


	public static void main(String[] args) throws Exception
	{		
		//Initializes Spring Container 
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");		
		ITeamService teamServiceClient = (ITeamService) applicationContext.getBean("teamServiceClient");
		
		//test
		logger.info("getTeam");		
		List<Player> team = teamServiceClient.getTeam();
		for (Player player : team)
		{
			logger.info("       " + player.getNumber() + " : " + player.getName() + " (" + player.getAge() +")");
		}		
				
		logger.info("\n updatePlayerByNumber");
		teamServiceClient.updatePlayerByNumber(1, new Player(1,"Anders Lindegaard", 28));
				
				logger.info("\n deletePlayer");
				teamServiceClient.deletePlayer(6); 
				
				logger.info("\n getPlayers");
				team = teamServiceClient.getPlayers(1,3,6);		
				for (Player player : team)
				{
					logger.info("       " + player.getNumber() + " : " + player.getName() + " (" + player.getAge() +")");
				}
	}

}