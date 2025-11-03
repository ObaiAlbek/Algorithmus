package Algorithmus.SortierAlgorithmus;

public class QuickSort {
	/* - Zeitkomplexität von O(n log n) im Durchschnitt und O(n^2) im schlechtesten Fall
	 * - Raumkomplexität (Space) O(log n) für den Aufrufstack bei der rekursiven Implementierung
	 * - Prinzip: Divide (Teilen) und Conquer (Erobern)
	 * 	Divide (Teilen): Wähle ein Pivot-Element und teile das Array in zwei Teile: 
	 * 	                - Elemente kleiner als das Pivot auf der linken Seite,
	 * 	                - Elemente größer als das Pivot auf der rechten Seite.
	 * 	Conquer (Erobern): Wende Quick Sort rekursiv auf die beiden Teilarrays an.
	 *  - Keine explizite Merge-Phase: Im Gegensatz zu Merge Sort führt Quick Sort das Sortieren während des Teilens durch, daher gibt es keine separate Zusammenführungsphase.
	 */

	 public static void main(String[] args) {
	        int arr[] = {12, 11, 13, 5, 6, 7}; // Initialisiere ein Array mit unsortierten Werten
	        quickSort(arr, 0, arr.length - 1); // Rufe Quick Sort auf dem gesamten Array auf
	        
	        // Ausgabe des sortierten Arrays
	        System.out.println("Sortiertes Array:");
	        for (int i : arr) 
	            System.out.print(i + " ");
	    }
	    
	    // Quick Sort Methode
	    public static void quickSort(int arr[], int anfang, int end) {
	        if (anfang < end) { // Bedingung zur Fortsetzung der Rekursion, solange das Teilarray mehr als ein Element enthält
	            int pivo = partition(arr, anfang, end); // Finde das Pivot-Element und teile das Array
	            quickSort(arr, anfang, pivo - 1); // Sortiere das linke Teilarray
	            quickSort(arr, pivo + 1, end); // Sortiere das rechte Teilarray
	        }
	    }
	    
	    // Partitionierungsfunktion, die das Array um das Pivot-Element herum aufteilt
	    static int partition(int arr[], int anfang, int end) {
	        int pivo = anfang; // Wähle das erste Element als Pivot
	        while (true) { // Endlosschleife, die durch 'break' unterbrochen wird
	            // Finde die Position von 'end' für den ersten Wert, der kleiner ist als das Pivot
	            while (arr[pivo] <= arr[end] && pivo != end) 
	                end--; // Bewege den 'end'-Zeiger nach links
	            
	            if (pivo == end) // Wenn 'pivo' und 'end' gleich sind, ist die Partitionierung abgeschlossen
	                break;
	            else if (arr[pivo] > arr[end]) { // Wenn das Pivot größer ist, tausche die Werte
	                int temp = arr[end]; // Tausche den Wert von arr[pivo] mit arr[end]
	                arr[end] = arr[pivo];
	                arr[pivo] = temp;
	                pivo = end; // Setze 'pivo' auf die neue Position
	            }
	            
	            // Finde die Position von 'anfang' für den ersten Wert, der größer ist als das Pivot
	            while (arr[pivo] >= arr[anfang] && pivo != anfang)
	                anfang++; // Bewege den 'anfang'-Zeiger nach rechts
	            
	            if (pivo == anfang) // Wenn 'pivo' und 'anfang' gleich sind, ist die Partitionierung abgeschlossen
	                break;
	            else if (arr[pivo] < arr[anfang]) { // Wenn das Pivot kleiner ist, tausche die Werte
	                int temp = arr[anfang]; // Tausche den Wert von arr[pivo] mit arr[anfang]
	                arr[anfang] = arr[pivo];
	                arr[pivo] = temp;
	                pivo = anfang; // Setze 'pivo' auf die neue Position
	            }
	        }
	        
	        return pivo; // Gib die neue Position des Pivot-Elements zurück
	    }
	
}
