# ⚙️ Algorithmus

Dieses Repository enthält die Implementierungen klassischer **Sortier- und Suchalgorithmen** in **Java**.  
Das Ziel dieses Projekts ist es, die **Funktionsweise, Komplexität und Unterschiede** der wichtigsten Algorithmen zu verstehen und anhand praktischer Beispiele zu demonstrieren.

---

## 📁 Projektstruktur

```

Algorithmus/
├── BinarySearch.java      # Implementierung der binären Suche
├── BubbleSort.java        # Implementierung des Bubble-Sort-Algorithmus
├── InsertionSort.java     # Implementierung des Insertion-Sort-Algorithmus
├── QuickSort.java         # Implementierung des Quick-Sort-Algorithmus
├── SelectionSort.java     # Implementierung des Selection-Sort-Algorithmus
└── README.md              # Diese Datei

````

---

## 🧠 Lernziele

- Verständnis grundlegender **Sortieralgorithmen**  
- Vergleich von **Zeitkomplexität** und **Effizienz**  
- Implementierung der **binären Suche**  
- Erlernen rekursiver und iterativer Verfahren  
- Analyse des **Verhaltens bei kleinen und großen Datenmengen**

---

## 🔍 Implementierte Algorithmen

### 🔹 **Bubble Sort**
Vergleicht benachbarte Elemente und vertauscht sie, falls sie in der falschen Reihenfolge sind.  
Einfach, aber ineffizient bei großen Datenmengen.

**Komplexität:**  
- Best Case: O(n)  
- Average/Worst Case: O(n²)

---

### 🔹 **Selection Sort**
Sucht das kleinste Element und platziert es an der richtigen Position.  
Reduziert die Anzahl der Vertauschungen, aber bleibt ineffizient für große Listen.

**Komplexität:**  
- Best/Average/Worst Case: O(n²)

---

### 🔹 **Insertion Sort**
Fügt Elemente schrittweise in eine sortierte Teilliste ein.  
Effizient für kleine oder fast sortierte Datensätze.

**Komplexität:**  
- Best Case: O(n)  
- Worst Case: O(n²)

---

### 🔹 **Quick Sort**
Teilt die Liste in zwei Hälften (Pivot-Prinzip) und sortiert rekursiv.  
Sehr effizient und weit verbreitet in modernen Sortierverfahren.

**Komplexität:**  
- Best/Average Case: O(n log n)  
- Worst Case: O(n²)

---

### 🔹 **Binary Search**
Sucht ein Element in einer **sortierten Liste** durch wiederholte Halbierung des Suchraums.  
Deutlich schneller als lineare Suche.

**Komplexität:**  
- O(log n)

---

## ▶️ Ausführung

Kompiliere und starte eine beliebige Datei in der Konsole:

```bash
javac QuickSort.java
java QuickSort
````

Oder führe sie direkt in einer IDE (z. B. IntelliJ IDEA, Eclipse oder VS Code) aus.

---

## 💡 Beispielausgabe (QuickSort.java)

```text
Unsortiertes Array: [9, 2, 5, 1, 7]
Sortiertes Array:   [1, 2, 5, 7, 9]
```

---

## 📊 Vergleich der Komplexitäten

| Algorithmus    | Best Case  | Average Case | Worst Case | Stabil | In-Place |
| -------------- | ---------- | ------------ | ---------- | ------ | -------- |
| Bubble Sort    | O(n)       | O(n²)        | O(n²)      | ✅      | ✅        |
| Selection Sort | O(n²)      | O(n²)        | O(n²)      | ❌      | ✅        |
| Insertion Sort | O(n)       | O(n²)        | O(n²)      | ✅      | ✅        |
| Quick Sort     | O(n log n) | O(n log n)   | O(n²)      | ❌      | ✅        |
| Binary Search  | —          | O(log n)     | O(log n)   | —      | —        |


## 🧑‍💻 Autor

**Obai Albek**
Student der Informatik – TH Mannheim
GitHub: [ObaiAlbek](https://github.com/ObaiAlbek)


Möchtest du, dass ich zusätzlich ein **Diagramm oder Pseudocode** (z. B. QuickSort-Schritte als ASCII oder Markdown-Flow) in das README einfüge, damit es visuell ansprechender aussieht?
```
