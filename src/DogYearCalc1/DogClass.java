package DogYearCalc1;

public class DogClass {
    public static String DogClassCalc(int age, int weight){
        switch(""){
            default:{
                if(age < 2 && weight < 21){
                    return "small pup";
                }
                else if(age > 1 && weight < 21){
                    return "small boi";
                }
                else if(age > 1 && weight < 51){
                    return "medium boi";
                }
                else if(age > 1 && weight < 200){
                    return "Big boi";
                }
                else if(age < 2 && weight < 51){
                    return "chunky pup";
                }
                else if(age < 2 && weight > 50){
                    return "bear cub";
                }
                else if(weight < 500){
                    return "BEAR!, ok that is definitely a bear I don't know what you're talking about";
                }
                else if(weight > 499){
                    return "wtf";
                }

            }
        }
        return null;
    }
}
