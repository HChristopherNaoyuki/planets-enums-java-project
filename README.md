# Planets Enum Java Program

A simple Java program that uses an enum to represent the planets in our solar system. The program checks whether living on a given planet is possible and outputs details about the planet, including its number in the solar system.

## Features

- **Enum Representation**: The planets of the solar system are represented using an enum, with each planet assigned a unique number.
- **Planet Check**: The program checks if it is possible to live on a specified planet. Currently, only Earth is considered habitable.
- **Planet Information**: Each planet is associated with its position in the solar system, which is displayed when the program is run.

## How It Works

1. **Planets Enum**: Each planet is an enum constant with an associated integer (its position in the solar system).
2. **Main Program**: The main program sets a planet (e.g., `Planets.EARTH`) and passes it to the `canILiveHere()` method.
3. **Switch-Case Logic**: The program uses a switch-case statement to determine if living on the specified planet is possible and outputs relevant information.

### Example Output

If you set the planet to Earth (`Planets.EARTH`), the output will be:

```
You can live here.
Planet #3
```

For any other planet (e.g., `Planets.MARS`), the output will be:

```
You can not live here.
Planet #4
```

## Requirements

- Java 8 or higher

## How to Run

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/planets-enums-java-project.git
   ```

2. Navigate to the project folder:
   ```bash
   cd planets-enum-java
   ```

3. Compile and run the program:
   ```bash
   javac Main.java
   java Main
   ```

---
