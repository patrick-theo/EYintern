package day13_test;

import java.util.*;

/*
 *  A. Fragment I compiles
 *  C. Fragment III compiles
 * D. Fragment I executes without exception
 *  F. Fragment III executes without exception 
 */

public class Pro9 {

	 public static void main(String[] args) { 
	 Object o = new Object(); 
	 LinkedHashSet s = new LinkedHashSet();
	 s.add("o"); 
	 s.add(o); 
	 } 
	 }