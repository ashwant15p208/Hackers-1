import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RollNumber {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Roll Number : ");
        // Removing Space & converting to UPPER
        String rollNumber = input.readLine().replaceAll(" ", "").toUpperCase();
        boolean flag = false;
        int yearOfEntry = 0, yearOfPass = 0;
        String department = null;
        char section = 0;
        while(true) {
            if(rollNumber.length() == 6) {
                yearOfEntry = Integer.valueOf(rollNumber.substring(0, 2));
                int sec = Integer.valueOf("" + rollNumber.charAt(3));
                if(sec == 1 || sec == 2 || sec == 3) {
                    yearOfPass = yearOfEntry + 4;
                } else if(sec == 5 || sec == 6 || sec == 7) {
                    yearOfPass = yearOfEntry + 3;
                } else {
                    // if not a right section then it sets flag true and breaks loop while
                    flag = true;
                    break;
                } 
                switch(sec) {
                    case 1:
                    case 5:
                        section = 'A';
                        break;
                    case 2:
                    case 6:
                        section = 'B';
                        break;
                    case 3:
                    case 7:
                        section = 'C';
                        break;
                    default:
                        flag = true;
                        break;
                }
                if(flag)
                    break;
                switch(rollNumber.charAt(2)) {
                    case 'P':
                        department = "CSE";
                        break;
                    case 'T':
                        department = "ETE";
                        break;
                    case 'E':
                        department = "EEE";
                        break;
                    case 'L':
                        department = "ECE";
                        break;
                    case 'N':
                        department = "EIE";
                        break;
                    case 'M':
                        department = "MECH";
                        break;
                    case 'A':
                        department = "AUTO";
                        break;
                    case 'F':
                        department = "IT";
                        break;
                    case 'C':
                        department = "CIVIL";
                        break;
                    default:
                        flag = true;
                        break;
                }
                if(true)
                    break;
            } else {
                flag = true;
                break;
            }
        }
        if(!flag) {
            System.out.println(String.format("%-20s : %s", "Year of Entry", "20" + yearOfEntry));
            System.out.println(String.format("%-20s : %s", "Year of Pass", "20" + yearOfPass));
            System.out.println(String.format("%-20s : %s", "Department", department));
            System.out.println(String.format("%-20s : %s", "Section", section));
            System.out.println(String.format("%-20s : %s", "Roll Number", rollNumber.substring(4)));
        } else {
            System.out.println("Invalid Roll Number");
        }
    }
}
