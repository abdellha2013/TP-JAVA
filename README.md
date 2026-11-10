# TP N°1 — Les bases de Java

Travaux pratiques de Java portant sur les fondamentaux du langage : types primitifs,
conversions, opérateurs, structures de contrôle, tableaux et méthodes.

## Auteur

**DAIF Abdellah**
Étudiant en cycle ingénieur — Informatique, Logiciel et Intelligence Artificielle (ILIA)
Faculté des Sciences et Techniques (FST) Moulay Ismaïl — Errachidia

- E-mail : abde.daif@edu.umi.ac.ma
- LinkedIn : [Abdellah Daif](https://www.linkedin.com/in/abdellah-daif)

## Structure du projet

```
TP1/
├── Exercice1/   BaseLangegeJava.java
├── Exercice2/   intersectPoint.java
├── Exercice3/   solveEquation2.java
├── Exercice4/   operationsArethmetique.java
├── Exercice5/   mention.java
├── Exercice6/   avgNotes.java · avgNotesWithTable.java
├── Exercice7/   sumMatrice.java
├── Exercice8/   Devinette.java · DevinetteOrionter.java
├── TP N1 - Solutions.pdf
└── README.md
```

## Contenu des exercices

| # | Fichier | Objectif | Notions clés |
|---|---------|----------|--------------|
| 1 | `BaseLangegeJava.java` | Analyse des types, conversions et opérateurs | Types primitifs, promotion numérique, cast, `++`/`--`, affectations composées (`+=`, `*=`…) |
| 2 | `intersectPoint.java` | Point d'intersection de deux droites affines `y = ax + b` | `Scanner`, conditions, `String.format` |
| 3 | `solveEquation2.java` | Résolution de `ax² + bx + c = 0` | Discriminant, `Math.sqrt`/`Math.pow`, méthodes, cas dégénérés |
| 4 | `operationsArethmetique.java` | Calculatrice `+ - * /` | `switch`, division entière, reste `%`, gestion de la division par zéro |
| 5 | `mention.java` | Afficher la mention d'une note dans `[0,20]` | Opérateurs ternaires imbriqués, validation |
| 6 | `avgNotes.java` | Moyenne d'un nombre inconnu de notes | Boucles `do/while`, min/max, saisie contrôlée |
| 6 | `avgNotesWithTable.java` | Même calcul avec un nombre de notes connu | Tableaux `float[]`, parcours, position du min/max |
| 7 | `sumMatrice.java` | Somme de deux matrices `n × p` | Tableaux 2D, méthodes, vérification des dimensions |
| 8 | `Devinette.java` | Deviner un nombre aléatoire entre 0 et 10 | `Math.random`, boucle, compteur d'essais |
| 8 | `DevinetteOrionter.java` | Devinette guidée de 0 à 50 avec essais limités | Indices « trop grand / trop petit », limite d'essais, boucle `for` |

## Prérequis

- JDK 8 ou supérieur (`javac` et `java` dans le `PATH`).
- Vérification : `java -version`.

## Compilation et exécution

Les classes sont déclarées dans des packages (`Exercice1`, `Exercice2`, …). Il faut donc
se placer **à la racine du dossier `TP1`** puis compiler et exécuter en utilisant le nom
qualifié de la classe.

```bash
# Exercice 1
javac Exercice1/BaseLangegeJava.java
java Exercice1.BaseLangegeJava

# Exercice 2
javac Exercice2/intersectPoint.java
java Exercice2.intersectPoint

# Exercice 3
javac Exercice3/solveEquation2.java
java Exercice3.solveEquation2

# Exercice 4
javac Exercice4/operationsArethmetique.java
java Exercice4.operationsArethmetique

# Exercice 5
javac Exercice5/mention.java
java Exercice5.mention

# Exercice 6
javac Exercice6/avgNotes.java
java Exercice6.avgNotes
javac Exercice6/avgNotesWithTable.java
java Exercice6.avgNotesWithTable

# Exercice 7
javac Exercice7/sumMatrice.java
java Exercice7.sumMatrice

# Exercice 8
javac Exercice8/Devinette.java
java Exercice8.Devinette
javac Exercice8/DevinetteOrionter.java
java Exercice8.DevinetteOrionter
```

> Remarque : le dossier `TP N1 - Solutions.pdf` contient l'énoncé et les corrigés de
> référence. Le code de ce dépôt correspond à la mise en pratique de ces exercices.

## Détails notables de l'implémentation

- **Exercice 1** : plusieurs instructions sont volontairement commentées car invalides
  (conversions impossibles par affectation) ; le programme illustre les règles de
  promotion numérique et les types résultats de chaque expression.
- **Exercice 2** : traite les trois cas (droites sécantes, parallèles, confondues).
- **Exercice 3** : gère les cas `a = 0`, `Δ < 0`, `Δ = 0` et `Δ > 0`.
- **Exercice 4** : la division demande si le calcul doit être entier (affichage du reste)
  ou réel, avec protection contre la division par zéro.
- **Exercice 5** : mentions `Médiocre`, `Faible`, `Passable`, `Assez bien`, `Bien`,
  `Très bien`, et `Erreur` hors de `[0,20]`.
- **Exercice 6** : deux versions, sans tableau (nombre de notes inconnu) et avec tableau
  (nombre connu + position de la meilleure et de la plus faible note).
- **Exercice 7** : vérifie que les deux matrices ont la même dimension avant l'addition.
- **Exercice 8** : version simple (0–10) et version orientée (0–50, indices, limite
  d'essais configurable par l'utilisateur).
