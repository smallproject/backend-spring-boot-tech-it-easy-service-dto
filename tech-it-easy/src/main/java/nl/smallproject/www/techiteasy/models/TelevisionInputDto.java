package nl.smallproject.www.techiteasy.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class TelevisionInputDto {

    @NotBlank
    @Size(min = 3, max = 255)
    private String name;

    @NotBlank
    @Size(min = 3, max = 255)
    private String brand;

    private double price;

    private int currentStock;

    private double height;

    private double width;

    @NotBlank
    @Size(min = 3, max = 255)
    private String screenQuality;

    @NotBlank
    @Size(min = 3, max = 255)
    private String screenType;

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

    @NotNull
    private Boolean wifi;

    @NotNull(message = "smartTV mag niet null zijn")
    private Boolean smartTv;

    @NotNull
    private Boolean voiceControl;

    @NotNull
    private Boolean hdr;

}
