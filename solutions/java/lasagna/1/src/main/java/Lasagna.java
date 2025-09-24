public class Lasagna {
        // TODO: define the 'expectedMinutesInOven()' method
        public static int expectedMinutesInOven(){
            return 40;
        }

        // TODO: define the 'remainingMinutesInOven()' method
        public static int remainingMinutesInOven(int a){
            return 40 - a;
        }

        // TODO: define the 'preparationTimeInMinutes()' method
        public static int preparationTimeInMinutes(int camada){
            return camada * 2;
        }

        // TODO: define the 'totalTimeInMinutes()' method
        public static int totalTimeInMinutes(int camadas, int tempo){
            return (camadas * 2) + tempo;
        }
    }
