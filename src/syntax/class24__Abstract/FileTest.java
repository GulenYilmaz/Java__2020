package syntax.class24__Abstract;

public class FileTest {

	public static void main(String[] args) {
		//new Phone();CE: cannot instantiate/create an object of Phone class because it is ABSTRACT
		
				FileTask javafile=new JavaFile();
				javafile.close();
				javafile.edit();
				javafile.open();
				
				
				FileTask wordfile=new WordFile();
                wordfile.close();
                wordfile.edit();
                wordfile.open();
                
                FileTask pdffile= new PDFFile();
                pdffile.close();
                pdffile.edit();
                pdffile.open();
                
			}
		}
