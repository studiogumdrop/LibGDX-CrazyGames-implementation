package io.studiogumdrop.crazygames.utils;

public class CrazySDK {

    // Declare variables
    private static String adResult = "";

    // Let CrazyGames know the gameplay started (Not when the game just loaded to CrazyGames)
    public static native void gameplayStart() /*-{
        $wnd.gameplayStart();
    }-*/;

    // Let CrazyGames know the gameplay stopped
    public static native void gameplayStop() /*-{
        $wnd.gameplayStop();
    }-*/;

    // Let CrazyGames know when loading started
    public static native void loadingStart() /*-{
        $wnd.loadingStart();
    }-*/;

    // Let CrazyGames know when loading stopped
    public static native void loadingStop() /*-{
        $wnd.loadingStop();
    }-*/;

    // Throws confetti on the screen
    public static native void happyTime() /*-{
        $wnd.happyTime();
    }-*/;

    // Ask Crazygames to get an ad
    public static native String requestVideoAd(String adType) /*-{
        $wnd.requestAd(adType);
    }-*/;

    // Get ad result from javascript
    public static native String getAdResult() /*-{
        return $wnd.adResult || "no results";
    }-*/;

}
