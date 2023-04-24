package ast;

import java.util.Map;

public class Switch extends Sequence {
    private final Map<Const, Sequence> cases;
    private final Sequence def;
    private final String target;

    public Switch(Program prog, String target, Sequence def, Map<Const, Sequence> cases) {
        super(prog);
        this.cases = cases;
        this.def = def;
        this.target = target;
    }

    @Override
    public void execute() {
        Const target_val = new Const(this.program.getVariable(target).toString());
        try {
            boolean start = false;
            for (var setItem : cases.entrySet()) {
                if (!start && setItem.getKey().equals(target_val)) {
                    start = true;
                }
                if (start) {
                    setItem.getValue().execute();
                }
            }
            def.execute();
        } catch (Breaking ignored) {
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("switch (")
                .append(target)
                .append(" ) {");
        if (!cases.isEmpty()) {
            for (var setItem : cases.entrySet()) {
                stringBuilder.append("case ")
                        .append(setItem.getKey().toString())
                        .append(" : ")
                        .append(setItem.getValue().toString());
            }
            stringBuilder.append("default: ")
                    .append(def.toString())
                    .append("\n}\n");
        }
        return stringBuilder.toString();
    }
}
