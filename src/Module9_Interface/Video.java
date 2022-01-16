package Module9_Interface;

public interface Video {
    void playVideo();
    void pauseVideo();
    void stopVideo();

    default void sayHelloFromVideo(){
        System.out.println("Hello form default video!");
    }
    default void sayHello() {
        System.out.println("Say hello from video");
    }
}
