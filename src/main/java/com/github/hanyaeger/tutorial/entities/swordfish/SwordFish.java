package com.github.hanyaeger.tutorial.entities.swordfish;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;

import java.util.Random;

public class SwordFish extends DynamicCompositeEntity implements SceneBorderCrossingWatcher {
    public SwordFish(Coordinate2D initialLocation) {
        super(initialLocation);
        setMotion(2, 270d);
    }

    @Override
    protected void setupEntities() {
        var swordfishSprite = new SwordfishSprite(
            new Coordinate2D(0, 0)
        );
        addEntity(swordfishSprite);

        var hitbox = new HitBox(
                new Coordinate2D(0, 50)
        );
        addEntity(hitbox);
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder sceneBorder) {
        setAnchorLocationX(getSceneWidth());
        setAnchorLocationY(new Random().nextInt((int) getSceneHeight()- 81));
    }
}
