public class Phone {
    private  String brend;
    private  int version;
    private  int screen;
    private int pricw;
    private int baasy;

    public Phone(String brend, int version, int screen, int pricw, int baasy) {
        this.brend = brend;
        this.version = version;
        this.screen = screen;
        this.pricw = pricw;
        this.baasy = baasy;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    public int getPricw() {
        return pricw;
    }

    public void setPricw(int pricw) {
        this.pricw = pricw;
    }

    public int getBaasy() {
        return baasy;
    }

    public void setBaasy(int baasy) {
        this.baasy = baasy;
    }
}
