package nl.smallproject.www.techiteasy.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class TelevisionInputDto {

    @NotBlank(message = "{television.name.notblank}")
    @Size(min = 3, max = 255, message = "{television.name.size}")
    private String name;

    @NotBlank(message = "{television.brand.notblank}")
    @Size(min = 3, max = 255, message = "{television.brand.size}")
    private String brand;

    private double price;

    private int currentStock;

    private double height;

    private double width;

    @NotBlank(message = "{television.screenquality.notblank}")
    @Size(min = 3, max = 255, message = "{television.screenquality.size}")
    private String screenQuality;

    @NotBlank(message = "{television.screentype.notblank}")
    @Size(min = 3, max = 255, message = "{television.screentype.size}")
    private String screenType;

    @NotNull(message = "{television.wifi.notnull}")
    private Boolean wifi;

    @NotNull(message = "{television.smarttv.notnull}")
    private Boolean smartTv;

    @NotNull(message = "{television.voicecontrol.notnull}")
    private Boolean voiceControl;

    @NotNull(message = "{television.hdr.notnull}")
    private Boolean hdr;


    public @NotNull Boolean getWifi() {
        return wifi;
    }

    public void setWifi(@NotNull Boolean wifi) {
        this.wifi = wifi;
    }

    public @NotBlank @Size(min = 3, max = 255) String getName() {
        return name;
    }

    public void setName(@NotBlank @Size(min = 3, max = 255) String name) {
        this.name = name;
    }

    public @NotBlank @Size(min = 3, max = 255) String getBrand() {
        return brand;
    }

    public void setBrand(@NotBlank @Size(min = 3, max = 255) String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(int currentStock) {
        this.currentStock = currentStock;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public @NotBlank @Size(min = 3, max = 255) String getScreenQuality() {
        return screenQuality;
    }

    public void setScreenQuality(@NotBlank @Size(min = 3, max = 255) String screenQuality) {
        this.screenQuality = screenQuality;
    }

    public @NotBlank @Size(min = 3, max = 255) String getScreenType() {
        return screenType;
    }

    public void setScreenType(@NotBlank @Size(min = 3, max = 255) String screenType) {
        this.screenType = screenType;
    }

    public @NotNull Boolean getSmartTv() {
        return smartTv;
    }

    public void setSmartTv(@NotNull Boolean smartTv) {
        this.smartTv = smartTv;
    }

    public @NotNull Boolean getVoiceControl() {
        return voiceControl;
    }

    public void setVoiceControl(@NotNull Boolean voiceControl) {
        this.voiceControl = voiceControl;
    }

    public @NotNull Boolean getHdr() {
        return hdr;
    }

    public void setHdr(@NotNull Boolean hdr) {
        this.hdr = hdr;
    }


}
