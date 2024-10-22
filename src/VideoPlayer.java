/*
 * (Lab 12)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L12.7: VideoPlayer.java
 *
 * ==================================================================================
 * Task 3: Create a class VideoPlayer that also implements Playable:  [L12-2.3 VideoPlayer.java]
 *
 * Implement both methods:
 *      - In play(), print "Playing video..."
 *      - In pause(), print "Paused playing video."
 * ==================================================================================
 */


public class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing video...");
    }

    @Override
    public void pause() {
        System.out.println("Paused playing video.");
    }
}
