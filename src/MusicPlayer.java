/*
 * (Lab 12)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L12.6: MusicPlayer.java
 *
 * ==================================================================================
 * Task 2: Create a class MusicPlayer that implements Playable: [L12-2.2 MusicPlayer.java]
 *
 * Implement both methods:
 *      - In play(), print a message such as "Playing music..."
 *      - In pause(), print "Paused playing music."
 * ==================================================================================
 */


public class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Paused playing music");
    }
}
