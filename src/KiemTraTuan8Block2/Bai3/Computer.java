package KiemTraTuan8Block2.Bai3;




public class Computer {
    private String Id;
    private String name;
    private String hangsx;
    private String cauhinh;
    private double price;
    private boolean status;

    public Computer() {
        int mang[]={};
    }

    public Computer(String code, String name, String manufacturer, String configuration, double price, boolean status) {
        this.Id = Id;
        this.name = name;
        this.hangsx = hangsx;
        this.cauhinh = cauhinh;
        this.price = price;
        this.status = status;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCauhinh() {
        return cauhinh;
    }

    public void setCauhinh(String cauhinh) {
        this.cauhinh = cauhinh;
    }

    public String getHangsx() {
        return hangsx;
    }

    public void setHangsx(String hangsx) {
        this.hangsx = hangsx;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
