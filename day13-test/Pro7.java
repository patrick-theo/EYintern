package day13_test;

public class Pro7{
	
}
interface Hungry<E> { void munch(E x); } 
interface Carnivore<E extends Animal> extends Hungry<E> {} 
interface Herbivore<E extends Animal> extends Hungry<E> {} //Change extends to animal
abstract class Plant {} 
class Grass extends Plant {} 
abstract class Animal {} 
class Sheep extends Animal implements Herbivore<Sheep> { 
public void munch(Sheep x) {} 
} 
class Wolf extends Animal implements Carnivore<Sheep> { 
public void munch(Sheep x) {} 
}