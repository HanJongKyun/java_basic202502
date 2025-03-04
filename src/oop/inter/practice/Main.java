package oop.inter.practice;

public class Main {
/*
#### 구현할 사항
    - `MediaPlayable` 인터페이스와 여러 미디어 플레이어 클래스를 구현합니다.
    - `MediaPlayer` 클래스에서 미디어 파일을 관리하고 통합된 조작을 수행합니다.
    - `Main` 클래스에서 여러 미디어 파일을 추가하고 통합된 조작을 테스트합니다.
*/

    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        player.addMedia(new VideoPlayer());
        player.addMedia(new AudioPlayer());
        player.addMedia(new ImageDisplay());

        player.playAll();  // 모든 미디어 파일 재생 (각각의 play메서드 호출)
    }
}