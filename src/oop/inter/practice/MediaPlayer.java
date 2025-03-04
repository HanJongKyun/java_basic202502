package oop.inter.practice;

public class MediaPlayer {

/*
3. **미디어 관리 클래스 `MediaPlayer` 생성**
    - 속성:
        - `mediaList`: `MediaPlayable` 객체들을 관리하는 `MediaPlayable[]`.
    - 메소드:
        - `addMedia(MediaPlayable media)`: 미디어 목록에 미디어를 추가합니다.
        - `playAll()`: 목록에 있는 모든 미디어 파일을 재생합니다.
*/

    private MediaPlayable[] mediaList;

    public MediaPlayer() {
        this.mediaList = new MediaPlayable[0];
    }

    public void addMedia(MediaPlayable media) {
        MediaPlayable[] temp = new MediaPlayable[mediaList.length + 1];
        for (int i = 0; i < mediaList.length; i++) {
            temp[i] = mediaList[i];
        }
        temp[temp.length - 1] = media;
        mediaList = temp;
    }

    public void playAll() {
        for (MediaPlayable playable : mediaList) {
            playable.play();
        }
    }
}
