public class ArraysToModify {
    private int startIndex = 0;
    public boolean ifArrayLengthEqualTwo(int tabA[]) {
        int len = tabA.length;
        if (len == 2) {
            return true;
        }
        else {
            return false;
        }
    }

    public int checkThreeElement(int tabA[], int tabB[]) {
        int numberOfExchanges = 0;
        while (tabA.length - startIndex > 2) {
            int newTabA[] = new int[3];
            newTabA[0] = tabA[startIndex];
            newTabA[1] = tabA[startIndex+1];
            newTabA[2] = tabA[startIndex+2];
            int newTabB[] = new int[3];
            newTabB[0] = tabB[startIndex];
            newTabB[1] = tabB[startIndex+1];
            newTabB[2] = tabB[startIndex+2];
            if (!(newTabA[0] < newTabA[1] && newTabB[0] < newTabA[1])) {    //jeśli warunek spełniony to zamiana elementów o ideksie 1
                exchangeElment(newTabA, newTabB, 1);
                updateArrays(tabA, tabB, newTabA, newTabB, 1);
                numberOfExchanges++;
            }
            if (!(newTabA[1] < newTabA[2] && newTabB[1] < newTabA[2])) {       //jeśli warunek spełniony to zamiana elementów o ideksie 2
                exchangeElment(newTabA, newTabB, 2);
                updateArrays(tabA, tabB, newTabA, newTabB, 2);
                numberOfExchanges++;
            }
            if (newTabA[1] == newTabA[2] && newTabB[0] == newTabB[1] || newTabB[1] == newTabB[2] && newTabA[0] == newTabA[1]) {
                exchangeElment(newTabA, newTabB, 1);
                updateArrays(tabA, tabB, newTabA, newTabB, 1);
                numberOfExchanges++;
            }
            if (newTabA[1] == newTabA[2] || newTabB[1] == newTabB[2]) {
                exchangeElment(newTabA, newTabB, 2);
                updateArrays(tabA, tabB, newTabA, newTabB, 2);
                numberOfExchanges++;
            }
            if (newTabA[0] == newTabA[1] || newTabB[0] == newTabB[1]) {
                exchangeElment(newTabA, newTabB, 1);
                updateArrays(tabA, tabB, newTabA, newTabB, 1);
                numberOfExchanges++;
            }
            showTabs(newTabA,newTabB);
            System.out.println();
            startIndex++;
        }
        return numberOfExchanges;
    }

    public void exchangeElment(int newTabA[], int newTabB[], int index) {
        int tmp = newTabA[index];
        newTabA[index] = newTabB[index];
        newTabB[index] = tmp;
    }

    public void updateArrays(int tabA[], int tabB[], int newTabA[], int newTabB[], int index) {
        tabA[startIndex+index] = newTabA[index];
        tabB[startIndex+index] = newTabB[index];
    }


    public void showTabs(int tabA[], int tabB[]) {
        System.out.println();
        for (int elementA: tabA) {
            System.out.print(elementA + ", ");
        }
        System.out.println();
        for (int elementB : tabB) {
            System.out.print(elementB + ", ");
        }
    }

    public int modifyArraysForTwoElements(int tabA[], int tabB[]) {
        if (!(tabA[0] < tabA[1])){
            exchangeElment(tabA, tabB, 0);
            showTabs(tabA, tabB);
            return 1;
        } else {
            return 0;
        }
    }
}

