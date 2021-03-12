package command01.solution;

import java.util.LinkedList;
import java.util.Queue;


public class TextEditor {
	
	private String text = "";
	
	private Queue<Command> queue = new LinkedList<Command>();
	
	private void executeAction(Command command) {
		command.action();
		this.queue.add(command);
	}
	
	private void undo() {
		Command command = this.queue.poll();
		if (command != null) {
			command.undo();
		}
	}
	
	public String getText() {
		return this.text;
	}
	
	public void setText(String tex) {
		this.text = tex;
	}
	
	public Queue<Command> getQueue(){
		return this.queue;
	}
	
	public void setQueue(Queue<Command> queue) {
		this.queue = queue;
	}

	public static void main(String[] args) {
		
		TextEditor editor = new TextEditor();
		
		editor.setText("1234");
		
		ClearTextCommand clearTextCommand = new ClearTextCommand(editor);
		
		editor.executeAction(clearTextCommand);
		
		System.out.println("[D] Text is: " + editor.getText());
		
		editor.undo();
		System.out.println("[D] Text is: " + editor.getText());
		
		AddTextCommand addTextCommand = new AddTextCommand(editor, "; adding this text;");
		editor.executeAction(addTextCommand);
		System.out.println("[D] Text is: " + editor.getText());
		
		addTextCommand.undo();
		System.out.println("[D] Text is: " + editor.getText());
		

	}

}
