packeage.review1;

class Person{

public static String uji = "氏";		//クラス変数
public static String na	= "名";
public String firstname;			//インスタンス変数
public String lastname;

	public static void main(String[] args){
		this.setLastname("渡辺");
		this.setFirstname("高志");
		this.showName();

		this.setLastname("和田");
		this.setFirstname("充史");
		this.showName();

		this.setLastname("渡辺");
		this.setFirstname("高志");
		this.showName();
	} 

	public String getFirstname(){
		return firstname;
	}

	public void setFirstname(String se){
		firstname = se;
	}
	
	public String getLastname(){
		return lastname;
	}

	public void setLastname(String se){
		lastname = se;
	}

	public void showName(){
		System.out.println("氏：" + lastname + "　" + "名：" + firstname);
	}
}

