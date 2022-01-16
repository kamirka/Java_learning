package Module9_Interface;

public interface Music {
    //1. nie można tworzyć pól obiektu
    //2. można tworzyć stałe - statyczne,finalne

     String NAME = "MUSIC"; // stała public static final ->zawsze!

    //3. tylko metody abstrakcyjne

    void playMusic(); //zawsze będą = public abstract
    void pauseMusic();
    void stopMusic();

    default void sayHelloFromMusic(){
        System.out.println("Hello from default");
    }
    default void sayHello() {
        System.out.println("Say hello from music");
    }

}
