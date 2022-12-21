/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.game.rockpaperscissor.business.service;
/**
 *
 * @author dippinchachan
 */



import com.game.rockpaperscissor.business.exception.GameNotFoundException;
import com.game.rockpaperscissor.business.exception.GameOverException;
import com.game.rockpaperscissor.business.enums.Choice;
import com.game.rockpaperscissor.business.model.Game;

public interface GameService {

    Game start(String playerOneName, String playerTwoName);

    Game getStatus(Long id) throws GameNotFoundException;

    Game play(Long id, Choice playerOneChoice, Choice playerTwoChoice) throws GameNotFoundException, GameOverException;
}

