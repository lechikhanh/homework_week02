package week_02;
	class Students {
	private String name;
    private int age;
    private String address;
    private double mathScore;
    private double literatureScore;
    private double englishScore;
    public Students (String name, int age, String address, double mathScore, double literatureScore, double englishScore) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mathScore = mathScore;
        this.literatureScore = literatureScore;
        this.englishScore = englishScore;
    }
    public double calculateAverage() {
        return (mathScore + literatureScore + englishScore) / 3;
    }
    public void displayInfo() {
    	System.out.println("* ");
        System.out.println("Học sinh: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Điểm Toán: " + mathScore);
        System.out.println("Điểm Văn: " + literatureScore);
        System.out.println("Điểm Anh: " + englishScore);
        System.out.println("Điểm trung bình: " + calculateAverage());
    }
}
	public class bai5 {
    public static void main (String[] args) {
        Students s1 = new Students("Phạm Đăng Khoa", 17, "147 Lê Đại Hành, Đà Nẵng", 8, 7.8, 10.0);
        Students s2 = new Students("Trần Thị Diễm My", 17, "298 Trường Chinh, Quảng Nam",  5, 6.5, 8.2);
        Students s3 = new Students("Trần Ngọc Bảo Trân", 17, "k38/08 Phạm Nhữ Tăng, Đà Nẵng", 8, 6, 9);
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}

