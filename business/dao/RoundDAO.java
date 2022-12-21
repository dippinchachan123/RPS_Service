/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.game.rockpaperscissor.business.dao;

/**
 *
 * @author dippinchachan
 */

import com.game.rockpaperscissor.business.model.Round;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoundDAO extends JpaRepository<Round, Long> {

}
