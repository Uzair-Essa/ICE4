/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpsjframe;


import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author uzair
 */
public class SimpleAudioPlayer
{
    private Clip clip;
    private AudioInputStream audioInputStream;
    private String filePath;

    public SimpleAudioPlayer(String filePath) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        this.filePath = filePath;
        audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
        clip = AudioSystem.getClip();
        clip.open(audioInputStream);
    }

    public void play() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        clip.start();
    }

    public void stop() {
        clip.stop();
        clip.close();
    }
}

