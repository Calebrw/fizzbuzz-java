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
    private static final String FIZZ = "Fizz";

    /**
     * The Buzz String
     */
    private static final String BUZZ = "Buzz";

    /**
     * The FizzBuzz String
     */
    private static final String FIZZ_BUZZ = FIZZ + BUZZ;

    /**
     * The number of iterations to process. Set via constructor.
     */
    private final int iterations;

    /**
     * The FizzBuzz constructor. Set the iterations of process.
     *
     * @param i The number of iterations to process.
     * @throws IOException If the number is 0 or less.
     */
    public FizzBuzz(final int i) throws IOException {

        if (i <= 0) {
            throw new IOException("The input iterations value is invalid as it too small.");
        } else {
            this.iterations = i + 1;
        }

    }

    /**
     * Generate the FizzBuzz String
     *
     * @return The FizzBuzz String
     */
    public final StringBuilder generate() {

        final StringBuilder result = new StringBuilder(0);
        int i = 1;
        while (i < this.iterations) {
            result.append(fizzBuzzCheck(i));
            if ((this.iterations - 1) != i) {
                result.append(' ');
            }
            i++;
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
    private static String fizzBuzzCheck(final int input) {

        if ((input % 15) == 0) return FIZZ_BUZZ; // Return FizzBuzz
        if ((input % 5) == 0) return BUZZ; // Return Buzz
        if ((input % 3) == 0) return FIZZ; // Return Fizz
        else return Integer.toString(input); // Return the original input

    }

}
