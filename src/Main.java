public class Main {
    public static void main(String[] args) {
        String[] badBabyNames = {"Hellzel", "Ahmiracle", "Baby Girl", "Elizabreth", "Kaizyle"};

//        Write code that uses the index for statement to print out the bad baby names array from the arrays session

        for (int i = 0; i < badBabyNames.length; i++){
            System.out.println(badBabyNames[i]);
        }
//        Write code that uses the enhanced for statement to print out the bad baby names array from the arrays session
        for (String names: badBabyNames){
            System.out.println(names);
        }
    }
}