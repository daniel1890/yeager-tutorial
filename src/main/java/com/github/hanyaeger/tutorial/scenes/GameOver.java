package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Waterworld;
import com.github.hanyaeger.tutorial.entities.buttons.PlayAgainButton;
import com.github.hanyaeger.tutorial.entities.buttons.QuitButton;
import com.github.hanyaeger.tutorial.entities.buttons.StartButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class GameOver extends StaticScene {

    private Waterworld waterworld;

    public GameOver(Waterworld waterworld) {
        this.waterworld = waterworld;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/ocean.mp3");
        setBackgroundImage("backgrounds/background1.jpg");
    }

    @Override
    public void setupEntities() {
        // setup play again button
        var playAgainButton = new PlayAgainButton(
                new Coordinate2D(getWidth() / 2, getHeight() / 2),
                waterworld
        );
        playAgainButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(playAgainButton);

        // setup play again button
        var quitButton = new QuitButton(
                new Coordinate2D(getWidth() / 2, getHeight() - (getHeight() / 4)),
                waterworld
        );
        quitButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(quitButton);
    }
}
