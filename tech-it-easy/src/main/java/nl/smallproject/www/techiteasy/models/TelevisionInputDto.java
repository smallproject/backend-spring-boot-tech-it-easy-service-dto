package nl.smallproject.www.techiteasy.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class TelevisionInputDto {

    @NotBlank
    @Size(min = 3, max = 255)
    private String name;

    @NotBlank
    @Size(min = 3, max = 255)
    private String brand;

    @NotBlank
    private double price;

    @NotBlank
    private int currentStock;

    @NotBlank
    private double height;

    @NotBlank
    private double width;

    @NotBlank
    @Size(min = 3, max = 255)
    private String screenQuality;

    @NotBlank
    @Size(min = 3, max = 255)
    private String screenType;

    @NotBlank
    private Boolean wifi;

    @NotBlank
    private Boolean smartTv;

    @NotBlank
    private Boolean voiceControl;

    @NotBlank
    private Boolean hdr;

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

    @NotBlank
    public double getPrice() {
        return price;
    }

    public void setPrice(@NotBlank double price) {
        this.price = price;
    }

    @NotBlank
    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(@NotBlank int currentStock) {
        this.currentStock = currentStock;
    }

    @NotBlank
    public double getHeight() {
        return height;
    }

    public void setHeight(@NotBlank double height) {
        this.height = height;
    }

    @NotBlank
    public double getWidth() {
        return width;
    }

    public void setWidth(@NotBlank double width) {
        this.width = width;
    }

    public @NotBlank String getScreenQuality() {
        return screenQuality;
    }

    public void setScreenQuality(@NotBlank String screenQuality) {
        this.screenQuality = screenQuality;
    }

    public @NotBlank String getScreenType() {
        return screenType;
    }

    public void setScreenType(@NotBlank String screenType) {
        this.screenType = screenType;
    }

    public @NotBlank Boolean getWifi() {
        return wifi;
    }

    public void setWifi(@NotBlank Boolean wifi) {
        this.wifi = wifi;
    }

    public @NotBlank Boolean getSmartTv() {
        return smartTv;
    }

    public void setSmartTv(@NotBlank Boolean smartTv) {
        this.smartTv = smartTv;
    }

    public @NotBlank Boolean getVoiceControl() {
        return voiceControl;
    }

    public void setVoiceControl(@NotBlank Boolean voiceControl) {
        this.voiceControl = voiceControl;
    }

    public @NotBlank Boolean getHdr() {
        return hdr;
    }

    public void setHdr(@NotBlank Boolean hdr) {
        this.hdr = hdr;
    }
}
