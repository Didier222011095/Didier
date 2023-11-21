public class Interface2 {
    public static void main(String[] args) {
        
        MediaRecorder recorder = new MediaRecorder();

        recorder.play();
        recorder.record();
    }
}
interface Playable {
    void play();
}

interface Recordable {
    void record();
}


class MediaRecorder implements Playable, Recordable {
    @Override
    public void play() {
        System.out.println("Playing media...");
    }

    @Override
    public void record() {
        System.out.println("Recording media...");
    }
}

