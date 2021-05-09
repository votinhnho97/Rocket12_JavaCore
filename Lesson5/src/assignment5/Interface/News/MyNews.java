package assignment5.Interface.News;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {
	private static ArrayList<News> newsList;

	public static void main(String[] args) {
		newsList = new ArrayList<News>();

		while (true) {
			System.out.print("Nhập vào chức năng [1 - 4]: ");
			Scanner scan = new Scanner(System.in);
			int funcID = scan.nextInt();
			System.out.println();
			if (funcID == 1) {
				insertNews(scan);
			} else if (funcID == 2) {
				viewListNews();
			} else if (funcID == 3) {
				avgRate();
			} else {
				scan.close();
				break;
			}
		}
	}

	private static void insertNews(Scanner scan) {
		News n = new News();
		System.out.print("\nTitle = ");
		n.setTitle(scan.next());
		System.out.print("\nPublishDate = ");
		n.setPublishDate(scan.next());
		System.out.print("\nAuthor = ");
		n.setAuthor(scan.next());
		System.out.print("\nContent = ");
		n.setContent(scan.next());
		int[] rates = new int[3];
		for (int i = 0; i < rates.length; i++) {
			System.out.printf("\nNhập vào đánh giá thứ %d: ", i + 1);
			rates[i] = scan.nextInt();
		}
		n.setRates(rates);

		newsList.add(n);
	}

	private static void viewListNews() {
		for (News news : newsList) {
			news.display();
		}
	}

	private static void avgRate() {
		for (News news : newsList) {
			news.calculate();
			news.display();
		}
	}

	private static void exit() {

	}
}
