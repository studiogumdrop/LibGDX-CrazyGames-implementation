package io.studiogumdrop.crazygames;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import io.studiogumdrop.crazygames.utils.CrazySDK;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private BitmapFont font;

    private String text = "";

    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont();
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        font.draw(batch, text, 10, 300);
        batch.end();

        // Gameplay start
        if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_1)) {CrazySDK.gameplayStart();}
        // Gameplay stop
        else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_2)) {CrazySDK.gameplayStop();}
        // Loading start
        else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_3)) {CrazySDK.loadingStart();}
        // Loading stop
        else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_4)) {CrazySDK.loadingStop();}
        // Happy time
        else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_5)) {CrazySDK.happyTime();}
        // Request midgame ad
        else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_6)) {Gdx.app.log("My game", CrazySDK.requestVideoAd("midgame"));}
        // Request reward ad
        else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_7)) {Gdx.app.log("My game", CrazySDK.requestVideoAd("rewarded"));}

        // Update text
        text =
            "1 - Gameplay start\n" +
                "2 - Gameplay stop\n" +
                "3 - Loading start \n" +
                "4 - Loading stop\n" +
                "5 - HappyTime\n" +
                "6 - Request midgame ad (Doesn't work in QA tools)\n" +
                "7 - Request reward ad\n\n" +
                "Ad result: " + CrazySDK.getAdResult();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
