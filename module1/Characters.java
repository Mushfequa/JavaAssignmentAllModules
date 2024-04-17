package module1;

/*
 * Question8
*W.A.J.P to count the letters,spaces,numbers and other characters of an input
* string.
*/
public class Characters {
	public static void main (String []args){
	String name="mushfequa";
	count(name);

	}
	public static void count(String x){
	char[]ch=x.toCharArray();
	int letter=0;
	int space=0;
	int num=0;
	int other=0;
	for(int i=0;i<x.length();i++){
	if(Character.isLetter(ch[i])){
	letter++;
	}
	else if(Character.isDigit(ch[i])){
	num++;
	}
	else if(Character.isSpace(ch[i])){
	space++;
	}
	else{
	other++;
	}

	}
	System.out.println("letter:"+letter);
	System.out.println("number:"+num);
	System.out.println("space:"+space);
	System.out.println("other:"+other);
	}
	}


