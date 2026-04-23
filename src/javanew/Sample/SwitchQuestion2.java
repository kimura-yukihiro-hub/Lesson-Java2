package javanew.Sample;

public class SwitchQuestion2 {
	public static void main (String[] args) {
		String season = "Spring";
		
		switch (season) {
		case "Spring":
			System.out.println("花が咲く季節です");
			break;
		case "Summer":
			System.out.println("暑い季節です");
			break;
		case "Autumn":
			System.out.println("紅葉の季節です");
			break;
		case "Winter":
			System.out.println("寒い季節です");
			break;
			default:
				System.out.println("不明な季節です");
		}
	}

}
