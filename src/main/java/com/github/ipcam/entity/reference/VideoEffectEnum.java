package com.github.ipcam.entity.reference;

/**
 * VideoEffectEnum
 *
 * @author echils
 * @since 2018/12/21 9:23
 */
public enum VideoEffectEnum {

    BRIGHT("亮度"), //0-100
    CONTRAST("对比度"), //0-100
    SATURATION("饱和度"), //0-100
    HUE("色度"), //0-100
    SHARPNESS("锐度"); //0-100

    private String implication;

    VideoEffectEnum(String implication) {
        this.implication = implication;
    }

}
