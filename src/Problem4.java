public class Problem4 {

    // Aufgabe 4 - A
    // Schreiben Sie eine Methode, die die billigste Tastatur zurückgibt.
    // z.B. [40 35 70 15 45] => 15
    public int cheapestKeyboard(int[] keyboards) {
        for (int idx = 0; idx < keyboards.length; idx++) {
            if (keyboards[idx] < 0) {
                return 0;
            }
        }

        int cheapest = Integer.MAX_VALUE;
        for (int idx = 0; idx < keyboards.length; idx++) {
            if (keyboards[idx] < cheapest) {
                cheapest = keyboards[idx];
            }
        }
        return cheapest;
    }

    // Aufgabe 4 - B
    // Schreiben Sie eine Methode, die die teuerste Gegenstand zurückgibt.
    // z.B. Tastatur = [15 20 10 35], USB = [20, 15, 40 15] => 40
    public int mostExpensiveItem(int[] keyboards, int[] USBdrive) {
        for (int idx = 0; idx < keyboards.length; idx++) {
            if (keyboards[idx] < 0) {
                return 0;
            }
        }

        for (int idx = 0; idx < USBdrive.length; idx++) {
            if (USBdrive[idx] < 0) {
                return 0;
            }
        }

        int mostExpensive = Integer.MIN_VALUE;
        for (int idx = 0; idx < keyboards.length; idx++) {
            if (keyboards[idx] > mostExpensive) {
                mostExpensive = keyboards[idx];
            }
        }

        for (int idx = 0; idx < USBdrive.length; idx++) {
            if (USBdrive[idx] > mostExpensive) {
                mostExpensive = USBdrive[idx];
            }
        }

        return mostExpensive;
    }

    // Aufgabe 4 - C
    // Schreiben Sie eine Methode, die die teuerste USB Laufwerk, die Markus kaufen kann,
    // zurückgibt.
    //z.B. Preise = [15 45 20], Budget = 30 => 20
    public int buyByBudget(int[] USBdrive, int budget) {
        for (int idx = 0; idx < USBdrive.length; idx++) {
            if (USBdrive[idx] < 0) {
                return 0;
            }
        }

        if (budget < 0)
            return 0;

        int item = Integer.MIN_VALUE;
        for (int idx = 0; idx < USBdrive.length; idx++) {
            if (USBdrive[idx] > item && USBdrive[idx] <= budget) {
                item = USBdrive[idx];
            }
        }

        return item;
    }

    // Aufgabe 4 - D
    // Finden Sie, anhand des Markus Budget und der Preislisten für die Tastaturen und
    // USB-Laufwerke, den Geldbetrag Markus ausgeben wird. Wenn er nicht genug für
    // beide hat, geben Sie stattdessen -1 zurück. Er kauft nur die zwei benötigten
    // Gegenstände.
    // z.B. b=60, tastaturen = [40 50 60] und usb Laufwerke = [8 12] => 50 + 8 = 58
    public int costs(int[] keyboards, int[] USBdrive, int budget) {

        for (int idx = 0; idx < keyboards.length; idx++) {
            if (keyboards[idx] < 0) {
                return 0;
            }
        }
        for (int idx = 0; idx < USBdrive.length; idx++) {
            if (USBdrive[idx] < 0) {
                return 0;
            }
        }
        if (budget < 0) {
            return 0;
        }

        int keyboard = Integer.MIN_VALUE;
        int drive = Integer.MIN_VALUE;
        int totalCost = 0;

        for (int idx = 0; idx < keyboards.length; idx++) {
            for (int index = 0; index < USBdrive.length; index++) {
                if ( keyboards[idx] + USBdrive[index] <= budget && keyboards[idx] + USBdrive[index] > totalCost) {
                    keyboard = keyboards[idx];
                    drive =USBdrive[index];
                    totalCost = keyboards[idx] + USBdrive[index];
                }
            }
        }

        if (totalCost != 0) {
            return totalCost;
        } else {
            return -1;
        }
    }
}
