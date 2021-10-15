package pt.genesis.studio.pokemon;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
	private static Set<Position> movesMemory;
	private static BigInteger pokemons;
	private static Position currentPosition;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("What will be your moviments?");
				System.out.println(pokemonsCatch(scanner.nextLine()));
			}
		}
	}

	public static BigInteger pokemonsCatch(String moviments) {
		startCatch();
		moviments.toUpperCase().chars().forEachOrdered((p) -> goTo((char) p));

		return pokemons;
	}

	private static void goTo(char direction) {
		boolean directionOk = true;

		switch (direction) {
		case 'N':
			currentPosition.setY(currentPosition.getY().add(BigInteger.ONE));
			break;
		case 'S':
			currentPosition.setY(currentPosition.getY().subtract(BigInteger.ONE));
			break;
		case 'E':
			currentPosition.setX(currentPosition.getX().add(BigInteger.ONE));
			break;
		case 'O':
			currentPosition.setX(currentPosition.getX().subtract(BigInteger.ONE));
			break;
		default:
			directionOk = false;
		}

		if (directionOk) {
			boolean added = movesMemory.add(currentPosition);
			if (added) {
				pokemons = pokemons.add(BigInteger.ONE);
			}
		}
	}

	private static void startCatch() {
		movesMemory = new HashSet<>();
		currentPosition = new Position(BigInteger.ZERO, BigInteger.ZERO); // initial position
		pokemons = BigInteger.ONE; // pokemon at initial position
		movesMemory.add(currentPosition); // add initial position in the memory
	}

}
