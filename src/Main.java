//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int counter = 10;

           //Outer loops for rows
        for(int i = 0; i <= 3; i++) {

          //Inner loops for columns
            for (int j = 0; j <= 3; j++){
                System.out.print(counter + " ");
                counter++;
            }
            
//Move to the next line after printing all columns in the current row
            System.out.println();

        }
    }
}