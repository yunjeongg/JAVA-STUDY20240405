package day10.inter.quiz;

import java.util.Arrays;

public class MediaPlayer {

    private MediaPlayable[] mediaList;

    public MediaPlayer() {
        this.mediaList = new MediaPlayable[0];
    }

    public void addMedia(MediaPlayable media) {
        // 주어진 media를 mediaList배열에 추가
        MediaPlayable[] temp
                = Arrays.copyOf(mediaList, mediaList.length + 1); // 배열 복사

        temp[temp.length - 1] = media;
        this.mediaList = temp;
    }

    public void playAll() {
        // 반복문을 통해 mediaList에 있는 모든 미디어들을 재생시킴
        for (MediaPlayable mediaPlayable : mediaList) {
            mediaPlayable.play();
        }
    }

}
