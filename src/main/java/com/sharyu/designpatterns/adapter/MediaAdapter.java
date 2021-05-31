package com.sharyu.designpatterns.adapter;

import com.sharyu.designpatterns.adapter.service.AdvanceMediaPlayer;
import com.sharyu.designpatterns.adapter.service.MediaPlayer;
import com.sharyu.designpatterns.adapter.service.impl.Mp4Player;
import com.sharyu.designpatterns.adapter.service.impl.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

	AdvanceMediaPlayer advancedMusicPlayer;

	public MediaAdapter(String audioType) {

		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VlcPlayer();

		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(fileName);
		}

	}

}
