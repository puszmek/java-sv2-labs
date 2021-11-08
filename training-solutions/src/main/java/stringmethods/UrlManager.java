package stringmethods;

public class UrlManager {

    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {
        this.protocol = getProtocolFromUrl(url);
        this.host = getHostFromUrl(url);
        this.port = getPortFromUrl(url);
        this.path = getPathFromUrl(url);
        this.query = getQueryFromUrl(url);
    }

    public boolean hasProperty(String key) {
        if (query != null && (query.startsWith(key + "=") || query.contains("&" + key + "="))) {
            return true;
        }
        return false;
    }

    public String getProperty(String key) {
        String[] properties = query.split("&");
        for (String property : properties) {
            String[] prop = property.split("=");
            if (prop[0].equals(key)) {
                return prop[1];
            }
        }
        return null;
    }

    private String getProtocolFromUrl(String url) {     // protocol://host:port/path?query-string
        int index = url.indexOf("://");
        return url.substring(0, index).toLowerCase();
    }

    private String getHostFromUrl(String url) {     // protocol://host:port/path?query-string
        String host;
        int startIndex = url.indexOf("://") + 3;
        int endIndex = url.indexOf(":", startIndex);
        if (endIndex == -1) {
            endIndex = url.indexOf("/", startIndex);
        }
        if (endIndex == -1) {
            host = url.substring(startIndex).toLowerCase();
        } else {
            host = url.substring(startIndex, endIndex).toLowerCase();
        }
        return host;
    }

    private Integer getPortFromUrl(String url) {     // protocol://host:port/path?query-string
        int startIndex = url.indexOf("://") + 3;
        startIndex = url.indexOf(":", startIndex);
        if (startIndex == -1) {
            return null;
        }
        int endIndex = url.indexOf("/", startIndex);
        if (endIndex == -1) {
            return Integer.valueOf(url.substring(startIndex + 1));
        }
        return Integer.valueOf(url.substring(startIndex + 1, endIndex));
    }

    private String getPathFromUrl(String url) {      // protocol://host:port/path?query-string
        int startIndex = url.indexOf("://") + 3;
        startIndex = url.indexOf("/", startIndex);
        if (startIndex == -1) {
            return "";
        }
        int endIndex = url.indexOf("?");
        if (endIndex == -1) {
            return url.substring(startIndex);
        }
        return url.substring(startIndex, endIndex);
    }

    private String getQueryFromUrl(String url) {     // protocol://host:port/path?query-string
        int startIndex = url.indexOf("?");
        if (startIndex == -1) {
            return "";
        }
        return url.substring(startIndex + 1);
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public static void main(String[] args) {

        UrlManager urlManager = new UrlManager("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");

        System.out.println("protocol: " + urlManager.getProtocol());
        System.out.println("host: " + urlManager.getHost());
        System.out.println("port: " + urlManager.getPort());
        System.out.println("path: " + urlManager.getPath());

        System.out.println("has format = " + urlManager.hasProperty("format"));
        System.out.println("has starttime: " + urlManager.hasProperty("starttime"));
        System.out.println("has endtime: " + urlManager.hasProperty("endtime"));

        System.out.println("format = " + urlManager.getProperty("format"));
        System.out.println("starttime = " + urlManager.getProperty("starttime"));
        System.out.println("endtime = " + urlManager.getProperty("endttime"));
    }
}
