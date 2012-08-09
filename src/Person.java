//package.review1;

public class Person{

	public static String uji = "氏";		//クラス変数
	public static String na	= "名";
	public String firstname;			//インスタンス変数
	public String lastname;

	public static void main(String[] args){
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setFirstname("高志");
		p1.setLastname("渡辺");
		p1.showName();

		p2.setFirstname("充史");
		p2.setLastname("和田");
		p1.showName();
	}

	
	
	
	//こっからメソッド（動作の内容）群がはじまる
	public void setFirstname(String fSt){
		this.firstname = fSt;
	}
	
	public String getFirstname(){
		return this.firstname;
	}
	
	
	public void setLastname(String lSt){
		this.lastname = lSt;
	}
	
	public String getLastname(){
		return this.lastname;
	}


	public void showName(){
		System.out.println("氏：" + lastname + "　" + "名：" + firstname);
	}
}

