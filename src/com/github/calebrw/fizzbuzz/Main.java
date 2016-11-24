/*
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.github.calebrw.fizzbuzz;

import java.io.IOException;
import java.util.Scanner;

/**
 * The Main class of the FizzBuzz application
 * <p>
 * Created by Caleb on 10/13/2016.
 */
public class Main {

    public static void main(String[] args) {

        try {

            final Scanner scanner = new Scanner(System.in);
            System.out.println("How many numbers would you like to check? ");
            final int i = scanner.nextInt();

            final FizzBuzz fizzBuzz = new FizzBuzz(i);
            final StringBuilder result = fizzBuzz.generate();
            System.out.println(result);
        } catch (final IOException ioe) {
            ioe.printStackTrace();
        }

    }

}
