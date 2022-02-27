package org.reesypiece.Adapter;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("savage.mp3");
        audioPlayer.play("black mamba.flac");
        audioPlayer.play("sticker.wav"); //TODO: add .wav support
    }
}
