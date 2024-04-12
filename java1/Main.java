import Controllers.TextEditorController;
import Models.TextEditorModel;
import Views.TextEditorView;

public class Main {
    public static void main(String[] args) {
        TextEditorView view = new TextEditorView();
        TextEditorModel model = new TextEditorModel();
        TextEditorController controller = new TextEditorController(view, model);

        view.setVisible(true);
    }
}