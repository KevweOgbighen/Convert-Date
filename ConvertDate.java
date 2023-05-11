import java.util.Scanner;

public class ConvertDate {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner (System.in);
		System.out.print("Enter date to be converted: ");
        String date = sc.nextLine();

        String d_0 = date.trim();

        int index1 = d_0.indexOf(" ");
        int index2 = d_0.lastIndexOf(" ");

        String firstLet = d_0.substring(0,1);
        String otherLet = d_0.substring(1);
        String d_1 = firstLet.trim().toUpperCase() + otherLet.trim().toLowerCase();

        String d_2 = d_1.trim().substring(0, index1);
        String d_3 = d_0.trim().substring(index1 + 1, index1 + 4);
        String d_4 = d_0.trim().substring(index2 + 1);

        System.out.println("Converted date: " + d_3 + " " + d_2 + " " + d_4);
		
	}

}
