package org.reesypiece.Adapter;

/**
 * The main audio player.
 * Has "built-in" mp3 file support, with other formats
 * able to be adapted as needed.
 */
public class AudioPlayer implements MediaPlayer {
    AudioAdapter audioAdapter;

    /**
     * "Plays" an audio file. Already built to handle .mp3 files,
     * with adapters to help handle another format (.flac files).
     * @param fileName the name of the audio file to play
     */
    @Override
    public void play(String fileName) {
        String[] nameArr = fileName.split("\\.");

        // nameArr is going to be in the form ["song name", "mp3"]
        // or something along these lines. a naive approach, but
        // check the last item of the array and match it with a file type
        switch (nameArr[nameArr.length - 1].toLowerCase()) {
            case "mp3": {
                System.out.println("Playing MP3 file " + fileName);
                break;
            }
            // switch may not be the best case if we want to expand this
            // with more audio formats, but this is good enough for this
            // example
            case "flac": {
                // uses object adapter
                audioAdapter = new AudioAdapter();
                audioAdapter.play(fileName);
                break;
            }
            default: {
                System.out.println("Unsupported file " + fileName);
                break;
            }
        }
    }
}
