package com.sharyu.designpatterns.adapter.service.impl;

import com.sharyu.designpatterns.adapter.service.AdvanceMediaPlayer;

public class VlcPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		 System.out.println("Playing vlc file. Name: "+ fileName);		
		
	}

	@Override
	public void playMp4(String fileName) {
		//do nothing
		
	}
}
