package syntaxclass16;


public class InstanceVariables {

		String name="John";//instance variable

		public static void main(String[] args) {
			
			String name="Yunus";
			System.out.println(name);//-->yunus because this variable inside of main method
			
			InstanceVariables object=new InstanceVariables();// we can access now
			System.out.println(object.name);                 //--->John
			
			object.name="Ali";
			System.out.println(name);
			System.out.println(object.name);
			
			//change value of local variable
			name="Farid";            // we can re assign
			System.out.println(name);//--->Farid
			}
	}
