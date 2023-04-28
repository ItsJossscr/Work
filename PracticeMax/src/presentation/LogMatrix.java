package presentation;

public class LogMatrix {

	
	
	
	
	
	public char[][] newMatrix(int size){
		char[] mm= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		int rand=0;
		
		char result=' ';
		
		char max[][]=new char[size][size];
		
		
		
		for (int i=0;i<max.length;i++) {
			
			for(int j=0;j<max[0].length;j++) {
				rand= (int)(Math.random()*mm.length);
				result=mm[rand];
				
				
				max[i][j]=result;	
			}	
		}
		return max;
	}
	
	
	public String searchWord(char a[][],char word) {
		String result="";
		
		for (int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[0].length;j++) {
				
				if(a[i][j]==word) {
					int s=i+1;
					int l=j+1;
					
					result+="["+s+","+l+"]"+" ";
					
					
				}
				
				
				
			}
			
			
			
		}
		
		
		
		
		return result;
	}
	
	
	
	
	
	
public String fillMatrixToString(char matrix[][]){
		
		String result="";
		
		
		for (int i=0;i<matrix.length;i++) {
			
			for (int j=0;j<matrix[0].length;j++) {
	
				result+="["+matrix[i][j]+"]";
			}
			result+="\n";
		}
		return result;
	}
	
	
}
