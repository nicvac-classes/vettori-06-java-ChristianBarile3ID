import java.util.Scanner;

class Esercizio {

    public static void main(String args[])
    {
        int nAtleti, i, iMin;
        Scanner in = new Scanner( System.in );
        System.out.println("Quanti atleti partecipano a questa competizione?");
        nAtleti = in.nextInt;
        String [] nomi = new String [nAtleti];
        String [] nazionali = new String [nAtleti];
        float [] tempi = new float [nAtleti];
        i = 0;
        while (i<nomi.length) {
            System.out.println("Come si chiama l'atleta numero " + i+1 + "?");
            nomi[i] = in.next;
            System.out.println("Da quale nazione proviene?");
            nazionali[i] = in.next();
            tempi[i] = (Math.random()*1300/100)+5;
            i++
        }
        i = 0;
        iMin = 0;
        while (i<tempi.length) {
            if (tempi[i] < tempi[iMin]) {
                iMin = i;
            }
            i++;
        }
        System.out.println("Il vincitore della gara è " + nomi[iMin] + " proveniente dalla nazione " + nazionali[iMin] + " che ha finito la gara in " ++ tempi[iMin] + " secondi"); 
        

//LEGGERE LE ISTRUZIONI NEL FILE README.md
