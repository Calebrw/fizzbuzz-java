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

import org.jetbrains.annotations.Contract;

import java.io.IOException;

/**
 * The FizzBuzz class of the FizzBuzz application
 * <p>
 * Created by Caleb on 10/13/2016.
 */
public class FizzBuzz {

    /**
     * The Fizz String
     */
    private static final String fizz = "Fizz";

    /**
     * The Buzz String
     */
    private static final String buzz = "Buzz";

    /**
     * The FizzBuzz String
     */
    private static final String fizzBuzz = fizz + buzz;

    /**
     * The number of iterations to process. Set via constructor.
     */
    private int iterations;

    /**
     * The FizzBuzz constructor. Set the iterations of process.
     *
     * @param iterations The number of iterations to process.
     * @throws IOException If the number is 0 or less.
     */
    public FizzBuzz(final int iterations) throws IOException {

        if (iterations <= 0) {
            throw new IOException("The input iterations value is invalid as it too small.");
        } else {
            this.iterations = iterations;
        }

    }

    /**
     * Generate the FizzBuzz String
     *
     * @return The FizzBuzz String
     */
    String generate() {

        String result = "";
        for (int i = 1; i < this.iterations; i++) {
            result += FizzBuzzCheck(i) + " ";
        }
        return result;

    }

    /**
     * Return a "Fizz" or a "Buzz" or a "FizzBuzz" string
     * depending on the input variable.
     *
     * @param input The input to check.
     * @return The result string.
     */
    @Contract(pure = true)
    private static String FizzBuzzCheck(int input) {

        if ((input % 15) == 0) return fizzBuzz; // Return FizzBuzz
        if ((input % 5) == 0) return buzz; // Return Buzz
        if ((input % 3) == 0) return fizz; // Return Fizz
        else return Integer.toString(input); // Return the original input

    }

}
