package app.termora.geo;

import java.io.InputStream;

public class GeoLibrary {
    public static InputStream getInputStream() {
        return GeoLibrary.class.getClassLoader().getResourceAsStream("/GeoLite2/GeoLite2-Country.mmdb");
    }
}
