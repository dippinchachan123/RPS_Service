/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.game.rockpaperscissor.business.enums;

/**
 *
 * @author dippinchachan
 */


import java.util.Random;

public enum Choice {

    ROCK {
        @Override
        public boolean isBetterThan(Choice choice) {
            return (SCISSORS.equals(choice));
        }
    },

    PAPER {
        @Override
        public boolean isBetterThan(Choice choice) {
            return (ROCK.equals(choice));
        }
    },

    SCISSORS {
        @Override
        public boolean isBetterThan(Choice choice) {
            return (PAPER.equals(choice));
        }
    };

    public static Choice getRandom() {
        int pick = new Random().nextInt(Choice.values().length);
        return Choice.values()[pick];
    }

    public abstract boolean isBetterThan(Choice choice);
}

