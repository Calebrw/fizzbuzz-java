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

package com.github.calerw.fizzBuzzTest;

import com.github.calebrw.fizzbuzz.FizzBuzz;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by Caleb on 10/13/2016.
 */
public class FizzBuzzTest {

    /**
     * Tests the {@link FizzBuzz#generate()} method
     *
     * @throws IOException
     */
    @Test
    public void testGenerate() throws IOException {
        FizzBuzz fizzBuzz1 = new FizzBuzz(1);
        FizzBuzz fizzBuzz2 = new FizzBuzz(10);
        FizzBuzz fizzBuzz3 = new FizzBuzz(100);

        assertEquals(fizzBuzz1.generate(), "1 ");
        assertEquals(fizzBuzz2.generate(), "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz ");
        assertEquals(fizzBuzz3.generate(), "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 FizzBuzz 46 47 Fizz 49 Buzz Fizz 52 53 Fizz Buzz 56 Fizz 58 59 FizzBuzz 61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz 73 74 FizzBuzz 76 77 Fizz 79 Buzz Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz 91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz ");
    }

}