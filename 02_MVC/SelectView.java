public class SelectView extends JComponent {

    private static final int X = 80, Y = 80, W = 100, H = 100;
    private SelectModel model;

    public SelectView(SelectModel model) {
        this.model = model;
        this.addMouseListener(selectionHandler);

        /* Adding listeners for handling selection changes */
        /* TODO */
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        /* Get selection state and set paint color to Color.WHITE or Color.DARKGRAY
           (using method call Graphics#setColor(Color c)) */
        /* TODO */
        g.fillRect(X, Y, W, H);
    }

    /* Implementation of listeners for selection change events */ 
    /* TODO */

    
    /* Implementation of listeners for mouse click events */ 
    private MouseListener selectionHandler = new MouseAdapter() {

        @Override
        public void mouseClicked(MouseEvent e) {
            /* TODO */
        }     
    };
}
