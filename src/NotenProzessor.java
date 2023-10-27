public class NotenProzessor {

    // Augabe 1 - A
    // Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die Rückgabewert soll die Methode
    // ein Array mit nicht ausreichende Note liefern.
    public int[] nichtAusreichendeNoten(int[] note) {
        for (int idx = 0; idx < note.length; idx++) {
            if (note[idx] < 0 || note[idx] > 100) {
                System.out.println("Noten sollen zwischen 0 und 100 sein");
                return null;
            }
        }

        int[] finaleNoten = new int[0];

        for (int idx = 0; idx < note.length; idx++) {
            if (round(note[idx]) < 40) {
                finaleNoten = addToArray(finaleNoten, round(note[idx]));
            }
        }

        return finaleNoten;
    }

    public int round(int note) {
        if (note < 38) {
            return note;
        } else {
            if (note % 5 > 2) {
                return note + 5 - note % 5;
            } else {
                return note;
            }
        }
    }

    public int[] addToArray(int[] original, int newElement) {
        int[] result = new int[original.length + 1];
        for ( int idx = 0; idx < original.length; idx++) {
            result[idx] = original[idx];
        }

        result[original.length] = newElement;
        return result;
    }

    // Augabe 1 - B
    // Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die Rückgabewert soll die Methode
    // den Durchschnittswert liefern.
    public int meanGrade(int[] note) {
        for (int idx = 0; idx < note.length; idx++) {
            if (note[idx] < 0 || note[idx] > 100) {
                System.out.println("Noten sollen zwischen 0 und 100 sein");
                return 0;
            }
        }

        int ct = 0;
        int gradeSum = 0;
        for (int idx = 0; idx < note.length; idx++) {
            gradeSum += note[idx];
            ct++;
        }

        return round(gradeSum / ct);
    }

    // Augabe 1 - C
    // Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die Rückgabewert soll die
    // Methode eine Array mit die abgerundeten Noten liefern.
    public int[] roundedGrades(int[] note) {
        for (int idx = 0; idx < note.length; idx++) {
            if (note[idx] < 0 || note[idx] > 100) {
                System.out.println("Noten sollen zwischen 0 und 100 sein");
                return null;
            }
        }

        int[] roundGrade = new int[note.length];
        for (int idx = 0; idx < note.length; idx++) {
            roundGrade[idx] = round(note[idx]);
        }

        return roundGrade;
    }

    // Augabe 1 - D
    // Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die Rückgabewert soll die
    // Methode die maximale abgerundete Note liefern.
    public int maxGrade(int[] note) {
        int maxGrade = Integer.MIN_VALUE;
        roundedGrades(note);

        for (int idx = 0; idx < note.length; idx++) {
            if (maxGrade < note[idx]) {
                maxGrade = note[idx];
            }
        }

        return maxGrade;
    }

    public int maxRoundedGrade(int[] note) {
        for (int idx = 0; idx < note.length; idx++) {
            if (note[idx] < 0) {
                return 0;
            }
        }
        int maxGrade = Integer.MIN_VALUE;

        for (int idx = 0; idx < note.length; idx++) {
            if (round(note[idx]) != note[idx] && round(note[idx]) > maxGrade ) {
                maxGrade = round(note[idx]);
            }
        }

        return maxGrade;
    }
}
