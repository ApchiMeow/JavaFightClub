package Game;

public class Npc extends Character{
    //private enum type {target, merchant, citizen};
    private String dialog;
    public Npc(String name, double hp, String dialog){
        super(name, hp);
        setDialog(dialog);
    }

    public void setDialog(String dialog) {
        this.dialog = dialog;
    }

    public String getDialog() {
        return dialog;
    }
    @Override
    public String toString(){
        return String.format("%s, говорит: %s", super.toString(), getDialog());
    }
}