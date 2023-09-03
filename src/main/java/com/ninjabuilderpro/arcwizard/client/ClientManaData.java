package com.ninjabuilderpro.arcwizard.client;

public class ClientManaData {
    private static int playerMana = 100;

    public static void set(int mana) {
        playerMana = mana;
    }

    public static int getPlayerMana() {
        return playerMana;
    }
}
