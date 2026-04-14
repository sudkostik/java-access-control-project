
public class Account {
	private String hesapNo;
	private double bakiye;
	private String isim;
	
	private String email;
	
	private String telefonNo;
	
	
	public Account(String isim, String email, String telefonNo) {
		/*this.isim=isim;
		this.email=email;
		this.telefonNo= telefonNo;
		
		this.bakiye=0.0;
		this.hesapNo="bilgi yok";
		*/
		this("bilgi yok",0.0,isim,email,telefonNo);
		
	}
	public Account(String hesapNo,double bakiye, String isim,String email,String telefonNo) { //method overloading
		this.hesapNo=hesapNo;
		this.bakiye=bakiye;
		this.isim=isim;
		this.email=email;
		this.telefonNo=telefonNo;
	}
	
	
	
	
	
	
	
	
	public void paraYtir(double miktar) {
		bakiye+= miktar;
		System.out.println("yeni bakiye="+bakiye);
	}
	public void bilgileriGoster() {
		System.out.println("Hesap No : " + this.hesapNo);
	}
	
	
	
	
	public void paraCekme(double miktar) {
		if(miktar>1500) {
			System.out.println("bir günde bu kadar para çekemzsin");
		}
		if(bakiye-miktar<0) {
			System.out.println("yeterli bakiye yok");
			
		}else {
			bakiye -= miktar;
			System.out.println("yebi bakiye: "+bakiye);
			
			
		}
	}
	
	public String getHesapNo() {
		return hesapNo;
		
		
	}
	
	
	public double getBakiye() {
		return bakiye;
	}
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefonNo() {
		return telefonNo;
	}
	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}
	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}
	

}
