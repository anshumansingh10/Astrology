
import java.util.*;

public class First {
	public static void main(String[] args) {
		System.out.println("WELCOME TO ANSHUMANS ASTROLOGY ");
		System.out.println("chintao ko hata Bhavisya kar pata ");
		// System.out.println(args);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name-> ");
		String name = sc.nextLine();
		System.out.println("Enter the gender->");
		String gender = sc.nextLine();
		// System.out.println("Enter the age");
		// int age = sc.nextInt();
		System.out.println("Day of birth");
		int day = sc.nextInt();
		System.out.println("Mounth of birth");
		int Mounth = sc.nextInt();
		System.out.println("Year of birth");
		int Year = sc.nextInt();
		System.out.println("Current Year");
		int currYear = sc.nextInt();
		int age = currYear - Year;
		System.out.println("Your age is =" + age);
		dateOfmarrige(day, Mounth, Year, age);
		currentYearstatus(day, Mounth, currYear);
	}

	public static void dateOfmarrige(int Day, int Mounth, int Year, int Age) {
		if (Age > 90) {
			System.out.println("***data is not ok***");

		} else if (Age > 25 && Age < 30) {
			System.out.println("****->you are at perfect agr to start a new life<-**** ");
		} else if (Age >= 30 && Age < 36) {
			System.out.println("+-+-+-*you should try to find your match as soon as possible*-+-+-+");
		} else {
			System.out.print("\\**you are alredy late to start a new life**//");
		}
		int d = oneDigit(Day);
		int m = oneDigit(Day);
		int y = oneDigit(Day);
		int c = d + m + y;
		int lifeNo = oneDigit(c);
		System.out.println("your life number is =" + lifeNo);

		int k = d + 9 + 9;
		int q = lifeNo + 9 + 9;
		int mAge = Math.min(k, q);
		if (mAge < Age) {
			if (k <= q) {
				k = k + lifeNo;
			} else {
				q = q + lifeNo;
			}
		}
		System.out.println("perfect time for your marrige is between age of " + k + "to" + q);
		yourPersonality(lifeNo);
		sutableJob(d);

	}

	public static int oneDigit(int number) {
		int sum = 0;

		while (number != 0) {
			// Extract the last digit
			int digit = number % 10;
			// Add the digit to the sum
			sum += digit;
			// Remove the last digit
			number /= 10;
		}
		return sum;
	}

	public static void yourPersonality(int numL) {
		if (numL == 1) {
			System.out.println("1: The ultimate individual\n");
			System.out.println("Kewords that you are\n");
			System.out.println(
					"Independent,\n unique,\n self-motivated, \n proactive, \n courageous, \n entrepreneurial\n");
			System.out.println(
					"You carve out your own path in life. \n you’re especially drawn to careers that involve innovation, \n management, entrepreneurial ventures, life coaching, property development,\n  leadership, and/or business. \n You're a go-getter!");
		} else if (numL == 2) {
			System.out.println("2: The collaborative counselor\n");
			System.out.println("Kewords that you are\n");
			System.out.println(" Peaceful,\n intuitive,\n wise,\n compassionate,\n collaborative,\n understanding");
			System.out.println(
					"You’re an understanding individual who values harmonious relationship \n in life and helps others willingly. You're a natural people person. Careers\n involving therapy, healing, teaching, esoteric practices, administration,\n accountancy, and mediation appeal to you.");
		} else if (numL == 3) {
			System.out.println("3: The outgoing creative\n");
			System.out.println("Kewords that you are\n");
			System.out.println("Funny,\n creative, \n charismatic, \n expressive, \n social,\n imaginative");
			System.out.println(
					"You’re a confident individual who thrives on being with others and\n having an ~audience~. You’re drawn to careers involving acting, writing,\n teaching, travel, therapy, hospitality, personal care, and sales. People are \n just drawn to your natural talents.");
		} else if (numL == 4) {
			System.out.println("4: The practical worker\n");
			System.out.println("Kewords that you are\n");
			System.out.println("Conscientious, \n grounded,\n  pragmatic, \n reliable, \n determined,\n  practical\n");
			System.out.println(
					"You’re a dedicated and responsible individual who works hard to achieve\n a goal and never gives up. No matter what it is, you never give up. You’re \n  drawn to careers in accountancy, auditing, editing, property, law \n enforcement, engineering, and analysis.\n");
		} else if (numL == 5) {
			System.out.println("5: The jack of all trades\n");
			System.out.println("Kewords that you are\n");
			System.out.println(
					" Versatile, \n charismatic,\n restless,\n  resourceful, \n communicative,\n  adventurous\n");
			System.out.println(
					"Youre a multitalented individual who craves freedom, adventure, and\n excitement. You’re drawn to careers in and around events, PR, journalism,\n teaching, travel, consulting, and sales. You might dabble in a number of \ncareers over your life instead of having one tried-and-true path.\n");
		} else if (numL == 6) {
			System.out.println("6: The supportive adviser\n");
			System.out.println("Kewords that you are\n");
			System.out.println("Nurturing,\n compassionate, \n supportive, \n helpful, \n perceptive, \n wise\n");
			System.out.println(
					"You’re a perfection-seeking individual who wants to help \nmake their corner of the world a nicer place. You’re drawn to careers involving \n therapy, healing, nutrition, beauty, fashion, interior decorating,\n  teaching, counseling, and hospitality. Others always want your advice!\n");

		} else if (numL == 7) {
			System.out.println("7: The clear-eyed philosopher\n");
			System.out.println("Kewords that you are\n");
			System.out.println(
					" Analytical, \nquestioning, \n intellectual, \n intuitive, \n problem-solving,\n  philosophical\n");
			System.out.println(
					"You’re a truth-seeking individual who has a natural instinct for \nuntangling big problems and seeking answers to life’s big questions.\n You’re drawn to careers involving innovation, engineering, technology, \ndigital communications, strategy, esoteric practices, and journalism. You\n  have a mind for big thoughts and big ideas.\n");

		} else if (numL == 8) {
			System.out.println("8: The moneymaker\n");
			System.out.println("Kewords that you are\n");
			System.out.println(
					" Driven,\n ambitious,\n strong,\n materialistic,\n proud,\n organized,\nconscientious,\n entrepreneurial");
			System.out.println(
					"You’re dedicated to achieving the goals you set for yourself \nearly on in life. You’re drawn to careers in business, property development, \nleadership, the law, project management, banking, finance, and property. \n You have a mind for money and a natural talent for managing a budget.");

		} else if (numL == 9) {
			System.out.println("9:The understanding caregiver\n");
			System.out.println("Kewords that you are\n");
			System.out.println("Generous, \nkind, \nhelpful, \n(very) creative, \npatient,\n passionate,\n caring");
			System.out.println(
					"You’re a just and caring individual who wants to help the planet and other people.\n You’re drawn to careers in teaching, counseling, \nsocial work, law, the creative arts, HR, government work, and fitness. You just\n want to make the world a better place");
		}
	}

	public static void currentYearstatus(int day, int mounth, int curryear) {
		int total = 0;
		int d = oneDigit(day);
		int m = oneDigit(mounth);
		int y = oneDigit(curryear);
		total = d + m + y;
		int persnalyear = oneDigit(total);
		// System.out.print(persnalyear);
		if (persnalyear == 2 || persnalyear == 4 || persnalyear == 7 || persnalyear == 9) {
			System.out.println(" YOUR  YAER IS GOING TO BE ==\n");

			// Bhupendra Pratap singhSystem.out.println(\n);
			System.out.println("* You need to work hard this year. \n");
			System.out.println("* this year going to be full of ups and down for you\n");
			System.out.println(
					"* you have to give your 100% for result but you are not that fortunate to get the desired result\n");
			System.out.println(
					"*you may loss your motivation ,you may feel dipressed,you are going to feel lost but you have to do thighs whithout gettibg distracted that will lead you to succes at last\nBhupendra");
			System.out.println(
					"*thisyear you have to work hard with true dedication because hardwork never goes in vain\n");
			System.out.println(
					"*this is not your year so you are advised not to take too much risk ,do not involve in any kind of matter.\n");
		} else {
			System.out.println(" YOU YAER IS GOING TO BE ==\n");

			System.out.println(
					"this is your year ,you are gooing to get soo many good things,success is going to be yours.\n");
			System.out.println("this year your hardwork is going to pay you off\n");
			System.out.println("this year is you will exprence the true joy of life \n");
			System.out.println("you are going to positiv and calm ,wil able to let go all youe worries\n ");

		}
	}

	public static void sutableJob(int numj) {
		if (numj == 1) {
			System.out.println("YOUR CAREER GRAPH INDICATES\n");
			System.out.println("you are born LEADER, risk taker ,have never-say-die Attitude\n");
			System.out.println("Business is the best\n");

		}

		else if (numj == 2) {
			System.out.println("YOUR CAREER GRAPH INDICATES\n");
			System.out.println("you are creative ,a very good diplomat,do excel in realted fild\n");
			System.out.println("Arts,acting,fashon is going to be your field to be favorable\n");
		} else if (numj == 3) {
			System.out.println("YOUR CAREER GRAPH INDICATES\n");
			System.out.println("you have strong mentality ,good with numbers,have patient\n");
			System.out.println("banking & finance related field is best for you\n");
		} else if (numj == 4) {
			System.out.println(
					"considered unconventional and unique, risk takers but often put themselves in trouble \n ");
			System.out.println(" Art and acting can bring you success.\n");
		} else if (numj == 5) {
			System.out.println("YOUR CAREER GRAPH INDICATES\n");
			System.out.println(
					"Blessed with good communication skills ,brilliant stock market traders. \nThey have the power to convince people easily\n");
			System.out.println("Technology, sports, marketing or sales are the best areas to go for.\n");
		} else if (numj == 6) {
			System.out.println("YOUR CAREER GRAPH INDICATES\n");
			System.out.println("you have charismatic personality,soft spoken ,good communicater\n");
			System.out.println(
					" Ideal jobs for them should be in hotel or restaurant business,\n luxury or entertainment industry, which could bring them glamour and fame.");
		} else if (numj == 7) {
			System.out.println("YOUR CAREER GRAPH INDICATES\n");
			System.out.println(
					" very well in the field of research, have unique innovative and creative abilities , out-of-the-box ideas brings success.\n");
			System.out.println("Research related fields are best \n");
		}

		else if (numj == 8) {
			System.out.println("YOUR CAREER GRAPH INDICATES\n");
			System.out.println(
					"They are quite simple and straightforward. They are also very hardworking which brings them success even if its a little late.\n ");
			System.out.println(
					" Politics, steel and metal industry, real estate and finance are some of the sectors they should look at\n");
		} else if (numj == 9) {
			System.out.println("YOUR CAREER GRAPH INDICATES\n");
			System.out.println(" sportspersons ,have a lot of courage in them.\n");
			System.out.println("good career options include defence, chemicals or real estate.\n");

		}
	}

}
