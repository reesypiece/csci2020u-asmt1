package org.reesypiece.Adapter;

/**
 * A FLAC player.
 */
public class FLACPlayer implements AdvancedMediaPlayer {
    /**
     * "Plays" a .flac file.
     * @param fileName
     */
    @Override
    public void playFile(String fileName) {
        System.out.println("Playing FLAC file from FLACPlayer " + fileName);
    }
}
