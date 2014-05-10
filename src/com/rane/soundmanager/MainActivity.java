package com.rane.soundmanager;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
	
	SeekBar seekMedia;
	SeekBar seekNot;
	SeekBar seekRing;
	SeekBar seekSys;
	SeekBar seekAlarm;
	SeekBar seekCall;
	AudioManager audioManager;
	
	
	public void UpdateProgress()
	{
		seekSys.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_SYSTEM));
		seekRing.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_RING));
		seekNot.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_NOTIFICATION));
		seekMedia.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));
		seekAlarm.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_ALARM));
		seekCall.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_VOICE_CALL));
	}
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        seekMedia = (SeekBar)findViewById(R.id.seekMedia);
        seekNot = (SeekBar)findViewById(R.id.seekNot);
        seekRing = (SeekBar)findViewById(R.id.seekRing);
        seekSys = (SeekBar)findViewById(R.id.seekSys);
        seekAlarm = (SeekBar)findViewById(R.id.seekAlarm);
        seekCall = (SeekBar)findViewById(R.id.seekCall);
        
        
        
       audioManager = 
        	    (AudioManager)getSystemService(AUDIO_SERVICE);

        seekSys.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_SYSTEM));
        
        
        
        seekSys.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				int number = seekBar.getProgress();
				
				audioManager.setStreamVolume(AudioManager.STREAM_SYSTEM, number,AudioManager.FLAG_PLAY_SOUND);
				
				UpdateProgress();

			}
		});	
        
        seekRing.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_RING));
        
        
        seekRing.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				int number = seekBar.getProgress();
				audioManager.setStreamVolume(AudioManager.STREAM_RING, number,AudioManager.FLAG_PLAY_SOUND);
				UpdateProgress();
			}
		});	
        
        
        seekNot.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_NOTIFICATION));
        
        
        seekNot.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				int number = seekBar.getProgress();
				audioManager.setStreamVolume(AudioManager.STREAM_NOTIFICATION, number,AudioManager.FLAG_PLAY_SOUND);
				UpdateProgress();
			}
		});
        
        seekMedia.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
        
        
        seekMedia.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				int number = seekBar.getProgress();
				audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, number,AudioManager.FLAG_PLAY_SOUND);
				UpdateProgress();
			}
		});
        
        
        seekAlarm.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_ALARM));
        
        
        seekAlarm.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				int number = seekBar.getProgress();
				audioManager.setStreamVolume(AudioManager.STREAM_ALARM, number,AudioManager.FLAG_PLAY_SOUND);
				UpdateProgress();
			}
		});
        
        seekCall.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_VOICE_CALL));
        
        
        seekCall.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				int number = seekBar.getProgress();
				audioManager.setStreamVolume(AudioManager.STREAM_VOICE_CALL, number,AudioManager.FLAG_PLAY_SOUND);
				UpdateProgress();
			}
		});
        
        UpdateProgress();
    }
    
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.menu, menu);
	    return true;
	}
	
	private void onMarketLaunch(String url) {
		
		Intent donate = new Intent(Intent.ACTION_VIEW, Uri.parse(String.format(
				"market://details?id=%s", url)));
		startActivity(donate);
	}
	
	private void onDevLaunch(String url) {
		
		Intent donate = new Intent(Intent.ACTION_VIEW, Uri.parse(String.format(
				"market://search?q=pub:%s", url)));
		startActivity(donate);
	}
	
	public void share()
	{
		Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("text/plain");
		intent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.rane.soundmanager");
		startActivity(Intent.createChooser(intent, "Share with"));
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	        case R.id.menu_rate:    onMarketLaunch("com.rane.soundmanager");
	                            break;
	                            
	        case R.id.menu_moreapps:	onDevLaunch("Ranebord");
	        break;    
            
	        case R.id.menu_share:	share();
	        break;

	    }
	    return true;
	}
}