package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter {

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String actual : billItems) {
            String[] temp = actual.split(";");
            int part1 = Integer.parseInt(temp[1]);
            int part2 = Integer.parseInt(temp[2]);
            sb.append(temp[0]).append(", ")
                    .append(temp[2]).append(" * ").append(temp[1])
                    .append(" = ").append(part1 * part2).append(" Ft").append("\n");
        }
        return sb.toString();
    }
}
