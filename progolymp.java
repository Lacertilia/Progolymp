import java.util.Scanner;

public class progolymp{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Antal banor?");
		int banor = scanner.nextInt();
		int partot = 0;
		int youtot = 0;
		int bana = 1;
		while(banor>=bana){
			if(bana%2 == 0){
				partot = partot + 3;
			}else if(bana%2 == 1){
				partot = partot + 2;
			}
			System.out.println("Bana " + bana + "?");
			hits = scanner.nextInt();
			if(hits>7){
				youtot = youtot + 7;
			}else {
				youtot = youtot + hits;
			}
			bana++;
			
		}
		int result = youtot - partot;
		System.out.println("Relsultat: " + result);
	}
}