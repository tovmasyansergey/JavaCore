package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', 'b', ' ', ' ', ' '};
        int probelCount = 0;
        int probelCount2 = 0;



        for (char c : spaceArray) {
            if (c == ' ') {
                probelCount++;
            } else {
                break;
            }


        }

        for (int i = spaceArray.length - 1; i > 0; i--) {
            if (spaceArray[i] == ' ') {
                probelCount2++;
            } else {
                break;
            }

        }
        char[] result = new char[spaceArray.length - probelCount2 - probelCount];
        for (int i = 0; i < 1; i++) {
            for (int j = probelCount; j <= spaceArray.length - probelCount2 - 1; j++) {


                result[i] = spaceArray[j];
                System.out.print(result[i]);
            }


        }

    }
}
