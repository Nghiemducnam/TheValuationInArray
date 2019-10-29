import java.util.Scanner;

public class TheValuationInArray {
    public static void main(String[] args) {
        String students [] = {"Nam", "Tùng", "Ngọc", "Hoa", "Dũng", "Đông", "Trung"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name's student:");
        String inputName = input.nextLine();

        boolean isExist = false;
        for (int i =0; i<students.length; i++) {
            if(students[i].equals(inputName)) {
                System.out.println("the position of student " +inputName + " in the list is " + (i+1));
                isExist = true;
                break;
            }
        } if(!isExist)
            System.out.println("not found " + inputName + " in the list");
    }
}
