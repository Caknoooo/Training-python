import java.util.Scanner;

public class index{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String nama_barang;
		int price, much;

		System.out.print("Enter item Name : ");
		nama_barang = input.nextLine();
		if(nama_barang == ""){
			System.out.println("This item not found");
			System.exit(0);
		}

		System.out.print("Enter item price : ");
		price = input.nextInt();
		if(price <= 0)
			System.out.println("Undefined price");

		System.out.print("Enter the Numbers of item : ");
		much = input.nextInt();
		if (much < 0) {
			System.out.println("Undefined much of items");
		}

		System.out.println("---------------------------------");

		System.out.println("Name Product : " + nama_barang);
		System.out.println("Price total : " + (price * much));
        System.out.println("Kelar");
	}
}