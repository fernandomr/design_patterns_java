package command01.solution;

public class AddTextCommand extends AbstractCommand{
	
	private String undoText = "";
	
	private String textToAdd = "";
	
	public AddTextCommand(TextEditor editor, String textToAdd) {
		super(editor);
		this.textToAdd = textToAdd;
	}
	
	@Override
	public void action() {
		this.undoText = this.getTextEditor().getText();
		this.getTextEditor().setText(this.getTextEditor().getText() + this.textToAdd);
	}
	
	@Override
	public void undo() {
		this.getTextEditor().setText(this.undoText);
	}

}
