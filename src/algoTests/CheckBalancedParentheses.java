package algoTests;

public class CheckBalancedParentheses {
	
	public static void printBrackets(int open, int close, String output){
		if(open==0&&close==0){
			System.out.println(output);
		}
		
		if(open>0){
			printBrackets(open-1,close+1,output+"(");
		}
		
		if(close>0){
			printBrackets(open,close-1,output+")");
		}
	}

	public static void main(String[] args) {
		
		printBrackets(3,0,"");

	}

}
