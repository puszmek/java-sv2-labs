package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {

    private List<DnsEntry> dnsEntries = new ArrayList<>();

    public void addEntry(String hostName, String hostIp) {
        if (containsHostName(hostName) || containsHostIp(hostIp)) {
            throw new IllegalArgumentException("Already exists");
        }
        dnsEntries.add(new DnsEntry(hostName, hostIp));
    }

    public void removeEntryByName(String name) {
        if (containsHostName(name)) {
            DnsEntry dnsEntry = getDnsEntryByName(name);
            dnsEntries.remove(dnsEntry);
        }
    }

    public void removeEntryByIp(String ip) {
        if (containsHostIp(ip)) {
            DnsEntry dnsEntry = getDnsEntryByIp(ip);
            dnsEntries.remove(dnsEntry);
        }
    }

    public String getIpByName(String name) {
        DnsEntry dnsEntry = getDnsEntryByName(name);
        return dnsEntry.hostIp;
    }

    public String getNameByIp(String ip) {
        DnsEntry dnsEntry = getDnsEntryByIp(ip);
        return dnsEntry.hostName;
    }

    private class DnsEntry {
        private String hostName;
        private String hostIp;

        public DnsEntry(String hostName, String hostIp) {
            this.hostName = hostName;
            this.hostIp = hostIp;
        }
    }

    private boolean containsHostName(String name) {
        for (DnsEntry actual : dnsEntries) {
            if (actual.hostName.equals(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean containsHostIp(String ip) {
        for (DnsEntry actual : dnsEntries) {
            if (actual.hostIp.equals(ip)) {
                return true;
            }
        }
        return false;
    }

    private DnsEntry getDnsEntryByName(String name) {
        for (DnsEntry actual : dnsEntries) {
            if (actual.hostName.equals(name)) {
                return actual;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    private DnsEntry getDnsEntryByIp(String ip) {
        for (DnsEntry actual : dnsEntries) {
            if (actual.hostIp.equals(ip)) {
                return actual;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }
}
