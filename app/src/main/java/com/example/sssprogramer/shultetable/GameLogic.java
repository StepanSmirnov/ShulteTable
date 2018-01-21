package com.example.sssprogramer.shultetable;

/**
 * Created by SSS on 21.01.2018.
 */

public class GameLogic {

    public class Settings{
        public Settings(){

        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        private int size;
    }
    public GameLogic(){

    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    private Settings settings;
}
