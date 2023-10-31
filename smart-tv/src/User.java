public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada: " + smartTv.on);
        System.out.println("Canal: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.turnOn();
        smartTv.setChannel(10);
        System.out.println("Canal: " + smartTv.channel);

        smartTv.turnOff();
        smartTv.setChannel(20);
        System.out.println("Canal: " + smartTv.channel);

        smartTv.turnOn();
        smartTv.setVolume(50);
        System.out.println("Volume: " + smartTv.volume);
    }
}
