public class SelectEvent extends EventObject {

    private final boolean selected;

    public SelectEvent(SelectModel source, boolean selected) {
        super(source);
        this.selected = selected;
    }

    public boolean isSelected() {
        return selected;
    }
}
