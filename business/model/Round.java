/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.game.rockpaperscissor.business.model;
/**
 *
 * @author dippinchachan
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.game.rockpaperscissor.business.enums.Choice;
import com.game.rockpaperscissor.business.enums.Result;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Round {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;

    private Choice playerOneChoice;

    private Choice playerTwoChoice;

    private Result playerOneResult;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Game game;

    public Round(
            Choice playerOneChoice,
            Choice playerTwoChoice,
            Result result,
            Game game) {
        this.playerOneChoice = playerOneChoice;
        this.playerTwoChoice = playerTwoChoice;
        this.playerOneResult = result;
        this.game = game;
    }
}
