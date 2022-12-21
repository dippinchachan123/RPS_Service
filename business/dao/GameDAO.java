/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.game.rockpaperscissor.business.dao;


import com.game.rockpaperscissor.business.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dippinchachan
 */

public interface GameDAO extends JpaRepository<Game, Long> {

}
