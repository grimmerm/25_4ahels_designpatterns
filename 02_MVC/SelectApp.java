public class SelectApp {

    private JFrame frame;
    private SelectModel model;
    private SelectView selectView;

    SelectApp(final SelectModel _model) {
        this.model = _model;

        frame = new JFrame("Selection");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        selectView = new SelectView(model);
        contentPane.add(selectView, BorderLayout.CENTER);
        frame.setLocation(100, 100);
        frame.setSize(300, 320);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SelectApp(new SelectModel());
        });
    }
}
