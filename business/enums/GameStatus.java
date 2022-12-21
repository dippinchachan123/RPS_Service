/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.game.rockpaperscissor.business.enums;
/**
 *
 * @author dippinchachan
 */

import lombok.Getter;

@Getter
public enum GameStatus {

    STARTED(0),

    FINISHED(1);

    private final Integer value;

    GameStatus(Integer value) {
        this.value = value;
    }
}
