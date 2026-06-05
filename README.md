# Design and Analysis of Algorithms (DAA) Lab 💻

This repository contains my Java implementations for the 4th Semester Computer Science & Engineering (CSE) **Design and Analysis of Algorithms Lab** coursework at **University Visvesvaraya College of Engineering (UVCE), Bangalore**.

## 🚀 Lab Objectives
The primary focus of this lab is to design, implement, and analyze the mathematical and structural complexities of standard computer science algorithms using diverse design paradigms.

---

## 🛠️ Paradigms Covered & Program Index

### 1. Divide and Conquer
Breaking a complex problem into smaller independent sub-problems, solving them recursively, and combining their results.
* `TowerOfHanoi.java` — Classical recursive mathematical game.
* `sorting/` — Folder containing core divide-and-conquer sorting implementations (e.g., Merge Sort, Quick Sort).
* `factorial/` & `fibonacci/` & `GCD/` — Mathematical algorithms utilizing foundational recursion structures.

### 2. Decrease and Conquer
Reducing a large problem instance to a single, smaller instance of the exact same problem.
* `UniqueElementArray.java` — Element uniqueness checking.
* `LinearSearch.java` — Sequential scanning of list spaces.
* `Topo.java` — Topological Sorting for Directed Acyclic Graphs (DAGs).

### 3. Greedy Paradigm
Making locally optimal choices at each stage with the hope of finding a global optimum.
* `Prims.java` — Prim's Algorithm for Minimum Spanning Trees (MST).
* `Krushkals.java` — Kruskal's Algorithm for Minimum Spanning Trees using disjoint sets.

### 4. Dynamic Programming
Solving complex problems by breaking them down into overlapping sub-problems, computing them once, and storing their results.
* `Knapsack.java` — The classical 0/1 Knapsack optimization problem.

### 5. Backtracking & Brute Force
Exploring all possible state spaces systematically to locate valid configurations or absolute optimal paths.
* `NQueens_14.java` — N-Queens constraint satisfaction puzzle mapping.
* `TSPExp.java` — Traveling Salesperson Problem exact evaluation.
* `graph/` & `pattern/` — Structural tree traversals and string-matching/matrix patterns.
* `PrimeNumbers.java` — Basic prime generation evaluations.

---

## 📐 Algorithmic Complexity Profiles Reference

| Program / Algorithm | Design Paradigm | Time Complexity (Worst-Case) | Space Complexity |
| :--- | :--- | :--- | :--- |
| **Tower of Hanoi** | Divide and Conquer | $\mathcal{O}(2^n)$ | $\mathcal{O}(n)$ |
| **Prim's Algorithm** | Greedy Approach | $\mathcal{O}(V^2)$ or $\mathcal{O}(E \log V)$ | $\mathcal{O}(V)$ |
| **Kruskal's Algorithm** | Greedy Approach | $\mathcal{O}(E \log E)$ or $\mathcal{O}(E \log V)$ | $\mathcal{O}(V + E)$ |
| **0/1 Knapsack** | Dynamic Programming | $\mathcal{O}(n \cdot W)$ | $\mathcal{O}(n \cdot W)$ |
| **N-Queens Puzzle** | Backtracking | $\mathcal{O}(n!)$ | $\mathcal{O}(n)$ |
| **Traveling Salesperson (TSP)** | Brute Force / Complete Expl. | $\mathcal{O}(n!)$ or $\mathcal{O}(2^n \cdot n^2)$ | $\mathcal{O}(n^2)$ |
| **Topological Sort** | Decrease and Conquer (DFS-based) | $\mathcal{O}(V + E)$ | $\mathcal{O}(V)$ |

---

## 💻 Compilation & Execution

To compile and run any individual program locally, use your terminal bash layout:

```bash
# Example: Running the Prim's algorithm script
javac Prims.java
java Prims
