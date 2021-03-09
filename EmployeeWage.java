public class EmployeeWage {
        public static void main(String[] args){
        // Constraints
        int Is_Full_Time = 1;
                //Computation
                double empCheck = Math.floor(Math.random() * 10) %2;
                if (empCheck == Is_Full_Time)
                        System.out.println("Employee Present");
                else
                        System.out.println("Employee Abscent");
        }
}
