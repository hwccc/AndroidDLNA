package com.didi365.dlnasupport.center;

public class MediaControlMonitor {

    private volatile static MediaControlMonitor instance;

    private IMediaControlListener mediaControlListener;

    private MediaControlMonitor() {

    }

    public static MediaControlMonitor getInstance() {
        if (instance == null) {
            synchronized (MediaControlMonitor.class) {
                if (instance == null) {
                    instance = new MediaControlMonitor();
                }
            }
        }
        return instance;
    }

    public void setMediaControlListener(IMediaControlListener mediaControlListener) {
        this.mediaControlListener = mediaControlListener;
    }

    public void onPlayCommand() {
        if (mediaControlListener != null) {
            mediaControlListener.onPlayCommand();
        }
    }

    public void onPauseCommand() {
        if (mediaControlListener != null) {
            mediaControlListener.onPauseCommand();
        }
    }

    public void onStopCommand() {
        if (mediaControlListener != null) {
            mediaControlListener.onStopCommand();
        }
    }

    public void onSeekCommand(int time) {
        if (mediaControlListener != null) {
            mediaControlListener.onSeekCommand(time);
        }
    }

}
