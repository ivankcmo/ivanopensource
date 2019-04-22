package DogYearCalc1;
import static DogYearCalc1.DogClass.DogClassCalc;

public class DogYearCalc {

    public static void main(String[] args) {
        CheckDog("Fido",12,20);
        CheckDog("A'Ayronn", 2, 25);
        CheckDog("Bob Boberson",6, 51);
        CheckDog("Clifford The Big ASF Red Dog",5,2000);
        CheckDog("Denise The Menace",1,51);
        CheckDog("Eeyore", 15, 30);
        CheckDog("Garfield", 40,40);
        CheckDog("House",50, 80000);
        CheckDog("Ivan", 27, 350);
        CheckDog("Jackie Chan", 65, 143);
        CheckDog("Kevin",1,21);
        CheckDog("Lenny The Tiny", 6, 200);
        CheckDog("Mouse", 1, 5);
        CheckDog("Naruto",1,21);
        CheckDog("Oreo",107,2);


        // not in here
    }
    // But out Here.

    // Grabs a Dog to send throughout the Dog Calc Program
    public static void CheckDog(String dogName, int age,int weight){
        int dogAIHY = DogYearCalc(age,weight);
        DogClassCalc(age,weight);
        System.out.println("Your dog " + dogName + " is " + dogAIHY + " Years Old" + " & he is a "
                + DogClassCalc(age,weight));

    }

    public static int DogYearCalc(int age , int weight){
        switch(age){
            case 1 : return 15;
            case 2 : return 24;
            case 3 : return 28;
            case 4 : return 32;
            case 5 : return 36;
            default: {
                if(age > 5 && weight < 21){
                    int rate = age - 5;
                    int humanYears = 4 * rate;
                    return humanYears + 36;
                    /*
                    Flat Method
                    return ((age - 5) * 4) + 36;
                    */
                }
                else if( age > 5 && weight < 51){
                    return ((age - 5) * 6) + 36;
                }
                else if( age > 5 && weight > 50){
                    return ((age - 5) * 9) + 36;
                }
            }
        }

        return 0;
    }



}





