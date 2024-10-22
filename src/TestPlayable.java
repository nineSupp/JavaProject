/*
 * (Lab 12)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L12.8: TestPlayable.java
 *
 * ==================================================================================
 * Test 4: Test the Interface
 * ==================================================================================
 */


public class TestPlayable {
    public static void main(String[] args) {
        Playable mp = new MusicPlayer();
        Playable vp = new VideoPlayer();

        mp.play();
        mp.pause();

        vp.play();
        vp.pause();
    }
}
