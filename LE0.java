/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class Juet
{
	int age;
	String name;
	
	public void SetageAndname(int a, String n){
	    this.age=a;
	    this.name=n;
	}
	
	public void getageandname(){
	    System.out.println(name+ " age "+age);
	}
}

public class LE0
{
	public static void main(String[] args) {
		Juet obj = new Juet();
		obj.SetageAndname(49, "Gian");
		obj.getageandname();
	}
}
