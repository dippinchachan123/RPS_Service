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
public enum Result {

    DRAW(0),

    LOOSE(2),

    WIN(1);

    private final Integer value;

    Result(Integer value) {
        this.value = value;
    }
}


