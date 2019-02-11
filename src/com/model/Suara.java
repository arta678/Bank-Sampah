/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author artawgn
 */
public class Suara {
    public void clickLogin() {
        try {
//            String soundFile = "/com/nabil/sounds/logging-in.wav";
            String soundFile = "/com/sounds/logging-in.wav";
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(getClass().getResource(soundFile));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
//        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
           
                
            } catch (Exception e) {
            
            System.out.print("ERROR: " + e);
        }
    }
    
    
    
}
