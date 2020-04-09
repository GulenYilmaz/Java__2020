package syntax.class24__Abstract;
/*
 * Create a class File that will have the following 
 * behaviors: open, edit, close. Edit and close are
 *  implemented method while open is an abstract. 
 *  Create 3 subclasses: JavaFile, WordFile,
 *   PDFFile that will provide specific implementation
 *    of open behaviour: Example: to open .java file we
 *     need notepad++ or sublime text, to open .
 *     doc file we need Microsoft word to be installed
 *      etc
 */
public abstract class FileTask {
	
	//implemented methods
		public void close() {
			System.out.println("File can close");
		}
		
		public void edit() {
			System.out.println("File can edit");
		}
 
		public abstract void open();
}
class JavaFile extends FileTask {

	@Override
	public void open() {
		System.out.println("To open java file  need notepad ");
	}
	
}
class WordFile extends FileTask {

	@Override
	public void open() {
		System.out.println("To open wordFile sublime text ");	
	}
	
}
class PDFFile extends FileTask {

	@Override
	public void open() {
		System.out.println("To open Microsoft word to be installed");
	}
	
}