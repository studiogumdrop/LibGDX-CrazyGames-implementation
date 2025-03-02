# LibGDX CrazyGames implementation

This is a basic implementation of the CrazyGames SDK 3 for the GWT module. It has what you need to just upload your game to the site and make money.

This implementation supports gameplayStart and gameplayStop, loadingStart and loadingStop, happyTime, midgame ads, and reward ads.

It does not support multiplayer, banner ads, adblock, and in-game purchases.

To implement this into your project, Copy the CrazySDK class from the utils folder to your project and replace the html/webapp/index.html file in your project with the one in this repository. (Or you can copy the nessesary code from this index.html file.)

(Running functions from CrazySDK on platforms other than HTML will cause the build to fail. Use Gdx.app.getType() to check which platform it is on.)
