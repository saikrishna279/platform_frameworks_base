/*
 * Copyright (C) 2015 The CyanogenMod Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.android.internal.util.cm;

import java.util.ArrayList;

public class QSConstants {
    private QSConstants() {}

    public static final String TILE_WIFI = "wifi";
    public static final String TILE_BLUETOOTH = "bt";
    public static final String TILE_INVERSION = "inversion";
    public static final String TILE_DND = "dnd";
    public static final String TILE_CELLULAR = "cell";
    public static final String TILE_AIRPLANE = "airplane";
    public static final String TILE_ROTATION = "rotation";
    public static final String TILE_FLASHLIGHT = "flashlight";
    public static final String TILE_LOCATION = "location";
    public static final String TILE_CAST = "cast";
    public static final String TILE_HOTSPOT = "hotspot";
    public static final String TILE_BRIGHTNESS = "brightness";
    public static final String TILE_SCREEN_OFF = "screenOff";
    public static final String TILE_SCREENSHOT = "screenshot";
    public static final String TILE_VOLUME = "volume";
    public static final String TILE_HEADS_UP = "headsup";
    public static final String TILE_SCREEN_TIMEOUT = "timeout";
    public static final String TILE_USB_TETHER = "usb_tether";
    public static final String TILE_NAVIGATION_BAR = "navigation_bar";

    // Order matters
    protected static final ArrayList<String> TILES_DEFAULT = new ArrayList<String>();

    static {
        TILES_DEFAULT.add(TILE_WIFI);
        TILES_DEFAULT.add(TILE_BLUETOOTH);
        TILES_DEFAULT.add(TILE_DND);
        TILES_DEFAULT.add(TILE_CELLULAR);
        TILES_DEFAULT.add(TILE_AIRPLANE);
        TILES_DEFAULT.add(TILE_ROTATION);
        TILES_DEFAULT.add(TILE_FLASHLIGHT);
        TILES_DEFAULT.add(TILE_LOCATION);
        TILES_DEFAULT.add(TILE_CAST);
    }

    protected static final ArrayList<String> TILES_AVAILABLE = new ArrayList<String>();

    static {
        TILES_AVAILABLE.addAll(TILES_DEFAULT);
        TILES_AVAILABLE.add(TILE_INVERSION);
        TILES_AVAILABLE.add(TILE_HOTSPOT);
        TILES_AVAILABLE.add(TILE_BRIGHTNESS);       
        TILES_AVAILABLE.add(TILE_SCREEN_OFF);
        TILES_AVAILABLE.add(TILE_SCREENSHOT);
	TILES_AVAILABLE.add(TILE_VOLUME); 
        TILES_AVAILABLE.add(TILE_HEADS_UP);
        TILES_AVAILABLE.add(TILE_SCREEN_TIMEOUT);    
        TILES_AVAILABLE.add(TILE_USB_TETHER);
        TILES_AVAILABLE.add(TILE_NAVIGATION_BAR);
    }
}
