package Loops.tasks;

public class NestedForMonths {
    public static void main(String[] args) {
        /*


2020 --> 1 January --> 2 February --> 3 March --> 4 April --> 5 May --> 6 June --> 7 July --> 8 August --> 9 September --> 10 October --> 11 November --> 12 December
2021 --> 1 January --> 2 February --> 3 March --> 4 April --> 5 May --> 6 June --> 7 July --> 8 August --> 9 September --> 10 October --> 11 November --> 12 December
2022 --> 1 January --> 2 February --> 3 March --> 4 April --> 5 May --> 6 June --> 7 July --> 8 August --> 9 September --> 10 October --> 11 November --> 12 December
2023 --> 1 January --> 2 February --> 3 March --> 4 April --> 5 May --> 6 June --> 7 July --> 8 August --> 9 September --> 10 October --> 11 November --> 12 December
         */



for (int year = 2020; year <= 2023; year ++) {
        System.out.print(year);
        for (int month = 1; month <= 12; month++) {

            System.out.print(" --> " + month);
            switch (month){
                case 1: System.out.print(" January"); break;
                case 2: System.out.print(" February"); break;
                case 3: System.out.print(" March"); break;
                case 4: System.out.print(" April"); break;
                case 5: System.out.print(" May"); break;
                case 6: System.out.print(" June"); break;
                case 7: System.out.print(" July"); break;
                case 8: System.out.print(" August"); break;
                case 9: System.out.print(" September"); break;
                case 10: System.out.print(" October"); break;
                case 11: System.out.print(" November"); break;
                case 12: System.out.print(" December"); break;
            }
        }
        System.out.println();

     }
    }
}

