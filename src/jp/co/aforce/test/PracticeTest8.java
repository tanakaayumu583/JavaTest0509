package jp.co.aforce.test;

public class PracticeTest8 {

	//練習問題1
	void printHello() {
		System.out.println("Hello");
	}

	//練習問題2

	void printRandomMessage() {

		int n = (int) (3 * Math.random());
		String message = "";

		switch (n) {
		case 0:
			message = "こんばんは";
			break;
		case 1:
			message = "こんにちは";
			break;
		case 2:
			message = "おはよう";
			break;
		}
		System.out.println(message);
	}

	//練習問題3

	void printMessage(String message) {
		System.out.println(message);
	}

	//練習問題4

	void printMessage(String message, int count) {
		for (int i = 1; i <= count; i++) {
			System.out.println(message);
		}

	}

	//練習問題5

	void printRectangleArea(double height, double width) {
		System.out.println(height * width);
	}

	//練習問題6

	String getWeatherForecast() {
		int when_num = (int) (3 * Math.random());
		int weather_num = (int) (4 * Math.random());
		String when = "";
		String weather = "";

		switch (when_num) {
		case 0:
			when = "今日";
			break;
		case 1:
			when = "明日";
			break;
		case 2:
			when = "明後日";
			break;
		}

		switch (weather_num) {
		case 0:
			weather = "晴れ";
			break;
		case 1:
			weather = "曇り";
			break;
		case 2:
			weather = "雨";
			break;
		case 3:
			weather = "雪";
			break;
		}

		return (when + "の天気は" + weather + "でしょう。");
	}

	//練習問題7
	boolean isEvenNumber(int value) {
		return (value % 2 == 0);
	}

	//練習問題8
	String getMessage(String name, boolean isKid) {
		String message = "";
		if (isKid) {
			message = "ちゃん";
		} else {
			message = "さん";
		}
		return ("こんにちは。" + name + message + "。");
	}

	//練習問題9
	String getLongestString(String[] array) {
		int array_length = array.length;
		int maximum_length_index = 0;
		for (int i = 0; i < array_length; i++) {
			if (maximum_length_index <= array[i].length()) {
				maximum_length_index = i;
			}
		}
		return array[maximum_length_index];
	}

	//練習問題10
	boolean isAdult(Person person) {
		
		return(person.getAge() >= 20);
	}
}
