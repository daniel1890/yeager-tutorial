package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.Waterworld;
import com.github.hanyaeger.tutorial.entities.Hanny;
import com.github.hanyaeger.tutorial.entities.Sharky;
import com.github.hanyaeger.tutorial.entities.swordfish.SwordFish;
import com.github.hanyaeger.tutorial.entities.text.HealthText;

public class GameLevel extends DynamicScene {
    private final Waterworld waterworld;

    public GameLevel(Waterworld waterworld) {
        this.waterworld = waterworld;
    }
    @Override
    public void setupScene() {
        setBackgroundAudio("audio/waterworld.mp3");
        setBackgroundImage("backgrounds/background2.jpg");
    }

    @Override
    public void setupEntities() {
        var swordfish = new SwordFish(
                new Coordinate2D(getWidth() / 2, getHeight() / 2)
        );


        var healthText = new HealthText(
                new Coordinate2D(getWidth() / 20, getHeight() / 20)
        );

        var hanny = new Hanny(
                new Coordinate2D(getWidth() / 4, getHeight() / 4),
                healthText,
                waterworld
        );

        var sharky = new Sharky(
                new Coordinate2D(0, 0)
        );

        addEntity(swordfish);
        addEntity(healthText);
        addEntity(hanny);
        addEntity(sharky);
    }
}
