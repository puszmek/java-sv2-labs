package interfacerules.bill;

import java.util.List;

public class ComplexBillWriter implements BillWriter {

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String actual : billItems) {
            String[] temp = actual.split(";");
            int part1 = Integer.parseInt(temp[1]);
            int part2 = Integer.parseInt(temp[2]);
            sb.append(temp[0]).append("; ")
                    .append("darabszám: ").append(temp[2]).append(", ")
                    .append("egységár: ").append(temp[1]).append(", ")
                    .append("összesen: ").append(part1 * part2).append(" Ft").append("\n");
        }
        return sb.toString();
    }
}
