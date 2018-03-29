public class Main {
    public static void main(String[] args) {
/*        int tabA[] = {5, 3, 7, 7, 10};
        int tabB[] = {1, 6, 6, 9, 9};

        int tabA[] = {5, 3};
        int tabB[] = {1, 6};*/

/*        int tabA[] = {5, 3, 7, 7, 10, 10, 11, 16, 16, 18, 23, 24, 28, 26};
        int tabB[] = {1, 6, 6, 9, 9, 12, 15, 14, 20, 21, 20, 22, 25, 30};*/
        int tabA[] = {5, 3, 7, 8, 10};
        int tabB[] = {1, 6, 6, 9, 9};


        ArraysToModify arrays = new ArraysToModify();
        int numberOfActions;
        if (arrays.ifArrayLengthEqualTwo(tabA)) {
            numberOfActions = arrays.modifyArraysForTwoElements(tabA, tabB);
        } else {
            numberOfActions = arrays.checkThreeElement(tabA, tabB);
        }
        if (numberOfActions > 0.5 * tabA.length) {
            numberOfActions = tabA.length - numberOfActions;
        }
        System.out.println("Number of exchanges: " + numberOfActions);
    }
}
