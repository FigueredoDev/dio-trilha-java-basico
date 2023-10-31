public class SmartTv {
    boolean on = false;
    int volume = 20;
    int channel = 1;

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on) {
            channel = newChannel;

            return;
        }

        System.out.println("Cannot set channel: TV is off");
    }

    public void setVolume(int newVolume) {
        if (on && newVolume >= 0) {
            volume = newVolume;

            return;
        }

        System.out.println("Cannot set volume: TV is off");
    }

    public void channelUp() {
        if (on) {
            channel++;

            return;
        }

        System.out.println("Cannot change channel: TV is off");
    }

    public void channelDown() {
        if (on) {
            channel--;
            return;
        }

        System.out.println("Cannot change channel: TV is off");
    }

    public void volumeUp() {
        if (on) {
            volume++;
            return;
        }

        System.out.println("Cannot change volume: TV is off");
    }

    public void volumeDown() {
        if (on) {
            volume--;
            return;
        }

        System.out.println("Cannot change volume: TV is off");
    }
}
