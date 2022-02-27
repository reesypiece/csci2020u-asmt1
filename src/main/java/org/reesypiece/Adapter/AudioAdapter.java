package org.reesypiece.Adapter;

/**
 * An audio adapter, for files that aren't .mp3
 * For now, it only has .flac "support", but more
 * formats can be added as needed.
 */
public class AudioAdapter implements MediaPlayer {
    // base class, AdvancedMusicPlayer, because we can
    // then create objects of its subclasses if needed
    AdvancedMediaPlayer advancedMusicPlayer;

    /**
     * Initializer function.
     * For now, it only creates a .flac "player".
     */
    public AudioAdapter() {
        advancedMusicPlayer = new FLACPlayer();
    }

    /**
     * Overridden play function. Wraps the advanced music player
     * while implementing the basic media player. Called when a
     * FLAC file needs to be played.
     * @param fileName the name of the file to be played
     */
    @Override
    public void play(String fileName) {
        advancedMusicPlayer.playFile(fileName);
    }
}
