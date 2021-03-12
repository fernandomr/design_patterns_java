package command01.solution;

public class ClearTextCommand extends AbstractCommand {
	
	private String undoText = "";
	
	public ClearTextCommand(TextEditor textEditor) {
		super(textEditor);
	}
	
	@Override
	public void action() {
		// first back up the undo text
		this.undoText = this.getTextEditor().getText();
		this.getTextEditor().setText("");
		
	}
	
	@Override
	public void undo() {
		this.getTextEditor().setText(this.undoText);
	}

}
