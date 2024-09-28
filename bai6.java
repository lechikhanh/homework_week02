package week_02;
	class Companys {
		private String name;
	    private String address;
	    private double cost;
	    private double income;
	    public Companys (String name, String address, double cost, double income) {
	        this.name = name;
	        this.address = address;
	        this.cost = cost;
	        this.income = income;
	    }
	    public double Benefit() {
	        return income - cost;
	    }
	    public void displayInfo() {
	    	System.out.println("* ");
	        System.out.println("Tên công ty: " + name);
	        System.out.println("Địa chỉ: " + address);
	        System.out.println("Chi phí: " + cost);
	        System.out.println("Thu nhập: " + income);
	        System.out.println("Lợi ích: " + Benefit());		        
	    }
	}		
	public class bai6 {
	    public static void main(String[] args) {
	        Companys c1 = new Companys("Thăng Long", "364 Thăng Long, Hà Nội", 15000, 1000000);
	        Companys c2 = new Companys("Thành Phát", "124 Đống Đa, Đà Nẵng", 50000, 1200000);
	        Companys c3 = new Companys("Bạch Đằng", "572 Điện Biên Phủ, Đà Nẵng", 75000, 1000000);
	        c1.displayInfo();
	        c2.displayInfo();
	        c3.displayInfo();
	    }

}


