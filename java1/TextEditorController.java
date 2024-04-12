package Controllers;

import Models.TextEditorModel;
import Views.TextEditorView;
import java.io.File;
import java.io.IOException;

public class TextEditorController {
    private TextEditorView view;
    private TextEditorModel model;

    public TextEditorController(TextEditorView view, TextEditorModel model) {
        this.view = view;
        this.model = model;

        view.addSaveButtonListener(e -> {
            File file = view.showFileChooser("Save File");
            if (file != null) {
                try {
                    model.saveToFile(file);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        view.addLoadButtonListener(e -> {
            File file = view.showFileChooser("Load File");
            if (file != null) {
                try {
                    model.loadFromFile(file);
                    StringBuilder builder = new StringBuilder();
                    for (String line : model.getTextLines()) {
                        builder.append(line).append("\n");
                    }
                    view.setText(builder.toString());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        });
    }
}
