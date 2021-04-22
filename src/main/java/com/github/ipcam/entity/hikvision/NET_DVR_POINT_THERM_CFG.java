package com.github.ipcam.entity.hikvision;

import com.sun.jna.Structure;


/**
 * ByteArrayStructure
 *
 * @author echils
 * @since 2020-03-19 13:42
 */
public class NET_DVR_POINT_THERM_CFG extends Structure {

    /**
     * The current temperature
     */
    public float fTemperature;

    /**
     * Point temperature measurement coordinates (in effect when the rule calibration type is point)
     */
    public NET_VCA_POINT struPoint = new NET_VCA_POINT();

    /**
     * Keep it, set it to 0
     */
    public byte[] byRes = new byte[120];

}
