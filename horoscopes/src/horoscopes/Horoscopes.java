package horoscopes;

import java.util.Scanner;

public class Horoscopes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the month you were born: ");
        int mounth = scan.nextInt();
        System.out.print("enter the day you were born: ");
        int day = scan.nextInt();
        String horoscopes = "";
        boolean error = false;

        if (mounth == 1) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    horoscopes = "Capricorn";
                } else {
                    horoscopes = "Aquarius";
                }
            } else {
                error = true;
            }
        } else if (mounth == 2) {

            if (day >= 1 && day <= 28) {

                if (day <= 19) {
                    horoscopes = "Aquarius";
                } else {
                    horoscopes = "Pisces";
                }
            } else {
                error = true;
            }
        } else if (mounth == 3) {

            if (day >= 1 && day <= 31) {

                if (day <= 20) {
                    horoscopes = "Pisces";
                } else {
                    horoscopes = "Aries";
                }
            } else {
                error = true;

            }
        } else if (mounth == 4) {
            if (day >= 1 && day <= 30) {

                if (day <= 21) {
                    horoscopes = "Aries";
                } else {
                    horoscopes = "Taurus";
                }
            } else {

                error = true;

            }
        } else if (mounth == 5) {
            if (day >= 1 && day <= 31) {

                if (day <= 21) {
                    horoscopes = "Taurus";
                } else {
                    horoscopes = "Gemini";
                }
            } else {
                error = true;
            }
        } else if (mounth == 6) {

            if (day >= 1 && day <= 30) {

                if (day <= 22) {
                    horoscopes = "Gemini";
                } else {
                    horoscopes = "Cancer";
                }
            } else {
                error = true;
            }

        } else if (mounth == 7) {

            if (day >= 1 && day <= 31) {

                if (day < 22) {
                    horoscopes = "Cancer";
                } else {
                    horoscopes = "Leo";
                }
            } else {
                error = true;
            }

        } else if (mounth == 8) {

            if (day >= 1 && day <= 30) {

                if (day <= 22) {
                    horoscopes = "Leo";
                } else {
                    horoscopes = "Virgo";
                }
            } else {
                error = true;
            }
        } else if (mounth == 9) {

            if (day >= 1 && day <= 30) {

                if (day <= 22) {
                    horoscopes = "Virgo";
                } else {
                    horoscopes = "Libra";
                }
            } else {
                error = true;
            }

        } else if (mounth == 10) {
            if (day >= 1 && day <= 31) {

                if (day > 22) {
                    horoscopes = "Libra";
                } else {
                    horoscopes = "Scorpio";
                }
            } else {
                error = true;
            }

        } else if (mounth == 11) {
            if (day >= 1 && day <= 30) {

                if (day <= 21) {
                    horoscopes = "Scorpio";
                } else {
                    horoscopes = "Sagittarius";
                }
            } else {
                error = true;
            }
        } else if (mounth == 12) {
            if (day >= 1 && day <= 31) {

                if (day <= 21) {
                    horoscopes = "Sagittarius";
                } else {
                    horoscopes = "Capricorn";
                }
            } else {
                error = true;
            }
        } else {
            error = true;
        }

        if (error) {
            System.out.println("You entered incorrectly,please try again");
        } else {
            System.out.printf("Your zodiac sign is: %s", horoscopes);
        }
    }
}
