package command01.solution;

public abstract class AbstractCommand implements Command {
	
	private TextEditor textEditor;

	public AbstractCommand(TextEditor editor) {
		this.textEditor = editor;
	}
	
	public TextEditor getTextEditor() {
		return textEditor;
	}

}
