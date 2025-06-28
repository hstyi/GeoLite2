package app.termora.geo;

import java.io.InputStream;

public class GeoLibrary {
    public static InputStream getInputStream() {
        return getInputStream("/GeoLite2/GeoLite2-Country.mmdb");
    }


    public static InputStream getInputStream(String name) {
        return GeoLibrary.class.getResourceAsStream(name);
    }
}
