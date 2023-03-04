package com.didi365.dlnasupport.center;

public interface IMediaControlListener {
    void onPlayCommand();

    void onPauseCommand();

    void onStopCommand();

    void onSeekCommand(int time);
}
