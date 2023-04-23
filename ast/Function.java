package ast;

import java.util.Iterator;
import java.util.List;

public class Function extends Body {
    private String fname;
    private List<String> pnames;

    public Function(String fname, List<String> pnames) {
        this.fname = fname;
        this.pnames = pnames;
    }

    public String getFname() {
        return fname;
    }

    public List<String> getParameterNames() {
        return pnames;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("function ");
        str.append(fname);
        str.append("(");
        Iterator<String> parit = pnames.iterator();
        if (parit.hasNext()) {
            str.append(parit.next());
            while (parit.hasNext()) {
                str.append(", ");
                str.append(parit.next());
            }
        }
        str.append(")\n");
        str.append(super.toString());
        str.append("end\n");
        return str.toString();
    }
}
